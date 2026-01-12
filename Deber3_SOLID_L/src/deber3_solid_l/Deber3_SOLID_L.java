/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber3_solid_l;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Deber3_SOLID_L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione tipo de vehículo:");
        System.out.println("1. Auto");
        System.out.println("2. Motocicleta");
        System.out.print("Opción: ");
        int op = sc.nextInt();
        sc.nextLine();
        
        Vehiculo vehiculo;
        
        if(op == 1) {
            System.out.print("Marca del auto: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Número de puertas: ");
            int puertas = sc.nextInt();
            vehiculo = new Auto(marca, modelo, puertas);
        } else {
            System.out.print("Marca de la moto: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Cilindrada (cc): ");
            int cilindrada = sc.nextInt();
            vehiculo = new Motocicleta(marca, modelo, cilindrada);
        }
        
        System.out.println();
        vehiculo.mostrarInfo();
        vehiculo.encender();
    }
    
}
