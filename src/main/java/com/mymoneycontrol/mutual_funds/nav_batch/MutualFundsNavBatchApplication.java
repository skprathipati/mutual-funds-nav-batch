package com.mymoneycontrol.mutual_funds.nav_batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MutualFundsNavBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MutualFundsNavBatchApplication.class, args);
	}

}
