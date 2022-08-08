/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author tomasdisiena
 */
import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor implements Sensor {

    private boolean isOn;
    private int value;

    public TemperatureSensor() {
        this.isOn = false;
        this.value = 0;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (this.isOn == false) {
            throw new IllegalStateException();
        }

        this.value = ThreadLocalRandom.current().nextInt(-30, 31);;
        return this.value;
    }

}
