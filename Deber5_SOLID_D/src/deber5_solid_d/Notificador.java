/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber5_solid_d;

/**
 *
 * @author Admin
 */
public class Notificador {
    private ServiceNotificacion servicio;
    
    public Notificador(ServiceNotificacion servicio) {
        this.servicio = servicio;
    }
    
    public void notificar(String mensaje) {
        servicio.enviar(mensaje);
    }
}
