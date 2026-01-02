package org.jayscode.nextstoprest.service.ddot;

import org.jayscode.nextstoprest.repo.ddot.ArrivalEstimateRepo;
import org.jayscode.nextstoprest.repo.ddot.RouteRepo;
import org.jayscode.nextstoprest.repo.ddot.StopRepo;
import org.jayscode.nextstoprest.repo.ddot.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class TransitService {

    private ArrivalEstimateRepo arrivalEstimateRepo;
    private RouteRepo routeRepo;
    private StopRepo stopRepo;
    private VehicleRepo vehicleRepo;

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
