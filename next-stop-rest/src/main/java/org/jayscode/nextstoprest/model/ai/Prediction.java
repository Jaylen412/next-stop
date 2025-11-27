package org.jayscode.nextstoprest.model.ai;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jayscode.nextstoprest.model.ddot.ArrivalEstimate;
import org.jayscode.nextstoprest.model.traffic.Traffic;
import org.jayscode.nextstoprest.model.weather.Weather;

import java.time.Instant;
import java.util.UUID;

@Builder
@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class Prediction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToOne
    private ArrivalEstimate arrivalEstimate;
    @OneToOne
    private Weather weather;
    @OneToOne
    private Traffic traffic;
    private Instant now;
    private Instant predictedEta;
    private float delayGreaterThanTenMinutes;
    private float timeDifferenceBusArrival;
    private float confidence;
    private String reasoning;
}
