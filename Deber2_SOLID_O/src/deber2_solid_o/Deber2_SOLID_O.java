/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber2_solid_o;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Deber2_SOLID_O {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculoPrecioFinal calculadora = new CalculoPrecioFinal();
        System.out.print("Ingrese el precio del producto: $");
        double precio = sc.nextDouble();
        System.out.println("Seleccione tipo de usuario:");
        System.out.println("1. Estudiante (15% descuento)");
        System.out.println("2. Profesor (25% descuento)");
        System.out.println("3. Personal Administrativo (10% descuento)");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        
        Descuento descuento;
        switch(opcion) {
            case 1: descuento = new DescuentoEstudiante(); break;
            case 2: descuento = new DescuentoProfesor(); break;
            case 3: descuento = new DescuentoAdministrativo(); break;
            default: descuento = new DescuentoEstudiante();
        }
        
        
        double precioFinal = calculadora.calcular(precio, descuento);
        
        System.out.println("Precio original: $" +  precio);
        System.out.println("Precio con descuento: $" + precioFinal);
        
    }
    
}
