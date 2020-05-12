package fabricas;

import interfaces.Vehiculo;
import interfaces.VehiculoDeTransporte;

/**
 * permite la creacion de un servicio 
 * 
 *
 */
public class FabricaDeVehiculos {
	
	public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory)
	{
		/**Aplicamos Polimorfismo*/
		Vehiculo objetoVehiculo= factory.crearVehiculo();
		objetoVehiculo.codigoDeVehiculo();
	}

}
