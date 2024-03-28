package org.example.view;

import java.util.Scanner;
import org.example.common.message.ProcessNumberMessage;
import org.example.common.message.RequestMessage;
import org.example.domain.ProcessRequiredInfo;
import org.example.view.converter.StringToObjectConverter;

public class ApplicationConsoleView implements ApplicationView{

  StringToObjectConverter<ProcessRequiredInfo> stringToObjectConverter;

  public ApplicationConsoleView(
      StringToObjectConverter<ProcessRequiredInfo> stringToObjectConverter) {
    this.stringToObjectConverter = stringToObjectConverter;
  }

  @Override
  public int getProcessNumber() {
    print(RequestMessage.REQUEST_PROCESS_NUMBER);
    print(RequestMessage.PROCESS_OPTION);
    return getInputInteger();
  }

  @Override
  public ProcessRequiredInfo getRequiredUserInfo(int processNumber) {
    print(ProcessNumberMessage.getProcessRequestMessage(processNumber));
    print(RequestMessage.GUIDE_MESSAGE);
    return stringToObjectConverter.convert(getInputString(), processNumber);
  }

  @Override
  public String getInputString() {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    sc.close();
    return input;
  }

  @Override
  public int getInputInteger() {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    sc.close();
    return input;
  }

  @Override
  public void print(String content) {
    System.out.println(content);
  }
}
