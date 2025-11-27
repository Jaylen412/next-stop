package org.jayscode.nextstoprest.repo.ddot;

import org.jayscode.nextstoprest.model.ddot.ArrivalEstimate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArrivalEstimateRepo extends JpaRepository<ArrivalEstimate, UUID> {
}
