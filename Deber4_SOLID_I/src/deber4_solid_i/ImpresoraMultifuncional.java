/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber4_solid_i;

/**
 *
 * @author Admin
 */
public class ImpresoraMultifuncional implements Imprimible,Escaneable,Fotocopiable {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento desde multifuncional...");
    }
    
    @Override
    public void escanear() {
        System.out.println("Escaneando documento...");
    }
    
    @Override
    public void fotocopiar() {
        System.out.println("Fotocopiando documento...");
    }
}
