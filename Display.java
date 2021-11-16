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
 * Funcionalidad - A traves de esta clase funciona la parte grafica del programa(menus), y todos los metodos que se utilizarán de las clases

 *
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
    classS claseS = new classS();
    
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
                
                break;
            case 2://Clase C
                
                break;
            case 3: //Clase S
                
                break;
        }
        return opcion;
    }
    
    //--------------------------------------------------------------------------------------------
    // Menus de encender y apagar radios
    //--------------------------------------------------------------------------------------------
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
    // Menu para apagar y encender Radio
    public int menu_Apagar_EncenderC(){
        
        System.out.println("Que accion ejecutar?");
        System.out.println("(1) Encender Radio\n"
                + "(2) Apagar Radio");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                Encendido();
                menuC();
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
    // Menu para apagar y encender Radio
    public int menu_Apagar_EncenderS(){
        
        System.out.println("Que accion ejecutar?");
        System.out.println("(1) Encender Radio\n"
                + "(2) Apagar Radio");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                Encendido();
                menuS();
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
    
    
    
    //--------------------------------------------------------------------------------------------
    // Menus principales de las clases Hijas
    //--------------------------------------------------------------------------------------------
    
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
                menuModoTelefonoA();
                break;
            case 6:
                break;
            case 7: 
                menuTipoRadio();
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
        switch(opcion){
            case 1:
                menu_Apagar_EncenderC();
                break;
            case 2:
                volumenNivelC();
                break;
            case 3:
                menuModoRadio();
                break;
            case 4:
                menuModoReproduccion();
                break;
            case 5:
                menuModoTelefonoC();
                break;
            case 6:
                break;
            case 7: 
                menuTipoRadio();
                break;
            default:
                errorOpcion();
                break;
        }
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
        switch(opcion){
            case 1:
                menu_Apagar_EncenderS();
                break;
            case 2:
                volumenNivelS();
                break;
            case 3:
                menuModoRadio();
                break;
            case 4:
                menuModoReproduccion();
                break;
            case 5:
                menuModoTelefonoS();
                break;
            case 6:
                break;
            case 7: 
                menuTipoRadio();
                break;
            default:
                errorOpcion();
                break;
        }
        return opcion;
    }
    
    
    
    //--------------------------------------------------------------------------------------------
    // Menu modo radio Opciones
    //--------------------------------------------------------------------------------------------
    public int menuModoRadio(){
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Radio A|\n"
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
                System.out.println("Estación Guardada");
                menuA();
                break;
            case 4:
                System.out.println("Usted está escuchando la ultima estación (0.5)");
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
    
    public int menuModoRadioC(){
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Radio C|\n"
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
                menuC();
                break;
            case 2:
                cambiarEmisora();
                menuC();
                break;
            case 3:
                System.out.println("Estación Guardada");
                menuC();
                break;
            case 4:
                System.out.println("Usted está escuchando la ultima estación (0.5)");
                menuC();
                break;
            case 5:
                menuC();
                break;
            default:
                errorOpcion();
                break;
            
        }
        return opcion;
    }
    
    public int menuModoRadioS(){
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Radio S|\n"
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
                menuS();
                break;
            case 2:
                cambiarEmisora();
                menuS();
                break;
            case 3:
                System.out.println("Estación Guardada");
                menuS();
                break;
            case 4:
                System.out.println("Usted está escuchando la ultima estación (0.5)");
                menuS();
                break;
            case 5:
                menuS();
                break;
            default:
                errorOpcion();
                break;
            
        }
        return opcion;
    }
    
    
    
    //--------------------------------------------------------------------------------------------
    // Menus de Reproduccion
    //--------------------------------------------------------------------------------------------
    public int menuModoReproduccion(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Reproduccion A|\n"
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
    
    public int menuModoReproduccionC(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Reproduccion C|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Seleccionar PlayList\n"
                + "(2) Cambiar Cancion\n"
                + "(3) Regresar\n"
                + "---------------------------------------------"); 
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                seleccionarPlaylist();
                menuC();
                break;
            case 2:
                seleccionarCancion();
                menuC();
                break;
          
            case 3:
                menuC();
                break;
            default:
                errorOpcion();
                break;
        }
        
        return opcion;
        
    }
    
    public int menuModoReproduccionS(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Reproduccion S|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Seleccionar PlayList\n"
                + "(2) Cambiar Cancion\n"
                + "(3) Regresar\n"
                + "---------------------------------------------"); 
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                seleccionarPlaylist();
                menuS();
                break;
            case 2:
                seleccionarCancion();
                menuS();
                break;
          
            case 3:
                menuS();
                break;
            default:
                errorOpcion();
                break;
        }
        
        return opcion;
         
    }
    
    
    //--------------------------------------------------------------------------------------------
    // Menus de modo Telefono
    //--------------------------------------------------------------------------------------------
    public int menuModoTelefonoA(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Telefono A|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Mostrar Contactos\n"
                + "(2) Llamar a Contacto\n"
                + "(3) Llamar al ultimo contacto que se hablo\n"
                + "---------------------------------------------"); 
        
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                mostrarContactos();
                break;
            case 2:
                llamarContactos();
            case 3:
                claseA.llamarUltimo();
                break;
            default:
                errorOpcion();
        }
        return opcion;
    }
    
    public int menuModoTelefonoC(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Telefono C|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Mostrar Contactos\n"
                + "(2) Llamar a Contacto\n"
                + "(3) Cambiar a llamada modo espera\n"
                + "---------------------------------------------"); 
        
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                mostrarContactos();
                break;
            case 2:
                llamarContactos();
            case 3:
                claseC.llamadaEspera();
                break;
            default:
                errorOpcion();
        }
        return opcion;
    }
    
    public int menuModoTelefonoS(){
        
        System.out.println("---------------------------------------------\n"
                + "|Bienvenido a modo Telefono S|\n"
                + "Que accion deseas ejecutar?\n"
                + "(1) Mostrar Contactos\n"
                + "(2) Llamar a Contacto\n"
                + "(3) Cambiar bocinas por auriculares\n"
                + "---------------------------------------------"); 
        
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                mostrarContactos();
                break;
            case 2:
                llamarContactos();
            case 3:
                claseS.bocinasAaudifonos();
                break;
            default:
                errorOpcion();
        }
        return opcion;
    }
    
    
    //--------------------------------------------------------------------------------------------
    // Menu de llamar Contactos general
    //--------------------------------------------------------------------------------------------
    
    public int llamarContactos(){
        System.out.println("(1) Javier Prado - 21486147\n"
                + "(2) Keytyn Morente - 19757007\n"
                + "(3) Natalia Flores - 38058873\n"
                + "(4) Victoria Silvia - 48590427\n"
                + "(5) Don juan(Mecanico) - 78308457\n");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Llamando a Javier Prado...");
                break;
            case 2:
                System.out.println("Llamando a Keytyn Morente...");
                break;
            case 3:
                System.out.println("Llamando a Natalia Flores...");
                break;
            case 4:
                System.out.println("Llamando a Victoria Silvia...");
                break;
            case 5:
                System.out.println("Llamando a Don Juan(Mecanico)...");
                break;
            default:
                errorOpcion();
                break;
             
        }
        return opcion;
         
    }
    
    
    //--------------------------------------------------------------------------------------------
    // Menu de mostrar Contactos general
    //--------------------------------------------------------------------------------------------
    public void mostrarContactos(){
        System.out.println("(1) Javier Prado - 21486147\n"
                + "(2) Keytyn Morente - 19757007\n"
                + "(3) Natalia Flores - 38058873\n"
                + "(4) Victoria Silvia - 48590427\n"
                + "(5) Don juan(Mecanico) - 78308457\n");
    }
    

    //--------------------------------------------------------------------------------------------
    // Telefonos desconectados
    //--------------------------------------------------------------------------------------------
    public void telefonoApagado(){
        System.out.println("Se ha desconectado el modo telefono A, encienadalo para ver las opciones");
        menuA();
    }
    
    public void telefonoApagadoC(){
        System.out.println("Se ha desconectado el modo telefono C, encienadalo para ver las opciones");
        menuC();
    }
    public void telefonoApagadoS(){
        System.out.println("Se ha desconectado el modo telefono S, encienadalo para ver las opciones");
        menuS();
    }
    
    //--------------------------------------------------------------------------------------------
    // Telefonos conectados
    //--------------------------------------------------------------------------------------------
    public void telefonoEncendidoA(){
        System.out.println("El modo telefono ha sido conectado");
        
    }
    
    public void telefonoEncendidoC(){
        System.out.println("El modo telefono ha sido conectado");
        
    }
    
    public void telefonoEncendidoS(){
        System.out.println("El modo telefono ha sido conectado");
        
    }
    
    
    //--------------------------------------------------------------------------------------------
    // menus de modo Productividad
    //--------------------------------------------------------------------------------------------
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
    
    public void tarjetaPresentacion(){
        System.out.println("Mostrando vista previa de tarjeta de presentacion: ");
        System.out.println("////////////////////////////////////////////////////");
        System.out.println("<INSERTAR NOMBRE>");
        System.out.println("<INSERTAR PROFESION>");
        System.out.println("<INSERTAR NUMERO DE TELEFONO>");
        System.out.println("////////////////////////////////////////////////////");
    }
    
    //--------------------------------------------------------------------------------------------
    // Mansajes de error
    //--------------------------------------------------------------------------------------------
    public void errorOpcion(){
        
        System.out.println("Escogio una opcion incorrecta Intente de nuevo");
        
    }
    
    //--------------------------------------------------------------------------------------------
    // Nombres de tipos de radio
    //--------------------------------------------------------------------------------------------
    public void radioA(){
        System.out.println("Radio Tipo A");
    }
    public void radioC(){
        System.out.println("Radio Tipo C");
    }
    
    public void radioS(){
        System.out.println("Radio Tipo S");
    }
    
    
    //--------------------------------------------------------------------------------------------
    // Volumenes de Radio
    //--------------------------------------------------------------------------------------------
    
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
    
    public int volumenNivelC(){
        System.out.println("Que desea hacer con el volumen?");
        System.out.println("(1) Subir Volumen\n"
                + "(2) bajar volumen\n");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                claseC.setVolumenup();
                claseC.info();
                break;
            case 2:
                claseC.setVolumendown();
                claseC.info();
                break;
                
               
        }
        return opcion;
    }
    
    public int volumenNivelS(){
        System.out.println("Que desea hacer con el volumen?");
        System.out.println("(1) Subir Volumen\n"
                + "(2) bajar volumen\n");
        int opcion = intscanner.nextInt();
        switch(opcion){
            case 1:
                claseS.setVolumenup();
                claseS.info();
                break;
            case 2:
                claseS.setVolumendown();
                claseS.info();
                break;
                
               
        }
        return opcion;
    }
    
    
    //--------------------------------------------------------------------------------------------
    // Radio encendido general
    //--------------------------------------------------------------------------------------------
    public void Encendido(){
        System.out.println("El radio esta encendido");
    }
    
    
    //--------------------------------------------------------------------------------------------
    // radio apagador general
    //--------------------------------------------------------------------------------------------
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
    
    //--------------------------------------------------------------------------------------------
    // emisoras- cambios
    //--------------------------------------------------------------------------------------------
    public void cambiarEmisora(){
        claseA.setEstacion();
        claseA.estacionmostrar();
    }
    
    public void cambiarEmisoraC(){
        claseC.setEstacion();
        claseC.estacionmostrar();
    }
    public void cambiarEmisoraS(){
        claseS.setEstacion();
        claseS.estacionmostrar();
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
