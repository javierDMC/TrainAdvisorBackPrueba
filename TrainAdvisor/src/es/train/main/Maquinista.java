package es.train.main;

import org.springframework.stereotype.Component;

@Component("Maquinista")
public class Maquinista implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Conducir el tren";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de tren ok";
	}

}
