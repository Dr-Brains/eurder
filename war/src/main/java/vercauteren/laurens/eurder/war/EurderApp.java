package vercauteren.laurens.eurder.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "vercauteren.laurens.eurder")
public class EurderApp {

	public static void main(String[] args) {
		SpringApplication.run(EurderApp.class, args);
	}
}
