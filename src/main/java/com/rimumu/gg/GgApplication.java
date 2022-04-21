package com.rimumu.gg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화 (BaseTime 반복,공통 사용)
@SpringBootApplication
public class GgApplication {

	public static void main(String[] args) {
		SpringApplication.run(GgApplication.class, args);
	}

}
