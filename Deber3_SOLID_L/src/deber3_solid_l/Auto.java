/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber3_solid_l;

/**
 *
 * @author Admin
 */
public class Auto extends Vehiculo {
    private int numeroPuertas;
    
    public Auto(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void encender() {
        System.out.println("El auto " + marca + " " + modelo + " ha encendido con llave");
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + marca + " " + modelo);
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
