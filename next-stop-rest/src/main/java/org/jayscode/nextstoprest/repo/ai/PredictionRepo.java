package org.jayscode.nextstoprest.repo.ai;

import org.jayscode.nextstoprest.model.ai.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PredictionRepo extends JpaRepository<Prediction, UUID> {


}
