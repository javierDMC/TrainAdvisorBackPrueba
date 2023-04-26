package es.train.main;

public class DirectorEmpleado implements Empleados {
	
	//Creación de campo tipo CreacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	//Creación de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	

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
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}
	
	
	// metodo init. Ejecutar tareas antes de que el bean esté disponible
	
	public void metodoIncial() {
		
		System.out.println("Dentro del metodo init. Aqui irian las tareas a ejecutar antes de que el bean este listo");
	}
	
	
	// metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	
	public void metodoFinal() {
		
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas a ejecutar despues de utilizar el bean");
	}
	

}
