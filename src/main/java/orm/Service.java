package orm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Service implements Mapper {

	@Autowired
	private Mapper mapper;
	
	public List<empleado> SeleccionarEmpleado() {
		return mapper.SeleccionarEmpleado();
	}

	public empleado SeleccionarEmpleadoPorId(int id) {
		return mapper.SeleccionarEmpleadoPorId(id);
	}

	public int InsertaEmpleado(empleado empleado) {
		return mapper.InsertaEmpleado(empleado);
	}

}
