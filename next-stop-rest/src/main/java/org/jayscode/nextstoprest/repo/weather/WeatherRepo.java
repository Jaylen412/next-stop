package org.jayscode.nextstoprest.repo.weather;

import org.jayscode.nextstoprest.model.weather.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WeatherRepo extends JpaRepository<Weather, UUID> {
}
