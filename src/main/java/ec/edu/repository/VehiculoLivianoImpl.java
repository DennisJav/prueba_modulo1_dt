package ec.edu.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import ec.edu.modelo.Vehiculo;

@Repository

public class VehiculoLivianoImpl implements IVehiculo{

	public static final Logger LOG = LoggerFactory.getLogger(VehiculoLivianoImpl.class);
	
	@Override
	public void matricularVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		LOG.info("Se matriculo el vehiculo"+ vehiculo);
	}

	@Override
	public void imprimirVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		LOG.info("Datos de vehiculo"+ vehiculo);
	}

	
	

}
