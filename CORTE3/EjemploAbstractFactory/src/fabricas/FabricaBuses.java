package fabricas;
import interfaces.Vehiculo;
import interfaces.VehiculoDeTransporte;

import javax.swing.JOptionPane;

import clases.Bus;

/**
 * permite la creacion de un objeto Bus
 * 
 *
 */
public class FabricaBuses implements VehiculoDeTransporte{
	
	public Vehiculo crearVehiculo() {

		Bus miBus=new Bus();
		miBus.setCodigo(miBus.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Bus  ");
		return miBus;
	}

}
