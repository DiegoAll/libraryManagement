import java.util.*;


public class Biblioteca {
	
	static Vector vReferencias = new Vector();
	static Vector vUsuarios = new Vector();


	
	public static void main(String[] args) {
		/*CD cd1 = new CD();
		cd1.setNombre("Los 14 Cañonazos Bailables Vol. 987");
		cd1.setCodigo("12345");
		cd1.setDuracion(104);
		cd1.setAño(2009);
		cd1.setGenero("Salsa");
		cd1.setTipo("Musica");
		
		Revista rev = new Revista();
		rev.setCodigo("95868");
		rev.setNombre("Soho");
		rev.setAño(2008);
		Editorial e = new Editorial();
		e.setNombre("Norma");
		rev.setEditorial(e);
		rev.setEdicion("15");
		rev.setGenero("Porno");
		
		Libro lib = new Libro();
		lib.setNombre("Evolucion de las Especies");
		lib.setCodigo("98765");
		lib.setAño(2003);
		Editorial ed = new Editorial();
		ed.setNombre("Planeta");
		lib.setEditorial(ed);
		lib.setGenero("Terror");
		Autor a1 = new Autor();
		a1.setNombre("Hector Fabio Tobon");
		
		Autor a2 = new Autor();
		a2.setNombre("Diego Alexander Llano");
		
		Autor a3 = new Autor();
		a3.setNombre("León Ochoa");
		lib.vAutores.add(a1);
		lib.vAutores.add(a2);
		lib.vAutores.add(a3);
		
		vReferencias.add(cd1);
		vReferencias.add(rev);
		vReferencias.add(lib);
		
		Usuario u1 = new Usuario();
		u1.setIdentificacion("123456");
		u1.setNombre("Pepito Perez");
		
		
		Prestamo p1 = new Prestamo();
		p1.setFechaInicio(new GregorianCalendar(2009, 4, 20));
		p1.setFechaFin(new GregorianCalendar(2009, 4, 23));
		p1.setObjReferencia(rev);
		
		Prestamo p2 = new Prestamo();
		p2.setFechaInicio(new GregorianCalendar(2009, 4, 29));
		p2.setFechaFin(new GregorianCalendar(2009, 5, 01));
		p2.setObjReferencia(cd1);
		
		Prestamo p3 = new Prestamo();
		p3.setFechaInicio(new GregorianCalendar(2009, 4, 31));
		p3.setFechaFin(new GregorianCalendar(2009, 5, 02));
		p3.setObjReferencia(lib);

		Usuario u2 = new Usuario(); 
		u2.setNombre("Diego Alexander Llano");
		u2.setIdentificacion("98765");
		u2.vPrestamos.add(p1);
		u2.vPrestamos.add(p2);
		u2.vPrestamos.add(p3);
		
		Usuario u3 = new Usuario();
		u3.setIdentificacion("67859");
		u3.setNombre("León Ochoa");
		
		vUsuarios.add(u1);		
		vUsuarios.add(u2);
		vUsuarios.add(u3);*/
		
		FrmPrincipal objVentana = new FrmPrincipal();
		objVentana.setVisible(true);
	}
}