package org.example.domain;

import java.math.BigDecimal;

public class ProcessRequiredInfo {

  private String name;

  private String myAccountNumber;

  private String sendingAccountNumber;

  private BigDecimal amount;

  public ProcessRequiredInfo(String name, String myAccountNumber, String sendingAccountNumber, BigDecimal amount) {
    this.name = name;
    this.myAccountNumber = myAccountNumber;
    this.sendingAccountNumber = sendingAccountNumber;
    this.amount = amount;
  }

  public static ProcessRequiredInfo createDepositInfo(String myAccountNumber, BigDecimal amount) {
    return new ProcessRequiredInfo(null, myAccountNumber, null, amount);
  }

  public static ProcessRequiredInfo createWithDrawInfo(String myAccountNumber, BigDecimal amount) {
    return new ProcessRequiredInfo(null, myAccountNumber, null, amount);
  }

  public static ProcessRequiredInfo createTransferInfo(String myAccountNumber, String sendingNumber, BigDecimal amount) {
    return new ProcessRequiredInfo(null, myAccountNumber, sendingNumber, amount);
  }

  public static ProcessRequiredInfo createAccountInfo(String myAccountNumber, String name) {
    return new ProcessRequiredInfo(name, myAccountNumber, null, null);
  }

  public static ProcessRequiredInfo createCheckingAccountInfo(String myAccountNumber, String name) {
    return new ProcessRequiredInfo(name, myAccountNumber, null, null);
  }
}
