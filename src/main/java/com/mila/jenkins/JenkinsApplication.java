package com.mila.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		System.out.println("test");
		Cal cal = new Cal();
		int sum = cal.sum(1, 2);
		System.out.println(sum);
	}

}
