/**
 * interfaz que provee algunos metodos para los diferentes tipos de radio
 * 
 * @author Adrián Flores, Javier Prado
 * @version 15/11/2021
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
	public String llamadaEspera();

	/**
	 * Llama al ultimo contacto en la lista
	 * 
	 * @return string con el ultimo contacto en la lista
	 */
	public String llamarUltimo();

	/**
	 * Cambia entre bocinas y audifonos
	 * 
	 * @return string describiendo la accion
	 */
	public String bocinasAaudifonos();
}