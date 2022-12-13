package orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	Service servicio = (Service) context.getBean("service");
	
	empleado empl = new empleado();
	empl.setId(5);
	empl.setNombre("Juan");
	empl.setApellidos("Orea Rodr");
	empl.setArea_id(2);

	int res = servicio.InsertaEmpleado(empl);
	if(res==1)
	{
		System.out.println("Obejto Empleado se ha Añadido Correctamente");
	}else
		System.out.println("Problemas con el registro");
		
}
}
