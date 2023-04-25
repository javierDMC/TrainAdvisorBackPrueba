package es.train.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());*/
		
		Empleados Maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		contexto.close();

	}

}
