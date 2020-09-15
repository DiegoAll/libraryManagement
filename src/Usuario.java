import java.util.*;

public class Usuario {
	
	Vector vPrestamos = new Vector();
	private String identificacion;
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	
	
}
