/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class VendedorServicio {
            Scanner leer = new Scanner(System.in);
    public Vendedor altaVendedor() {

        //Instancia un objeto de tipo vendedor usa el constructor por defecto por lo que los atributos estan vacios      
        Vendedor v1 = new Vendedor();
        //Leer por pantalla los valores de los atributos  

        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese la cedula del vendedor");
        v1.setCedula(leer.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia en que comenzo a trabajar el vendedor");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en que comenzo a trabajar el vendedor");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en que comenzo a trabajar el vendedor");
        int ano = leer.nextInt();
        Date fecha = new Date(ano - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }
    
    //Metodo para determinar el sueldo mensual
    public void SueldoMensual(Vendedor v1) {
        
        System.out.println("Ingrese cantidad de ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor es: " + v1.getNombre() + "es de $" + v1.getSueldoMensual());

    }
    
    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        if (antiguedad < 5) {
            System.out.println("Le corresponde 14 dias de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponde 21 dias de vacaciones");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponde 28 dias de vacaciones");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponde 35 dias de vacaciones");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");

        }
    }
}
