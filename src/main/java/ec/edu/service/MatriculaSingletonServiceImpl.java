package ec.edu.service;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ec.edu.repository.VehiculoLivianoImpl;

@Service
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MatriculaSingletonServiceImpl implements IMatriculaService{
	public static final Logger LOG = LoggerFactory.getLogger(MatriculaSingletonServiceImpl.class);
	@Override
	public void calcularMatricula(double precio, int tipo) {
		// TODO Auto-generated method stub
		
		if(tipo==1) {
			double valorMaticula = precio * (25/100);
			if(precio<0) {
				LOG.error("Error precio 0");
			}if(precio > 0 && precio < 10000 ) {
				LOG.warn("Precio bajo promedio");
			}if(precio>10000) {
				LOG.info("PRECIO CORRECTO");
			}
			
		}else if(tipo==2) {
			double valorMAtricula = precio * (25/100);
			if(precio<0) {
				LOG.error("Error precio 0");
			}if(precio > 0 && precio < 10000 ) {
				LOG.warn("Precio bajo promedio");
			}if(precio>10000) {
				LOG.info("PRECIO CORRECTO");
			}
			
		}
		
	}

}
