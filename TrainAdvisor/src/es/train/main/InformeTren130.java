package es.train.main;

import org.springframework.stereotype.Component;

@Component
public class InformeTren130 implements CreacionInformeTren {

	@Override
	public String getInformeTren() {
		// TODO Auto-generated method stub
		return "La unidad 130 está operativa";
	}

}
