package org.sgi.mastering.dataskils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DataskilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataskilsApplication.class, args);
	}
}
