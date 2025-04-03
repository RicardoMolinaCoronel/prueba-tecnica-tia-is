/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tia.pruebatecnica.model;
import jakarta.persistence.*;
import java.time.LocalTime;
/**
 *
 * @author Ricardo
 */


@Entity
public class Tropas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String potencia;
    private String frente;
    private Integer numeroTropas;
    private String tipoTropas;
    private LocalTime horaDespliegue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getFrente() {
        return frente;
    }

    public void setFrente(String frente) {
        this.frente = frente;
    }

    public Integer getNumeroTropas() {
        return numeroTropas;
    }

    public void setNumeroTropas(Integer numeroTropas) {
        this.numeroTropas = numeroTropas;
    }

    public String getTipoTropas() {
        return tipoTropas;
    }

    public void setTipoTropas(String tipoTropas) {
        this.tipoTropas = tipoTropas;
    }

    public LocalTime getHoraDespliegue() {
        return horaDespliegue;
    }

    public void setHoraDespliegue(LocalTime horaDespliegue) {
        this.horaDespliegue = horaDespliegue;
    }

    
}
