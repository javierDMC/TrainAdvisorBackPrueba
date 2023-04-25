package es.train.main;

public class JefeEmpleado implements Empleados {

	// Creación de campo tipo CreacionInforme(interfaz)
	private CreacionInformes informeNuevo;

	// Creación de constructor que inyecta la dependencia
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono las cuestione relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}

}
