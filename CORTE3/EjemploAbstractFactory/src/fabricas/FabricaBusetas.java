package fabricas;
import interfaces.Vehiculo;
import interfaces.VehiculoDeTransporte;

import javax.swing.JOptionPane;

import clases.Buseta;


/**
 * permite la creacion de un objeto Buseta
 * 
 *
 */
public class FabricaBusetas implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Buseta miBuseta=new Buseta();
		miBuseta.setCodigo(miBuseta.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Buseta  ");
		return miBuseta;
	}



}
