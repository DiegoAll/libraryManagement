import java.util.Vector;


public class Referencia {
	private String codigo;
	private String nombre;
	private String genero;
	private int a�o;
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
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String getCodigo() {
		return codigo;
	}

}
