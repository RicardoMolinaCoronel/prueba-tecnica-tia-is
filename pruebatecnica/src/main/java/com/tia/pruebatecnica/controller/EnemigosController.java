/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tia.pruebatecnica.controller;
import com.tia.pruebatecnica.model.Potencia;
import com.tia.pruebatecnica.repository.PotenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Ricardo
 */

@RestController
@RequestMapping("/enemigos")
public class EnemigosController {

    @Autowired
    private PotenciaRepository potenciaRepo;

    @PostMapping
    public Potencia guardarEnemigo(@RequestBody Potencia potencia) {
        return potenciaRepo.save(potencia);
    }
}
