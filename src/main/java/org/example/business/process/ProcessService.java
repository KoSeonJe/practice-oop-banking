package org.example.business.process;

import org.example.domain.BankProcess;
import org.example.domain.ProcessRequiredInfo;

public interface ProcessService {

  BankProcess create(int processNumber);

  void save(BankProcess bankProcess);

  void enterRequiredUserInfo(int processId, ProcessRequiredInfo userInfo);
}
