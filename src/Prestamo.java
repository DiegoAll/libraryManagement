
import java.util.*;
public class Prestamo {
	private String codigo;
	private GregorianCalendar fechaInicio;
	private GregorianCalendar fechaFin;
	// Un objeto prestamo tiene un objeto referencia
	private Referencia objReferencia;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public GregorianCalendar getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(GregorianCalendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public GregorianCalendar getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(GregorianCalendar fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Referencia getObjReferencia() {
		return objReferencia;
	}
	public void setObjReferencia(Referencia objReferencia) {
		this.objReferencia = objReferencia;
	}
	
	
}
