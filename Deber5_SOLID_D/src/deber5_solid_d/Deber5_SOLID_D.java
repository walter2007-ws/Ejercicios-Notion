/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber5_solid_d;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Deber5_SOLID_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el mensaje a enviar: ");
        String mensaje = sc.nextLine();
        
        System.out.println("Seleccione método de notificación:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. WhatsApp");
        System.out.print("Opción: ");
        int op = sc.nextInt();
        
        ServiceNotificacion servicio;
        switch(op) {
            case 1: servicio = new NotificacionEmail(); break;
            case 2: servicio = new NotificacionSMS(); break;
            case 3: servicio = new NotificacionWhatsApp(); break;
            default: servicio = new NotificacionEmail();
        }
        
        Notificador notificador = new Notificador(servicio);
        notificador.notificar(mensaje);
    }
    
}
