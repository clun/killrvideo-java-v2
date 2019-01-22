package com.killrvideo.service.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Killrvideo-services module will merge all service in a single runtime.
 * Still if you want to run Comment Service as StandAlone use this class.
 * 
 * @author Cedrick LUNVEN (@clunven)
 */
@ComponentScan(basePackages="com.killrvideo")
@EnableAutoConfiguration
public class CommentServiceStandAloneApp {

    /**
     * As SpringBoot application, this is the "main" class
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CommentServiceStandAloneApp.class);
        app.run(args);
    }
    
}