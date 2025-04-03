/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tia.pruebatecnica.repository;

import com.tia.pruebatecnica.model.Tropas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 *
 * @author Ricardo
 */


public interface TropasRepository extends JpaRepository<Tropas, Long> {
    @Query("SELECT t.potencia, t.frente, SUM(t.numeroTropas) FROM Tropas t GROUP BY t.potencia, t.frente")
    List<Object[]> obtenerResumenAgrupado();
}
