/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author alexd
 */
public class Display {
    
    Scanner stringscanner = new Scanner(System.in);
    Scanner intscanner = new Scanner (System.in);
   
    mercedezBenz mb = new mercedezBenz();
    classA claseA = new classA();
    classC claseC = new classC();
    
    public void inicio(){
        System.out.println("----------------------------------------");
        System.out.println("BIENVENIDO A LA PLATAFORMA MERCEDES BENZ");
        System.out.println("----------------------------------------");
        System.out.println("\n"
                + "        _______\n" +
"       //  ||\\ \\\n" +
" _____//___||_\\ \\___\n" +
" )  _          _    \\\n" +
" |_/ \\________/ \\___|\n" +
"___\\_/________\\_/______"
                + "\n"
                + "------------------------------"
                + "ESTO ES UN SIMULADOR DE RADIOS PARA VEHICULOS"
                + "------------------------------");
        
     

    }
    
    //Clase de radio a elegir por el usuario
    public int menuTipoRadio(){
        System.out.println("Que tipo de radio quiere ejecutar?");
        System.out.println("(1) Clase A\n"
                + "(2) Clase C\n"
                + "(3) Clase S\n"
                + "(4) Salir");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1://clase A
                menuA();
                break;
            case 2://Clase C
                menuC();
                break;
            case 3: //Clase S
                menuS();
                break;
        }
        return opcion;
    }
    
    // Menu para apagar y encender Radio
    public int menu_Apagar_EncenderA(){
        
        System.out.println("Que accion ejecutar?");
        System.out.println("(1) Encender Radio\n"
                + "(2) Apagar Radio");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                Encendido();
                menuA();
                break;
            case 2:
                Apagado();
                menuTipoRadio();
                break;
            default:
                errorOpcion();
                break;
        }
        return opcion;
        
    }
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
                + "(1) Encender/Apagar Radio\n"
                + "(2) Cambiar Volumen\n"
                + "(3) Modo Radio\n"
                + "(4) Modo Reproduccion\n"
                + "(5) Modo Telefono\n"
                + "(6) Modo Productividad\n"
                + "(7) Salir\n"
                + "---------------------------------------------");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                menu_Apagar_EncenderA();
                break;
            case 2:
                volumenNivelA();
                break;
            case 3:
                menuModoRadio();
                break;
            case 4:
                menuModoReproduccion();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7: 
                break;
            default:
                errorOpcion();
                break;
        }
        return opcion;
    }
    
    public int menuC(){
        System.out.println("---------------------------------------------\n"
                + "|Bievenido al menu de Radio Clase 'C'|\n"
                + "Que accion desea ejecutar?\n"
                + "(1) Encender/Apagar Radio\n"
                + "(2) Cambiar Volumen\n"
                + "(3) Modo Radio\n"
                + "(4) Modo Reproduccion\n"
                + "(5) Modo Telefono\n"
                + "(6) Modo Productividad\n"
                + "(7) Salir\n"
                + "---------------------------------------------");
        int opcion = intscanner.nextInt();
        return opcion;
    }
    
    public int menuS(){
        System.out.println("---------------------------------------------\n"
                + "|Bievenido al menu de Radio Clase 'S'|\n"
                + "Que accion desea ejecutar?\n"
                + "(1) Encender/Apagar Radio\n"
                + "(2) Cambiar Volumen\n"
                + "(3) Modo Radio\n"
                + "(4) Modo Reproduccion\n"
                + "(5) Modo Telefono\n"
                + "(6) Modo Productividad\n"
                + "(7) Salir\n"
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
        switch(opcion){
            case 1:
                FMAM();
                menuA();
                break;
            case 2:
                cambiarEmisora();
                menuA();
                break;
            case 3:
                System.out.println("Guardar Estacion");
                menuA();
                break;
            case 4:
                System.out.println("Cargar Estacion");
                menuA();
                break;
            case 5:
                menuA();
                break;
            default:
                errorOpcion();
                break;
            
        }
        return opcion;
    }
    
    public int menuModoReproduccion(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Reproduccion|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Seleccionar PlayList\n"
                + "(2) Cambiar Cancion\n"
                + "(3) Regresar\n"
                + "---------------------------------------------"); 
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                seleccionarPlaylist();
                menuA();
                break;
            case 2:
                seleccionarCancion();
                menuA();
                break;
          
            case 3:
                menuA();
                break;
            default:
                errorOpcion();
                break;
        }
        
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
    
    public void errorOpcion(){
        
        System.out.println("Escogio una opcion incorrecta Intente de nuevo");
        
    }
    public void radioA(){
        System.out.println("Radio Tipo A");
    }
    public void radioC(){
        System.out.println("Radio Tipo C");
    }
    
    public void radioS(){
        System.out.println("Radio Tipo S");
    }
    
    public int volumenNivelA(){
        System.out.println("Que desea hacer con el volumen?");
        System.out.println("(1) Subir Volumen\n"
                + "(2) bajar volumen\n");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                claseA.setVolumenup();
                claseA.info();
                break;
            case 2:
                claseA.setVolumendown();
                claseA.info();
                break;
                
               
        }
        return opcion;
    }
    
    public void Encendido(){
        System.out.println("El radio esta encendido");
    }
    public void Apagado(){
        System.out.println("El radio esta apagado");
    }
    public void goodbye(){
        System.out.println("Muchas gracias por confiar en MercedesBenz");
    }
    
    public void enciendeloOtto(){
        System.out.println("Debes encender el radio para probar, intenta de nuevo");
    }
    
    public int FMAM(){
        System.out.println("Que estacion quiere utilizar?\n"
                + "(1) FM\n"
                + "(2) AM"
                + "(3) Regresar");
        int opcion = intscanner.nextInt();

                                        switch(opcion){
                                            case 1://FM
                                               fm();
                                                break;
                                            case 2://AM
                                                AM();
                                                break;
                                            default:
                                                errorOpcion();
                                        }
        
        
        
        return opcion;
    }
    
    public void fm(){
        System.out.println("Cambiando a FM");
        System.out.println("FM activado");
    }
    public void AM(){
        System.out.println("Cambiando a AM");
        System.out.println("AM activado");
    }
    
    public void cambiarEmisora(){
        claseA.setEstacion();
        claseA.estacionmostrar();
    }
    
    public void seleccionarCancion(){
        ArrayList cancion = new ArrayList();
        
        cancion.add("Eminem - Without Me");
        cancion.add("Oasis-Wonderwall");
        cancion.add("Avicii- Wake Me Up");
        cancion.add("Sofia Reyes- 123");
        cancion.add("Bad bunny-De museo");
        cancion.add("Rude - MAGIC!");
        cancion.add("Amor del Bueno - Reyli Barba");

        
        int a = (int) (Math.random()*7);
        System.out.println("cancion en reporduccion: " + cancion.get(a));
    }
    
    public void seleccionarPlaylist(){
        ArrayList playList = new ArrayList();
        
        playList.add("Mansion Regueton");
        playList.add("Pop remix");
        playList.add("Romántica");
        playList.add("GYM");
        System.out.println("Playlist disponibles: \n");
        System.out.println("Mansion Regueton\n"
                + "Pop remix\n"
                + "Romántica\n"
                + "GYM");
        
        int a = (int) (Math.random()*4);
        System.out.println("playList en reporduccion: " + playList.get(a));
        if(a==0){
           
            System.out.println("Bad bunny-De museo duracion 2:40 ");
        }
        if(a==1){
            
            System.out.println(" Avicii- Wake Me Up duracion: 2:56");

        }
        if(a==2){
            
            System.out.println("Camilo-tuyo y mio Duracion: 3:20 " );
        }
        if(a==4){
            System.out.println("Eminem-Without Me Duracion: 3:00 " );
        }
    }

}
