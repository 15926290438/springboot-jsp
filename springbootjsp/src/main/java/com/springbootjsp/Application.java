package com.springbootjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
   public static void main(String[] args){
       SpringApplication.run(Application.class,args);  //来启动springboot项目（相当于启动内置的tomcat）
   }
}
