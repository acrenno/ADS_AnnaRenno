package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.*;

/**
 * 
 * @author anna-renno
 * @since 2023-12-13
 */

public class SensorPublisher {

    public static void main(String[] args) throws MqttException, InterruptedException {
        //1
        String publisherId = "Publicador_250";
        IMqttClient publisher = new MqttClient(MyConstants.URI_BROKER, publisherId);

        //2
        MqttConnectOptions opts = new MqttConnectOptions();
        opts.setAutomaticReconnect(true);
        opts.setCleanSession(true);
        opts.setConnectionTimeout(10);
        publisher.connect(opts);

        //3
        Sensor sensor = new Sensor();

        System.out.println("Iniciando... ");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            double temperatura = sensor.readTem();
            MqttMessage message = createMessage(temperatura);

            //4
            publisher.publish(MyConstants.TOPIC_SENSOR, message);

            Thread.sleep(2000);
        }

        //5
        publisher.disconnect();
    }

    private static MqttMessage createMessage(double value) {
        byte [] payload = String.format("T:%04.2f", value).getBytes();
        return new MqttMessage(payload);
    }
}
