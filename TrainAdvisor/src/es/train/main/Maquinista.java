package es.train.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Maquinista implements Empleados {

	
	/*@Autowired
	public Maquinista(CreacionInformeTren nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Conducir el tren";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe de tren ok";
		return nuevoInforme.getInformeTren();
	}
	
	@Autowired
	@Qualifier("informeTren130")
	private CreacionInformeTren nuevoInforme;

}
