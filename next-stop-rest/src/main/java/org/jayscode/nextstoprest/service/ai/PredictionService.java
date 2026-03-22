package org.jayscode.nextstoprest.service.ai;

import lombok.extern.slf4j.Slf4j;
import org.jayscode.nextstoprest.repo.ai.PredictionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PredictionService {

    private final PredictionRepo predictionRepo;

    public PredictionService(@Autowired PredictionRepo predictionRepo) {
        this.predictionRepo = predictionRepo;
    }

}
