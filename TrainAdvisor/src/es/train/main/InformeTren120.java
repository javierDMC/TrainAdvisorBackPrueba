package es.train.main;

import org.springframework.stereotype.Component;

@Component
public class InformeTren120 implements CreacionInformeTren {

	@Override
	public String getInformeTren() {
		// TODO Auto-generated method stub
		return "La unidad 120 está operativa";
	}

}
