/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber2_solid_o;

/**
 *
 * @author Admin
 */
public class CalculoPrecioFinal {
    public double calcular(double precio, Descuento descuento) {
        double montoDescuento = descuento.aplicarDescuento(precio);
        return precio - montoDescuento;
    }
}
