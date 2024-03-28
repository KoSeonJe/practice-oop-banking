package org.example;

import org.example.common.config.BankConfig ;

public class Application {

  public static void main(String[] args) {
    BankConfig bankConfig = new BankConfig();
    BankApplication bankApplication = bankConfig.bankApplication();
    bankApplication.run();
  }
}