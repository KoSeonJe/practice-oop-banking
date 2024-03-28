package org.example.business.process;

import org.example.domain.BankProcess;
import org.example.domain.ProcessRequiredInfo;
import org.example.storage.process.ProcessRepository;

public class BankProcessService implements ProcessService{

  private final ProcessRepository processRepository;

  public BankProcessService(ProcessRepository processRepository) {
    this.processRepository = processRepository;
  }

  @Override
  public BankProcess create(int processNumber) {
    BankProcess bankProcess = BankProcess.create(processNumber);
    save(bankProcess);
    return bankProcess;
  }

  @Override
  public void save(BankProcess bankProcess) {
    processRepository.save(bankProcess);
  }

  @Override
  public void enterRequiredUserInfo(int processId, ProcessRequiredInfo userInfo) {
    BankProcess bankProcess = processRepository.findById(processId)
        .orElseThrow(() -> new IllegalArgumentException("해당 아이디로 process를 찾을 수 없습니다."));
    bankProcess.updateProcessRequiredInfo(userInfo);
  }
}
