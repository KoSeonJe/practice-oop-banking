package org.example.common.message;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ProcessNumberMessage {

  DEPOSIT(1, RequestMessage.REQUEST_DEPOSIT_INFO),
  WITHDRAW(2, RequestMessage.REQUEST_WITHDRAW_INFO),
  TRANSFER(3, RequestMessage.REQUEST_TRANSFER_INFO),
  CREATE_ACCOUNT(4,RequestMessage.REQUEST_CREATE_ACCOUNT_INFO),
  CHECK_ACCOUNT(5, RequestMessage.REQUEST_ACCOUNT_INFO);

  private static final Map<Integer, String> REQUEST_MESSAGE_FINDER_MAP =
      Collections.unmodifiableMap(Stream.of(values())
          .collect(Collectors.toMap(ProcessNumberMessage::getProcessNumber, ProcessNumberMessage::getRequestMessage)));

  private final int processNumber;
  private final String requestMessage;

  ProcessNumberMessage(int processNumber, String requestMessage) {
    this.processNumber = processNumber;
    this.requestMessage = requestMessage;
  }

  public int getProcessNumber() {
    return this.processNumber;
  }

  public String getRequestMessage() {
    return this.requestMessage;
  }

  public static String getProcessRequestMessage(int processNumber) {
    return REQUEST_MESSAGE_FINDER_MAP.get(processNumber);
  }
}
