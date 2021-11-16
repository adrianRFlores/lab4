
import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * Universidad del Valle de Guatemala
 * Ingenieria en Ciencias de la computacion y TI
 * Programacion Orientada a Objetos
 * Integrantes:
 * Javier Alejandro Prado Ramirez | 21486
 * Adrián Ricardo Flores Trujillo | 21500
 * Angel Gabriel Perez Figueroa | 21298
 * Laboratorio #4
 * 
 * Funcionalidad - clase hija de la clase mercedesBenz, es decir muestra las propiedades del radio clase S que el usuario puede utilizar

 *
 */

public class classS extends mercedezBenz implements Radio{
    Scanner intscanner = new Scanner(System.in);
    public classS(){
        
    }

    @Override
    public void pronosticoTiempo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tarjetasPresentacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viajes() {
        System.out.println("Bienvenido a planificacion de viaje\n Estos son los lugares disponibles a viajar");
        System.out.println("(1) Argentina\n(2) Estados Unidos\n(3) España\n(4) Holanda \n(5) Francia");
        System.out.println("Seleccione una opcion del 1-5");
        
        
        int a = intscanner.nextInt();
        switch(a){
            case 1:
                System.out.println("Se ha agregado: Argentina en su agenda de viajes");
                break;
            case 2:
                System.out.println("Se ha agregado: Estados Unidos en su agenda de viajes");
                break;
            case 3:
                System.out.println("Se ha agregado: España en su agenda de viajes");
                break;
            case 4: 
                System.out.println("Se ha agregado: Holanda en su agenda de viajes");
                break;
            case 5:
                System.out.println("Se ha agregado: Francia en su agenda de viajes");
                break;
            default:
                System.out.println("Selecciono un opcion no encontrada intente de nuevo");
        }
        
    }

    @Override
    public void llamadaEspera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llamarUltimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bocinasAaudifonos() {
        System.out.println("Se está cambiando bocinas por auriculares...");
        
    }
}
