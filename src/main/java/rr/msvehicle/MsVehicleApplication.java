package rr.msvehicle;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableFeignClients
@EnableRabbit
@EnableHystrixDashboard
public class MsVehicleApplication {



	public static void main(String[] args) {
		SpringApplication.run(MsVehicleApplication.class, args);
	}

	/*
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	} */

}
