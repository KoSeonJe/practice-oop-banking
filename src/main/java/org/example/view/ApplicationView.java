package org.example.view;

import org.example.domain.ProcessRequiredInfo;

public interface ApplicationView {

  void print(String content);

  int getProcessNumber();

  String getInputString();

  int getInputInteger();

  ProcessRequiredInfo getRequiredUserInfo(int processNumber);
}
