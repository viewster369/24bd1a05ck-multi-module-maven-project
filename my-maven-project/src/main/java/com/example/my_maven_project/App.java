package com.example.my_maven_project;
// Jenkins Webhook CI Test
import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        try (InputStream input = App.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                System.out.println("config.properties not found");
                return;
            }

            properties.load(input);
        }

        System.out.println(properties.getProperty("app.name"));
        System.out.println(properties.getProperty("app.version"));
    }
}
