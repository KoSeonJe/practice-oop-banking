package org.example.storage.process;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.example.domain.BankProcess;

public class BankProcessRepository implements ProcessRepository {

  private static final int INCREMENT_NUMBER = 1;
  private static int AUTO_INCREMENT_ID = 0;

  private static final Map<Integer, BankProcess> repository = new HashMap<>();

  public void save(BankProcess bankProcess) {
    bankProcess.updateId(++AUTO_INCREMENT_ID);
    repository.put(AUTO_INCREMENT_ID, bankProcess);
  }

  @Override
  public Optional<BankProcess> findById(int processId) {
    return Optional.ofNullable(repository.get(processId));
  }
}
