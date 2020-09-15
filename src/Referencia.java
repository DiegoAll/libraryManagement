import java.util.Vector;


public class Referencia {
	private String codigo;
	private String nombre;
	private String genero;
	private int año;
	Vector vAutores = new Vector();
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getCodigo() {
		return codigo;
	}

}
