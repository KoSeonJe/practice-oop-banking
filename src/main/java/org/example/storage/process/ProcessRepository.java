package org.example.storage.process;

import java.util.Optional;
import org.example.domain.BankProcess;

public interface ProcessRepository {

  void save(BankProcess bankProcess);

  Optional<BankProcess> findById(int processId);
}
