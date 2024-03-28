package org.example.business.bank;

import org.example.business.process.ProcessService;
import org.example.storage.account.AccountRepository;

public class CowBankService implements BankService {

  private final AccountRepository accountRepository;

  public CowBankService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public void createBankAccount() {

  }

  @Override
  public String getAccountInfo() {
    return null;
  }

  @Override
  public void withdraw() {

  }

  @Override
  public void deposit() {

  }

  @Override
  public void transfer() {

  }
}
