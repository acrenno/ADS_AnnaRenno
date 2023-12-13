package br.inatel.labs.padrao_mom.client;

import java.util.Random;

/**
 * 
 * @author anna-renno
 * @since 2023-12-13
 */

public class Sensor {
    public double readTem() {
        double value = new Random().doubles(-40, 80)
                .findAny()
                .getAsDouble();

        return value;
    }

    public double readVoltage() {
        return new Random().doubles(0, 380)
                .findAny()
                .getAsDouble();
    }

    public double readCurrent() {
        return new Random().doubles(0, 60)
                .findAny()
                .getAsDouble();
    }
}
