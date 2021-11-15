/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4;

import java.util.Scanner;

/**
 *
 * @author alexd
 */
public class Display {
    
    Scanner stringscanner = new Scanner(System.in);
    Scanner intscanner = new Scanner (System.in);
    
    public void inicio(){
        System.out.println("----------------------------------------");
        System.out.println("BIENVENIDO A LA PLATAFORMA MERCEDES BENZ");
        System.out.println("----------------------------------------");
        System.out.println(""
                + " ______--~~~~~~~~~~~~~~~~~~-----______ "
             + "___// _-~/                         \\~-_ \\ ___"
            + "\\__)\\/~/                           \\~\\/(__/"
        + "    _--`-___/                             \\__-'--_ "
        + "  /~     `\\ ~~~~~~~~------------~~~~~~~~ /'     ~\\ "
       + " /|        `\\         ________           /'       /|\\"
       + "|\\   ______`\\_      \\------/       ___/'______ / /'/"
        + "|`\\ _~-_____\\ ~-__________________-~ /_____-~_/'//|"
      + "`.|     ~-____________________________________-~   .' |"
         +" \\`.----- [_______/------|~~|------\\_______]----//.'"
         + "`\\--___((____)(________\\//________)(____))___--/' "
          + "|>>>>>>||                            ||<<<<<<| "
                + ""
                + "---------------------------------------------"
                + "ESTO ES UN SIMULADOR DE RADIOS PARA VEHICULOS"
                + "---------------------------------------------");
        
     

    }
    
    //Clase de radio a elegir por el usuario
    public int menuTipoRadio(){
        System.out.println("Que tipo de radio quiere ejecutar?");
        System.out.println("(1) Clase A\n"
                + "(2) Clase C\n"
                + "(3) Clase S");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    // Menu para apagar y encender Radio
    public int menu_Apagar_Encender(){
        
        System.out.println("Que accion ejecutar?");
        System.out.println("(1) Encender Radio\n"
                + "(2) Apagar Radio");
        int opcion = intscanner.nextInt();
        
        return opcion;
        
    }
    
    
    
    
    public int menuA(){
        System.out.println("---------------------------------------------\n"
                + "|Bievenido al menu de Radio Clase 'A'|\n"
                + "Que accion desea ejecutar?\n"
                + "(1) Cambiar Volumen\n"
                + "(2) Modo Radio\n"
                + "(3) Modo Reproduccion\n"
                + "(4) Modo Telefono\n"
                + "(5) Modo Productividad\n"
                + "(6) Salir\n"
                + "---------------------------------------------");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuC(){
        System.out.println("---------------------------------------------\n"
                + "|Bievenido al menu de Radio Clase 'C'|\n"
                + "Que accion desea ejecutar?\n"
                + "(1) Cambiar Volumen\n"
                + "(2) Modo Radio\n"
                + "(3) Modo Reproduccion\n"
                + "(4) Modo Telefono\n"
                + "(5) Modo Productividad\n"
                + "(6) Salir\n"
                + "---------------------------------------------");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuS(){
        System.out.println("---------------------------------------------\n"
                + "|Bievenido al menu de Radio Clase 'S'|\n"
                + "Que accion desea ejecutar?\n"
                + "(1) Cambiar Volumen\n"
                + "(2) Modo Radio\n"
                + "(3) Modo Reproduccion\n"
                + "(4) Modo Telefono\n"
                + "(5) Modo Productividad\n"
                + "(6) Salir\n"
                + "---------------------------------------------");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuModoRadio(){
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Radio|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Cambiar de FM a AM\n"
                + "(2) Cambiar Emisora\n"
                + "(3) Guardar Emisora\n"
                + "(4) Cargar Emisoras\n"
                + "(5) Regresar\n"
                + "---------------------------------------------"); 
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuModoReproduccion(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Reproduccion|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Seleccionar PlayList\n"
                + "(2) Cambiar Cancion\n"
                + "(3) Reproducir Cancion\n"
                + "(4) Regresar\n"
                + "---------------------------------------------"); 
        
        int opcion = intscanner.nextInt();
        return opcion;
        
        
    }
    
    
    public int menuModoTelefonoA(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Telefono A|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Conectar/Desconectar\n"
                + "(2) Mostrar Contactos\n"
                + "(3) Llamar a Contacto\n"
                + "(4) Llamar al ultimo contacto que se hablo\n"
                + "(5) Finalizar Llamada\n"
                + "---------------------------------------------"); 
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuModoTelefonoC(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Telefono C|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Conectar/Desconectar\n"
                + "(2) Mostrar Contactos\n"
                + "(3) Llamar a Contacto\n"
                + "(4) Cambiar a llamada modo espera\n"
                + "(5) Finalizar Llamada\n"
                + "---------------------------------------------"); 
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuModoTelefonoS(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Telefono S|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Conectar/Desconectar\n"
                + "(2) Mostrar Contactos\n"
                + "(3) Llamar a Contacto\n"
                + "(4) Cmabiar a bocinas o auriculares\n"
                + "(5) Finalizar Llamada\n"
                + "---------------------------------------------"); 
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    
    public int MenuModeTelefonoA(){
        System.out.println("Que desea realizar?\n"
                + "(1) Conectar\n"
                + "(2) Desconectar\n"
                + "(3) Regresar");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int MenuModeTelefonoC(){
        System.out.println("Que desea realizar?\n"
                + "(1) Conectar\n"
                + "(2) Desconectar\n"
                + "(3) Regresar");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int MenuModeTelefonoS(){
        System.out.println("Que desea realizar?\n"
                + "(1) Conectar\n"
                + "(2) Desconectar\n"
                + "(3) Regresar");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    
    
    public int menuModoProductividadA(){
        System.out.println("|Modo Productividad A|\n"
                + "Que desea realizar?\n"
                + "(1) Ver Tarjetas de productividad\n"
                + "(2) regresar");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuModoProductividadC(){
        System.out.println("|Modo Productividad C|\n"
                + "Que desea realizar?\n"
                + "(1) Ver tiempo\n"
                + "(2) regresar");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuModoProductividadS(){
        System.out.println("|Modo Productividad S|\n"
                + "Que desea realizar?\n"
                + "(1) Planificar Viajes\n"
                + "(2) regresar");
        
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    
    
}
