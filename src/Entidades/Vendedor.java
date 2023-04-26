/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Paola
 */
public class Vendedor {

    //Arributos
    private String nombre;
    private Integer cedula;
    private Double sueldoBasico;
    private Double comisiones;
    private Double sueldoMensual;
    private Date fechaInicio;
    
    //Contructores
    //1.Contructor por defecto

    public Vendedor() {
    }
    //2.Constructor por parametros

    public Vendedor(String nombre, Integer cedula, Double sueldoBasico, Double comisiones, Double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    
    //Crear Getter y Setter
    //Setter-> Permite recibir el valor que va a tener cada atributo definido
    //Getter-> Permite retonar el valor que tiene cada atributo definido
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    //Metodo toString->Permite visualizar en pantalla todos los parametros
    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", cedula=" + cedula + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
}
