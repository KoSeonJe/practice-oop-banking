package org.example.business.bank;

import org.example.business.process.ProcessService;

public interface BankService {
  void createBankAccount();
  String getAccountInfo();
  void withdraw();
  void deposit();
  void transfer();
}
