package es.train.main;

public class SecretarioEmpleado implements Empleados {
	
	// Creación de campo tipo CreacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	
	
	//Creación del setter para la inyección de dependencia
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
		
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario " + informeNuevo.getInforme();
	}

}
