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
 * Funcionalidad - clase padre, a traves de esta se heredan los atributos a sus clases hijas (A, C y S))
 *
 */

public class mercedezBenz {
    private String tipoRadio;
    private int volumen;
    private double estacion;

    public double getEstacion() {
        return estacion;
    }

    public void setEstacion(double estacion) {
        this.estacion = estacion;
    }
    public void setEstacion() {
        estacion += 0.5;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }
    
     public void setVolumenup() {
        volumen++;
    }
     public void setVolumendown(){
         volumen--;
     }
     
      public void info() {
        System.out.println("Volumen: " + getVolumen());
    }
      public void estacionmostrar(){
          System.out.println("Estacion: "+ getEstacion());
          
      }
    
}
