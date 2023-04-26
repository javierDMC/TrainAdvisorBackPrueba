package es.train.main;

public class SecretarioEmpleado implements Empleados {
	
	// Creación de campo tipo CreacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	
	//Creación del setter para la inyección de dependencia
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
		
	}
	
	
	//Getters y setters
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNombreEmpresa() {
		return nombreEmpresa;
	}



	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
