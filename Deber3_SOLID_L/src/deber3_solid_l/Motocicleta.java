/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber3_solid_l;

/**
 *
 * @author Admin
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    
    public Motocicleta(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void encender() {
        System.out.println("La motocicleta " + marca + " " + modelo + " ha encendido con botón");
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Motocicleta: " + marca + " " + modelo);
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
