


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
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
                                        System.out.println("Guardando Emisora");
                                        break;
                                    case 4://cargar estacion
                                        System.out.println("Cargando Emisora");
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
                        }
                        break;
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
                break;
            case 3://Radio clase S
                dis.menuS();
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
        