package no.hvl.dat110.iotsystem;

import no.hvl.dat110.broker.Broker;
import no.hvl.dat110.broker.Dispatcher;
import no.hvl.dat110.broker.Storage;
import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();


		// TODO - start

		// create a client object and use it to
		Client client = new Client("TempUser","localhost",8080);
		// - connect to the broke


		client.connect();

		//client.createTopic("TEMP");

		for(int i = 0; i < COUNT; i++){
			client.publish("TEMP", String.valueOf(sn.read()));
		}
		// - publish the temperature(s)
		// - disconnect from the broker

		// TODO - end
		client.disconnect();
		System.out.println("Temperature device stopping ... ");


	}
}
