package org.alenapech.adapter;

import java.time.LocalDateTime;

public class AdapterTemperatureSensor implements MeteoSensor{

    TemperatureSensor adaptee;

    public AdapterTemperatureSensor(TemperatureSensor adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int getId() {
        return adaptee.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adaptee.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDataTime() {
        LocalDateTime dateTime = LocalDateTime.of(adaptee.year(), 1, 1, 0, 0);
        dateTime = dateTime.plusDays(adaptee.day() - 1);
        dateTime = dateTime.plusSeconds(adaptee.seconds());
        return dateTime;
    }
}
