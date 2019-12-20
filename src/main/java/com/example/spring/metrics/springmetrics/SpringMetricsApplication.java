package com.example.spring.metrics.springmetrics;

import io.micrometer.core.instrument.config.MeterFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMetricsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMetricsApplication.class, args);
	}

	@Bean
	public MeterFilter meterFilter() {
		return MeterFilter.deny(id -> {
					String uri = id.getTag("uri");
					return uri != null && uri.startsWith("/actuator");
				}
		);
	}
}
