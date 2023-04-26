package es.train.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Juan = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println("Email: " + Juan.getEmail());
		
		System.out.println("Empresa: " + Juan.getNombreEmpresa());
		
		/*SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		System.out.println("Email: " + Maria.getEmail());
		
		System.out.println("Empresa: " + Maria.getNombreEmpresa());
		
		*/
		contexto.close();

	}

}
