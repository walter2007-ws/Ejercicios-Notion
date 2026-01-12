/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber2_solid_o;

/**
 *
 * @author Admin
 */
public class DescuentoEstudiante extends Descuento {
    @Override
    public double aplicarDescuento(double precio) {
        return precio * 0.15; // 15% de descuento
    }
}
