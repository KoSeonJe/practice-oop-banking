package org.example.common.message;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankProcessNumberMessageTest {

  @DisplayName("number를 키로 가진 FinderMap을 이용해 RequestMessage를 반환한다.")
  @Test
  void test() {
    // given
    int processNumber = 1;
    String processRequestMessage = RequestMessage.REQUEST_DEPOSIT_INFO;
    // when
    String message = ProcessNumberMessage.getProcessRequestMessage(1);
    // then
    Assertions.assertEquals(processRequestMessage, message);
  }
}