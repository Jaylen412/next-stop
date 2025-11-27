package org.jayscode.nextstoprest.repo.ddot;

import org.jayscode.nextstoprest.model.ddot.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RouteRepo extends JpaRepository<Route, UUID> {
}
