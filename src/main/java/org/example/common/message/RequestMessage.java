package org.example.common.message;

public class RequestMessage {

  public static final String REQUEST_PROCESS_NUMBER = "원하시는 서비스의 번호를 선택해주세요.";
  public static final String PROCESS_OPTION = "1.입금 / 2.출금 / 3.송금 / 4.계좌 생성 / 5.계좌 정보 확인";
  public static final String REQUEST_DEPOSIT_INFO = "입금할 계좌와 금액을 순서대로 입력해주세요.";
  public static final String REQUEST_WITHDRAW_INFO = "출금할 계좌와 금액을 순서대로 입력해주세요.";
  public static final String REQUEST_TRANSFER_INFO = "송금할 계좌와 송금되는 계좌 그리고 금액을 순서대로 입력해주세요.";
  public static final String REQUEST_CREATE_ACCOUNT_INFO = "생성할 계좌번호와 이름을 순서대로 입력해주세요";
  public static final String REQUEST_ACCOUNT_INFO = "계좌 정보를 확인할 계좌 번호와 계좌 소유자의 이름을 순서대로 입력해주세요.";
  public static final String GUIDE_MESSAGE = "\'/\'를 기준으로 구분해주세요";
}
