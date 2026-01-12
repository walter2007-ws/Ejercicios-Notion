/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber4_solid_i;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Deber4_SOLID_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione tipo de impresora:");
        System.out.println("1. Impresora Simple");
        System.out.println("2. Impresora Multifuncional");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        
        if(opcion == 1) {
            ImpresoraSimple impresora = new ImpresoraSimple();
            impresora.imprimir();
        } else {
            ImpresoraMultifuncional impresora = new ImpresoraMultifuncional();
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Imprimir");
            System.out.println("2. Escanear");
            System.out.println("3. Fotocopiar");
            System.out.print("Opción: ");
            int op = sc.nextInt();
            
            switch(op) {
                case 1: impresora.imprimir(); break;
                case 2: impresora.escanear(); break;
                case 3: impresora.fotocopiar(); break;
            }
        }
    }
    
}
