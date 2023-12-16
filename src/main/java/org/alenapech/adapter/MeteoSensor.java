package org.alenapech.adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {
    int getId();
    Float getTemperature();
    Float getHumidity();
    Float getPressure();
    LocalDateTime getDataTime();
}
