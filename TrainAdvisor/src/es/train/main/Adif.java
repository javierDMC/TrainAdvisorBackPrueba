package es.train.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Adif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//leer el xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir un bean al contenedor
		
		Empleados Antonio = contexto.getBean("Maquinista", Empleados.class);
		
		//usar el bean
		
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		//cerrar el contexto

		contexto.close();
	}

}
