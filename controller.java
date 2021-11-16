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
 * Funcionalidad - Es el esqueleto del sustema, solo que por cuestiones didacticas se separaran de esta manera para que pueda ser mejor su comprension

 *
 */


public class controller {
    boolean stop = false;
    Display dis = new Display();
    public void simulatorMercedes(){
        dis.inicio();
        while(!stop){
        int tipoRadio = dis.menuTipoRadio();//menu de clases de Radio
        switch(tipoRadio){
            case 1://Radio clase A
                dis.radioA();//radio tipo menu
                int encender = dis.menu_Apagar_EncenderA();
                switch(encender){
                    case 1://si se enciende
                        int opcionA = dis.menuA();
                        switch(opcionA){
                            case 1:
                                dis.menu_Apagar_EncenderA();//menu apagar A
                                break;
                            case 2:
                                dis.volumenNivelA();//volumen de radio A
                                break;
                            case 3://modo radio A
                                int modeRadioA = dis.menuModoRadio();
                                switch(modeRadioA){
                                    case 1: //cambiar de FM a AM
                                        dis.FMAM();
                                        break;
                                    case 2://cambiar estacion
                                        dis.cambiarEmisora();
                                        break;
                                    case 3://guardar estacion
                                        System.out.println("Guardando Emisora...");
                                        break;
                                    case 4://cargar estacion
                                        System.out.println("Cargando Emisora Guardada...");
                                        break;
                                    default:
                                        dis.errorOpcion();
                                        break;   
                                }
                                break;
                            case 4://modo reproduccion
                                int opcionRe = dis.menuModoReproduccion();
                                
                                switch(opcionRe){
                                     
                                }
                                break;
                            case 5: //Modo telefono
                                int opcionModetelefonoA = dis.menuModoTelefonoA();
                                switch(opcionModetelefonoA){
                                    case 1: 
                                        dis.mostrarContactos();
                                        break;
                                    case 2:
                                        dis.llamarContactos();
                                        break;
                                    case 3:
                                        System.out.println("Se está llamando al contacto más reciente, por espere...");
                                        break;
                                    default:
                                        dis.errorOpcion();
                                        
                                        
                                }
                                break;
                                
                        }
                        break;//break clase A
                    case 2://si se apaga
                        dis.enciendeloOtto();
                        break;
                    default:
                        dis.errorOpcion();
                        break;
                        
                }
                
                
                break;
            case 2://Radio clase C
                dis.menuC();
                int encender2 = dis.menu_Apagar_EncenderC();
                   switch(encender2){
                    case 1://si se enciende
                        int opcionC = dis.menuC();
                        switch(opcionC){
                            case 1:
                                dis.menu_Apagar_EncenderC();//menu apagar C
                                break;
                            case 2:
                                dis.volumenNivelC();//volumen de radio C
                                break;
                            case 3://modo radio C
                                int modeRadioC = dis.menuModoRadioC();
                                switch(modeRadioC){
                                    case 1: //cambiar de FM a AM
                                        dis.FMAM();
                                        break;
                                    case 2://cambiar estacion
                                        dis.cambiarEmisoraC();
                                        break;
                                    case 3://guardar estacion
                                        System.out.println("Guardando Emisora...");
                                        break;
                                    case 4://cargar estacion
                                        System.out.println("Cargando Emisora Guardada...");
                                        break;
                                    default:
                                        dis.errorOpcion();
                                        break;   
                                }
                                break;
                            case 4://modo reproduccion
                                int opcionRe = dis.menuModoReproduccionC();
                                
                                switch(opcionRe){
                                     
                                }
                                break;
                            case 5: //Modo telefono
                                int opcionModetelefonoC = dis.menuModoTelefonoC();
                                switch(opcionModetelefonoC){
                                    case 1: 
                                        dis.mostrarContactos();
                                        break;
                                    case 2:
                                        dis.llamarContactos();
                                        break;
                                    case 3:
                                        
                                        break;
                                    default:
                                        dis.errorOpcion();
                                        
                                        
                                }
                                break;
                                
                        }
                        break;//break clase A
                    case 2://si se apaga
                        dis.enciendeloOtto();
                        break;
                    default:
                        dis.errorOpcion();
                        break;
                        
                }
                break;
                
                
                
                
                
                
            case 3://Radio clase S
                dis.menuS();
                int encender3 = dis.menu_Apagar_EncenderS();
                   switch(encender3){
                    case 1://si se enciende
                        int opcionS = dis.menuS();
                        switch(opcionS){
                            case 1:
                                dis.menu_Apagar_EncenderS();//menu apagar S
                                break;
                            case 2:
                                dis.volumenNivelS();//volumen de radio S
                                break;
                            case 3://modo radio S
                                int modeRadioS = dis.menuModoRadioS();
                                switch(modeRadioS){
                                    case 1: //cambiar de FM a AM
                                        dis.FMAM();
                                        break;
                                    case 2://cambiar estacion
                                        dis.cambiarEmisoraS();
                                        break;
                                    case 3://guardar estacion
                                        System.out.println("Guardando Emisora...");
                                        break;
                                    case 4://cargar estacion
                                        System.out.println("Cargando Emisora Guardada...");
                                        break;
                                    default:
                                        dis.errorOpcion();
                                        break;   
                                }
                                break;
                            case 4://modo reproduccion
                                int opcionRe = dis.menuModoReproduccionS();
                                
                                switch(opcionRe){
                                     
                                }
                                break;
                            case 5: //Modo telefono
                                int opcionModetelefonoS = dis.menuModoTelefonoS();
                                switch(opcionModetelefonoS){
                                    case 1: 
                                        dis.mostrarContactos();
                                        break;
                                    case 2:
                                        dis.llamarContactos();
                                        break;
                                    case 3:
                                        
                                        break;
                                    default:
                                        dis.errorOpcion();
                                        
                                        
                                }
                                break;
                            case 6:
                                int opcionModeProductividadS = dis.menuModoProductividadS();
                                switch(opcionModeProductividadS){
                                    
                                }
                                break;
                            case 7:
                                dis.menuTipoRadio();
                                break;
                                
                        }
                        break;//break clase A
                    case 2://si se apaga
                        dis.enciendeloOtto();
                        break;
                    default:
                        dis.errorOpcion();
                        break;
                        
                }
                break;
                
                
                
                
                
                
                
            case 4://salir
                stop = true;
                dis.goodbye();
                break;
            default:
                dis.errorOpcion();
                break;
                        
        }
        }
    }
}
        