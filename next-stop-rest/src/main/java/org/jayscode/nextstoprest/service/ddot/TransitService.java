package org.jayscode.nextstoprest.service.ddot;

import lombok.extern.slf4j.Slf4j;
import org.jayscode.nextstoprest.model.ddot.Vehicle;
import org.jayscode.nextstoprest.repo.ddot.ArrivalEstimateRepo;
import org.jayscode.nextstoprest.repo.ddot.RouteRepo;
import org.jayscode.nextstoprest.repo.ddot.StopRepo;
import org.jayscode.nextstoprest.repo.ddot.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class TransitService {

    private final ArrivalEstimateRepo arrivalEstimateRepo;
    private final RouteRepo routeRepo;
    private final StopRepo stopRepo;
    private final VehicleRepo vehicleRepo;

    public TransitService(@Autowired ArrivalEstimateRepo arrivalEstimateRepo,
                          @Autowired RouteRepo routeRepo,
                          @Autowired StopRepo stopRepo,
                          @Autowired VehicleRepo vehicleRepo) {
        this.arrivalEstimateRepo = arrivalEstimateRepo;
        this.routeRepo = routeRepo;
        this.stopRepo = stopRepo;
        this.vehicleRepo = vehicleRepo;
    }

}
