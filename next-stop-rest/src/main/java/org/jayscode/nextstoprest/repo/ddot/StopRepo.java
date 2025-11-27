package org.jayscode.nextstoprest.repo.ddot;

import org.jayscode.nextstoprest.model.ddot.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StopRepo extends JpaRepository<Stop, UUID> {
}
