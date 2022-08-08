/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tomasdisiena
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().allMatch(s -> s.isOn() == true);
    }

    @Override
    public void setOn() {
        this.sensors.forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if (this.isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        
        int sum = 0;
        for (Sensor sensor : this.sensors) {
            sum += sensor.read();
        }

        int avg = sum / this.sensors.size();

        this.readings.add(avg);

        return avg;

    }

    public List<Integer> readings() {
        return this.readings;
    }
}
