package org.example.common.config;

import org.example.BankApplication;
import org.example.business.bank.CowBankService;
import org.example.business.process.BankProcessService;
import org.example.business.process.ProcessService;
import org.example.domain.ProcessRequiredInfo;
import org.example.storage.account.AccountRepository;
import org.example.business.bank.BankService;
import org.example.storage.account.InMemoryAccountRepository;
import org.example.storage.process.BankProcessRepository;
import org.example.storage.process.ProcessRepository;
import org.example.view.ApplicationConsoleView;
import org.example.view.ApplicationView;
import org.example.view.converter.StringToObjectConverter;
import org.example.view.converter.ProcessRequiredUserInfoStringToObjectConverter;

public class BankConfig {

  public BankApplication bankApplication() {
    return new BankApplication(applicationView(), bankService(), processService());
  }

  private ApplicationView applicationView() {
    return new ApplicationConsoleView(converter());
  }

  private BankService bankService() {
    return new CowBankService(accountRepository());
  }

  private ProcessService processService() {
    return new BankProcessService(processRepository());
  }

  private AccountRepository accountRepository() {
    return new InMemoryAccountRepository();
  }

  private ProcessRepository processRepository() {
    return new BankProcessRepository();
  }

  private StringToObjectConverter<ProcessRequiredInfo> converter() {
    return new ProcessRequiredUserInfoStringToObjectConverter();
  }
}
