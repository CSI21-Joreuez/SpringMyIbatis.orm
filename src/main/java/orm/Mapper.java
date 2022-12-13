package orm;
 
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface Mapper {

	@Select("SELECT * FROM empleados;")
	public List<empleado> SeleccionarEmpleado();
	
	@Select("SELECT * FROM \"Ejemplo4\".\"Empleados\"\r\n"
			+ "WHERE id = {id}")
	public empleado SeleccionarEmpleadoPorId(@Param("id")int id);
	
	@Insert("INSERT INTO Empleados(id, nombre, apellidos, area_id) VALUES (#{id}, #{nombre}, #{apellidos}, #{area_id}); ")
	public int InsertaEmpleado(empleado empleado);
	
}
