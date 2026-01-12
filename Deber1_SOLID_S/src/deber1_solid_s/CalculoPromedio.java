/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber1_solid_s;

/**
 *
 * @author Admin
 */
public class CalculoPromedio {
    public double calcularPromedio(Estudiante estudiante) throws Exception {
        return (estudiante.getNota1() + estudiante.getNota2() + estudiante.getNota3())/3;
    }
}
