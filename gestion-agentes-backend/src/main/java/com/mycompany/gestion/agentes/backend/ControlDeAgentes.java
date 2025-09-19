/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

package com.mycompany.gestion.agentes.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController // Esta linea le dice a Spring que esta clase manejará peticiones web
public class ControlDeAgentes {

    @GetMapping("/agents") // Responde a las peticiones GET en la URL "/agents"
    public List<String> getAgents() {
        List<String> agentList = new ArrayList<>();
        agentList.add("Agente 001: Gustavo Godoy Gutierrez");
        agentList.add("Agente 002: Armando Paredes Bonitas");
        agentList.add("Agente 003: Rempujencio Del Cristo");
        agentList.add("Agente 004: Verenice Del Rio Claro");
        return agentList; // Spring convierte esto a JSON automáticamente
    }
}