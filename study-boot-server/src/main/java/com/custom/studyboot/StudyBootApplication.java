package com.custom.studyboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = "com.custom.studyboot")
public class StudyBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyBootApplication.class, args);
    }

}
