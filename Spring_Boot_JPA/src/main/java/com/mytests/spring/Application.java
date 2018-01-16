package com.mytests.spring;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication(scanBasePackages= {"com.mytests"})
@EnableWebMvc
@ImportResource({"classpath:/applicatioon.xml"})
public class Application {

	HashMap<String, String> devicesWithProducer = new HashMap<String, String>();

	public static void main(String[] args) {

		//new Application().start();
		 SpringApplication.run(Application.class, args);
	}

	public void start() {
		// open/read the application context file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/main/application.xml");

		// instantiate our spring dao object from the application context
//		WaterDeviceRepository deviceRepo = (WaterDeviceRepository) ctx.getBean("waterDeviceRepository");
//		RecordRepository postRepo = (RecordRepository) ctx.getBean("recordRepository");
//
//		TemperatureRecord temperatureRecord = new TemperatureRecord();
//		WaterDevice waterDevice = new WaterDevice();
//
//		temperatureRecord.setWaterDevice(waterDevice);
//		temperatureRecord.setTimestamp(new Timestamp(System.currentTimeMillis()));
//		temperatureRecord.setUnitOfMeasurement("Fahrenheit");
//		temperatureRecord.setTemperature(ThreadLocalRandom.current().nextInt(0, 110 + 1));
//		waterDevice.setName("SecondDeviceName");
//		waterDevice.setProducerName("Triva");
//		waterDevice.addTemperatureRecord(temperatureRecord);
//		// deviceRepo.save( device);
//		deviceRepo.save(waterDevice);
//		List<WaterDevice> findByName = deviceRepo.allDevicesWithName("SecondDeviceName");
//
//		// Producer producer = new Producer();
//
//		// postRepo.save( testPost );

		// System.out.println("Number of SecondDevices: " + findByName.size());

	}

}
