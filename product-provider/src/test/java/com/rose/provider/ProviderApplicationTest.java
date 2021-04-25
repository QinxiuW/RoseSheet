package com.rose.provider;


import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rose.provider.mapper")
public class ProviderApplicationTest {

  public static void main(String[] args) {
    SpringApplication.run(ProviderApplicationTest.class, args);
  }


}
