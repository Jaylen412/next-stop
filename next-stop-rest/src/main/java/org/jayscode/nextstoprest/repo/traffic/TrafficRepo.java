package org.jayscode.nextstoprest.repo.traffic;

import org.jayscode.nextstoprest.model.traffic.Traffic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrafficRepo extends JpaRepository<Traffic, UUID> {
}
