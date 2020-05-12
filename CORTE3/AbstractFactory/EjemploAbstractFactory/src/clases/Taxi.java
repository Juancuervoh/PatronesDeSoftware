package clases;
import interfaces.Vehiculo;

import javax.swing.JOptionPane;


/**
 * establece el codigo del servicio de taxis
 * 
 *
 */
public class Taxi implements Vehiculo{
	
	private int codigo;
	
	public int generarCodigo()
	{
		/**Generamos un codigo aleatorio para el taxi*/
		int codigoTaxi=(int) (Math.random()*9999);
		return codigoTaxi;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void codigoDeVehiculo() {
		JOptionPane.showMessageDialog(null,"El Codigo del Taxi es : "+getCodigo());
	}

}
