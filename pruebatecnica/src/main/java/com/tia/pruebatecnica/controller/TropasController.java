/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tia.pruebatecnica.controller;

import com.tia.pruebatecnica.model.Tropas;
import com.tia.pruebatecnica.repository.TropasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author Ricardo
 */


@RestController
@RequestMapping("/tropas")
public class TropasController {

    @Autowired
    private TropasRepository tropasRepo;

    @PostMapping
    public Tropas guardarTropas(@RequestBody Tropas tropas) {
        return tropasRepo.save(tropas);
    }
}
