package org.jayscode.nextstoprest.service.traffic;

import lombok.extern.slf4j.Slf4j;
import org.jayscode.nextstoprest.repo.traffic.TrafficRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TrafficService {

   private final TrafficRepo trafficRepo;

    public TrafficService(@Autowired TrafficRepo trafficRepo) {
        this.trafficRepo = trafficRepo;
    }
}
