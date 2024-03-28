package org.example;

import org.example.business.bank.BankService;
import org.example.business.process.ProcessService;
import org.example.domain.BankProcess;
import org.example.domain.ProcessRequiredInfo;
import org.example.view.ApplicationView;

public class BankApplication {

  private final ApplicationView applicationView;
  private final BankService bankService;
  private final ProcessService processService;

  public BankApplication(ApplicationView applicationView, BankService bankService,
      ProcessService processService) {
    this.applicationView = applicationView;
    this.bankService = bankService;
    this.processService = processService;
  }

  public void run() {
    // 실행 프로세스 선택
    BankProcess bankProcess = selectProcess();

    // 프로세스에 필요한 사용자 정보 입력
    enterRequiredUserInfo(bankProcess);

    // 프로세스 실행
    runProcess();

    // 프레세스 결과
    printProcessResult();
  }

  private BankProcess selectProcess() {
    int processNumber = applicationView.getProcessNumber();
    BankProcess bankProcess = processService.create(processNumber);
    return bankProcess;
  }

  private void enterRequiredUserInfo(BankProcess bankProcess) {
    ProcessRequiredInfo userInfo = applicationView.getRequiredUserInfo(bankProcess.getProcessNumber());
    processService.enterRequiredUserInfo(bankProcess.getId(), userInfo);
  }

  private void runProcess() {

  }

  private void printProcessResult() {

  }
}
