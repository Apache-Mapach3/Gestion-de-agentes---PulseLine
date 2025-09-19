/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestion.agentes.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // < Esto convierte la app en una aplicación Spring Boot
public class GestionAgentesBackend {

    public static void main(String[] args) {
        // Esta línea inicia el servidor web
        SpringApplication.run(GestionAgentesBackend.class, args);
        System.out.println("Servidor de Gestión de Agentes iniciado...");
    }
}
