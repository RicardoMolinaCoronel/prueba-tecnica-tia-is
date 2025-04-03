package com.tia.pruebatecnica;

import com.tia.pruebatecnica.ui.MainUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebatecnicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebatecnicaApplication.class, args);
        System.setProperty("java.awt.headless", "false");
        // Verifica si el entorno puede utilizar GUI
        if (!java.awt.GraphicsEnvironment.isHeadless()) {
            MainUI.start();
        } else {
            System.err.println("El entorno actual no soporta GUI.");
        }
    }

}
