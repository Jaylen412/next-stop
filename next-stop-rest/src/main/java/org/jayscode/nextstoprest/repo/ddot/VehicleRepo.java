package org.jayscode.nextstoprest.repo.ddot;

import org.jayscode.nextstoprest.model.ddot.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VehicleRepo extends JpaRepository<Vehicle, UUID> {


}
