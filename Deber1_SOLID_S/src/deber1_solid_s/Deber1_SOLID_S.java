/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber1_solid_s;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Deber1_SOLID_S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante= new Estudiante();
        CalculoPromedio promedio=new CalculoPromedio();
        MostrarDatos datos=new MostrarDatos();
        String estado="d";
        estudiante.ingresarEstudiante();
        double prom=promedio.calcularPromedio(estudiante);

        if(prom<14){
            estado="Reprobado";
        }
        if(prom>=14){
            estado="Aprobado";
        }
        datos.mostrar(estudiante, prom, estado);
        
    }
    
    
}
