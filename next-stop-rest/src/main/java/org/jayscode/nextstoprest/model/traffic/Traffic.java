package org.jayscode.nextstoprest.model.traffic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.jayscode.nextstoprest.model.ddot.Route;

import java.time.Instant;
import java.util.UUID;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Traffic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToOne
    private Route route;
    private Instant updatedTime;
    private String approachLabel;
    private float avgSpeed;
    private float freeFlowSpeed;
    private int incidentCount;
    private float congestionIndex;
}
