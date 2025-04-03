/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tia.pruebatecnica.services;

import com.tia.pruebatecnica.repository.TropasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 *
 * @author Ricardo
 */


@Service
public class ReporteService {

    @Autowired
    private TropasRepository tropasRepo;

    public List<Object[]> obtenerReporteAgrupado() {
        return tropasRepo.obtenerResumenAgrupado();
    }
}
