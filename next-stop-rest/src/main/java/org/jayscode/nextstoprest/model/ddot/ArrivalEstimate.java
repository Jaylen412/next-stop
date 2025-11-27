package org.jayscode.nextstoprest.model.ddot;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArrivalEstimate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToOne
    private Vehicle vehicle;
    @OneToMany
    @JoinColumn(name = "id")
    private List<Stop> stop;
    private Instant now;
    private Instant arrivalTime;
    // In Feet
    private int distanceToStop;
    private boolean delay;

}
