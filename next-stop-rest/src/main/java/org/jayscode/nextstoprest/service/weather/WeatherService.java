package org.jayscode.nextstoprest.service.weather;

import lombok.extern.slf4j.Slf4j;
import org.jayscode.nextstoprest.repo.weather.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WeatherService {

    private WeatherRepo weatherRepo;

    public WeatherService(@Autowired WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

}
