package com.geekster.WeeklyTest3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"CustomConfigurationTeacher"})

public class StudentHelper {

    @Bean
    public static Student getStudent(){
        return new Student("Ajinkya",12);
    }



}
