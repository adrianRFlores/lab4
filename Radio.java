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

interface Radio{

	/**
	 * Devuelve el pronostico del tiempo
	 * 
	 * @return string con el pronostico del tiempo
	 */
	public String pronosticoTiempo();

	/**
	 * Devuelve el contenido de una tarjeta de presentación
	 * 
	 * @return una tarjeta de presentación
	 */
	public String tarjetasPresentacion();

	/**
	 * Devuelve el planeo de viajes
	 * 
	 * @return los viajes
	 */
	public String viajes();

	/**
	 * Devuelve la llamada en espera y cambia de llamada
	 * 
	 * @return la llamada en espera
	 */
	public void llamadaEspera();

	/**
	 * Llama al ultimo contacto en la lista
	 * 
	 * @return string con el ultimo contacto en la lista
	 */
	public void llamarUltimo();

	/**
	 * Cambia entre bocinas y audifonos
	 * 
	 * @return string describiendo la accion
	 */
	public void bocinasAaudifonos();
}

