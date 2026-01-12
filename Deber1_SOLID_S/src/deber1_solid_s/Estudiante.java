/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber1_solid_s;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    Scanner sc=new Scanner(System.in);

    public Estudiante() {
    }

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1()throws Exception {
        if(nota1<0){
            throw new Exception("No se pueden ingresar notas menores a cero");
        }
        if(nota1>20){
            throw new Exception("No se pueden ingresar notas mayores a 20");
        }
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2()throws Exception {
        if(nota2<0){
            throw new Exception("No se pueden ingresar notas menores a cero");
        }
        if(nota2>20){
            throw new Exception("No se pueden ingresar notas mayores a 20");
        }
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3()throws Exception {
        if(nota3<0){
            throw new Exception("No se pueden ingresar notas menores a cero");
        }
        if(nota3>20){
            throw new Exception("No se pueden ingresar notas mayores a 20");
        }
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public void ingresarEstudiante(){
        System.out.print("Ingrese nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Ingrese nota 2: ");
        nota2 = sc.nextDouble();
        System.out.print("Ingrese nota 3: ");
        nota3 = sc.nextDouble();
    }
    
}
