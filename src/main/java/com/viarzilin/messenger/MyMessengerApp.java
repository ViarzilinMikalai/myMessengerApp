package com.viarzilin.messenger;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyMessengerApp {

    public static void main(String[] args) {
        SpringApplication.run(MyMessengerApp.class, args);

    }

}
