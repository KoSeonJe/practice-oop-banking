package org.example.domain;

public class BankProcess {

  private int id;
  private int processNumber;
  private ProcessRequiredInfo processRequiredInfo;

  public BankProcess(int processNumber) {
    this.processNumber = processNumber;
  }

  public static BankProcess create(int processNumber) {
    return new BankProcess(processNumber);
  }

  public int getId() {
    return this.id;
  }

  public int getProcessNumber() {
    return this.processNumber;
  }

  public ProcessRequiredInfo getProcessRequiredInfo() {
    return this.processRequiredInfo;
  }

  public void updateId(int id) {
    this.id = id;
  }

  public void updateProcessRequiredInfo(ProcessRequiredInfo userInfo) {
    this.processRequiredInfo = userInfo;
  }
}
