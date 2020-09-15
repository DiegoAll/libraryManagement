import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.SwingUtilities;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class FrmGestionarMultasPrestamos extends javax.swing.JFrame {
	private JPanel jPanel;
	private JRadioButton btnRevista;
	private JLabel lblGenero;
	private JLabel FechaInicio;
	private JButton btnEliminarPrestamo;
	private JList listaPrestamos;
	private JScrollPane jScrollPane1;
	private JLabel lblSi;
	private JLabel lbltienemultas;
	private JPanel jPanel2;
	private JButton btnAgregarPrestamo;
	private JLabel lblFechaEntrega;
	private JTextField txtFechaEntrega;
	private JLabel lblAno;
	private JLabel lblNombre;
	private JLabel lblNombreUsuario;
	private JLabel Ano;
	private JLabel Genero;
	private JLabel Nombre;
	private JRadioButton btnLibro;
	private JRadioButton btnCD;
	private JComboBox cmbIdentificacionUsuario;
	private ButtonGroup bg;
	private JComboBox cmbReferencias;
	private JButton btnSalir;
	private JPanel jPanel4;
	private JLabel lblRecargo;
	private JLabel Recargo;
	private JLabel lblNombreReferencia;
	private JLabel lblTipoReferencia;
	private JLabel lblFechaFin;
	private JLabel lblFechaInicio;
	private JLabel jLabel1;
	private JLabel TipoReferencia;
	private JLabel FechaFin;
	private JLabel lblUsuarios;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FrmGestionarMultasPrestamos inst = new FrmGestionarMultasPrestamos();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public FrmGestionarMultasPrestamos() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			this.setPreferredSize(new Dimension(800, 630));
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setVisible(true);
			this.setTitle("GESTIONAR MULTAS Y PRESTAMOS");
			{
				jPanel = new JPanel();
				getContentPane().add(jPanel);
				jPanel.setBounds(345, 232, 425, 311);
				jPanel.setLayout(null);
				jPanel.setBorder(BorderFactory.createTitledBorder("Prestamos"));
				{
					jScrollPane1 = new JScrollPane();
					jPanel.add(jScrollPane1);
					jScrollPane1.setBounds(16, 31, 199, 100);
					jScrollPane1
							.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
					jScrollPane1.setAutoscrolls(true);
					jScrollPane1.setSize(200, 100);
					{
						ListModel jList1Model = new DefaultComboBoxModel();
						listaPrestamos = new JList();
						jScrollPane1.setViewportView(listaPrestamos);
						listaPrestamos.setModel(jList1Model);
						listaPrestamos.setPreferredSize(new java.awt.Dimension(
								182, 97));
						listaPrestamos
								.addListSelectionListener(new ListSelectionListener() {
									public void valueChanged(
											ListSelectionEvent evt) {
										cargarDatosPrestamo();
									}
								});
					}
				}
				{
					btnEliminarPrestamo = new JButton();
					jPanel.add(btnEliminarPrestamo);
					btnEliminarPrestamo.setText("ELIMINAR PRESTAMO");
					btnEliminarPrestamo.setBounds(232, 52, 175, 37);
					btnEliminarPrestamo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							eliminarPrestamo();
						}
					});
				}
				{
					FechaInicio = new JLabel();
					jPanel.add(FechaInicio);
					FechaInicio.setText("FECHA INICIO:");
					FechaInicio.setBounds(17, 149, 108, 25);
					FechaInicio.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					FechaFin = new JLabel();
					jPanel.add(FechaFin);
					FechaFin.setText("FECHA ENTREGA:");
					FechaFin.setBounds(17, 178, 108, 20);
					FechaFin.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					TipoReferencia = new JLabel();
					jPanel.add(TipoReferencia);
					TipoReferencia.setText("TIPO DE REFERENCIA:");
					TipoReferencia.setBounds(17, 210, 154, 14);
					TipoReferencia.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					jLabel1 = new JLabel();
					jPanel.add(jLabel1);
					jLabel1.setText("NOMBRE DE LA REFRENCIA:");
					jLabel1.setBounds(17, 243, 159, 14);
					jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					lblFechaInicio = new JLabel();
					jPanel.add(lblFechaInicio);
					lblFechaInicio.setBounds(188, 154, 105, 14);
				}
				{
					lblFechaFin = new JLabel();
					jPanel.add(lblFechaFin);
					lblFechaFin.setBounds(188, 181, 99, 14);
				}
				{
					lblTipoReferencia = new JLabel();
					jPanel.add(lblTipoReferencia);
					lblTipoReferencia.setBounds(189, 210, 53, 14);
				}
				{
					lblNombreReferencia = new JLabel();
					jPanel.add(lblNombreReferencia);
					lblNombreReferencia.setBounds(188, 243, 202, 14);
				}
				{
					Recargo = new JLabel();
					jPanel.add(Recargo);
					Recargo.setText("RECARGO:");
					Recargo.setBounds(17, 275, 81, 14);
					Recargo.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					lblRecargo = new JLabel();
					jPanel.add(lblRecargo);
					lblRecargo.setBounds(188, 275, 111, 14);
				}
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2);
				jPanel2.setBounds(49, 254, 270, 141);
				jPanel2.setLayout(null);
				jPanel2.setBorder(BorderFactory.createTitledBorder(null,
						"Multas", TitledBorder.LEADING, TitledBorder.TOP));
				{
					lbltienemultas = new JLabel();
					jPanel2.add(lbltienemultas);
					lbltienemultas.setText("¿ TIENE MULTAS ?");
					lbltienemultas.setBounds(59, 35, 185, 26);
					lbltienemultas.setFont(new java.awt.Font("Arial Black", 0,
							12));
				}
				{
					lblSi = new JLabel();
					jPanel2.add(lblSi);
					lblSi.setText("SI");
					lblSi.setBounds(91, 67, 68, 46);
					lblSi.setFont(new java.awt.Font("Arial Black", 0, 28));
					lblSi.setHorizontalAlignment(SwingConstants.CENTER);
				}
			}
			{
				jPanel4 = new JPanel();
				getContentPane().add(jPanel4);
				jPanel4.setBounds(25, 22, 745, 198);
				jPanel4.setBorder(BorderFactory
						.createTitledBorder("Ingresar Prestamo"));
				jPanel4.setLayout(null);
				{
					btnRevista = new JRadioButton();
					jPanel4.add(btnRevista);
					btnRevista.setText("REVISTA");
					btnRevista.setBounds(645, 23, 76, 18);
					btnRevista.addChangeListener(new ChangeListener() {
						public void stateChanged(ChangeEvent evt) {
							cargarReferencias();
						}
					});
					getBg().add(btnRevista);
				}
				{
					btnLibro = new JRadioButton();
					jPanel4.add(btnLibro);
					btnLibro.setText("LIBRO");
					btnLibro.setBounds(553, 23, 62, 18);
					btnLibro.addChangeListener(new ChangeListener() {
						public void stateChanged(ChangeEvent evt) {
							cargarReferencias();
						}
					});
					getBg().add(btnLibro);
				}
				{
					btnCD = new JRadioButton();
					jPanel4.add(btnCD);
					btnCD.setText("CD");
					btnCD.setBounds(455, 23, 44, 18);
					btnCD.addChangeListener(new ChangeListener() {
						public void stateChanged(ChangeEvent evt) {
							cargarReferencias();
						}
					});
					getBg().add(btnCD);
				}
				{
					lblAno = new JLabel();
					jPanel4.add(lblAno);
					lblAno.setBounds(417, 167, 311, 14);
				}
				{
					lblGenero = new JLabel();
					jPanel4.add(lblGenero);
					lblGenero.setBounds(417, 141, 311, 14);
				}
				{
					lblNombre = new JLabel();
					jPanel4.add(lblNombre);
					lblNombre.setBounds(417, 115, 311, 14);
				}
				{
					Ano = new JLabel();
					jPanel4.add(Ano);
					Ano.setText("AÑO:");
					Ano.setBounds(360, 166, 45, 14);
					Ano.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					Genero = new JLabel();
					jPanel4.add(Genero);
					Genero.setText("GENERO:");
					Genero.setBounds(360, 140, 54, 14);
					Genero.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					Nombre = new JLabel();
					jPanel4.add(Nombre);
					Nombre.setText("NOMBRE:");
					Nombre.setBounds(360, 114, 66, 14);
					Nombre.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					lblUsuarios = new JLabel();
					jPanel4.add(lblUsuarios);
					lblUsuarios.setText("IDENTIFICACIÓN  DEL USUARIO:");
					lblUsuarios.setBounds(63, 17, 234, 22);
					lblUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11));
					lblUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
				}
				{
					ComboBoxModel cmbUsuariosModel = new DefaultComboBoxModel();
					cmbIdentificacionUsuario = new JComboBox();
					jPanel4.add(cmbIdentificacionUsuario);
					cmbIdentificacionUsuario.setModel(cmbUsuariosModel);
					cmbIdentificacionUsuario.setBounds(95, 41, 145, 21);
					cmbIdentificacionUsuario
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									cargarDatosUsuario();
								}
							});
				}
				{
					lblNombreUsuario = new JLabel();
					jPanel4.add(lblNombreUsuario);
					lblNombreUsuario.setText("PEPITO PEREZ QUIÑONEZ");
					lblNombreUsuario.setBounds(17, 68, 336, 26);
					lblNombreUsuario.setFont(new java.awt.Font("Arial", 0, 18));
					lblNombreUsuario
							.setForeground(new java.awt.Color(0, 0, 255));
					lblNombreUsuario
							.setHorizontalAlignment(SwingConstants.CENTER);
				}
				{
					btnAgregarPrestamo = new JButton();
					jPanel4.add(btnAgregarPrestamo);
					btnAgregarPrestamo.setText("AGREGAR PRESTAMO");
					btnAgregarPrestamo.setBounds(97, 139, 163, 33);
					btnAgregarPrestamo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							agregarPrestamo();
						}
					});
				}
				{
					lblFechaEntrega = new JLabel();
					jPanel4.add(lblFechaEntrega);
					lblFechaEntrega.setText("FECHA DE ENTREGA:");
					lblFechaEntrega.setBounds(50, 109, 125, 14);
					lblFechaEntrega.setFont(new java.awt.Font("Tahoma", 1, 11));
				}
				{
					txtFechaEntrega = new JTextField();
					jPanel4.add(txtFechaEntrega);
					txtFechaEntrega.setText("DD/MM/YYYY");
					txtFechaEntrega.setBounds(180, 106, 128, 21);
				}
				{
					ComboBoxModel cmbReferenciasModel = new DefaultComboBoxModel();
					cmbReferencias = new JComboBox();
					jPanel4.add(cmbReferencias);
					cmbReferencias.setModel(cmbReferenciasModel);
					cmbReferencias.setBounds(467, 50, 235, 21);
					cmbReferencias.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							cargarDatosReferencia();
						}
					});
				}
			}
			{
				btnSalir = new JButton();
				getContentPane().add(btnSalir);
				btnSalir.setText("SALIR");
				btnSalir.setBounds(121, 444, 114, 39);
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						salir();
					}
				});
			}
			cargarUsuarios();
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agregarPrestamo() {
		try {

			String fecha = txtFechaEntrega.getText();
			String[] partes = fecha.split("/");

			int dia = Integer.parseInt(partes[0]);
			int mes = Integer.parseInt(partes[1])-1;
			int año = Integer.parseInt(partes[2]);
			GregorianCalendar objFechaEntrega = new GregorianCalendar(año, mes,
					dia);
			Usuario objUsuarioSeleccionado = null;

			for (int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
				Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
				if (objUsuario.getIdentificacion().equals(
						cmbIdentificacionUsuario.getSelectedItem())) {
					i = Biblioteca.vUsuarios.size();
					objUsuarioSeleccionado = objUsuario;
				}
			}

			Referencia objReferenciaSeleccionada = null;
			for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
				Referencia objReferencia = (Referencia) Biblioteca.vReferencias
						.get(i);
				if (objReferencia.getCodigo().equals(
						cmbReferencias.getSelectedItem())) {
					i = Biblioteca.vReferencias.size();
					objReferenciaSeleccionada = objReferencia;
				}
			}

			if (objReferenciaSeleccionada != null) {
				Prestamo objPrestamo = new Prestamo();
				objPrestamo.setFechaFin(objFechaEntrega);
				objPrestamo.setFechaInicio(new GregorianCalendar());
				objPrestamo.setObjReferencia(objReferenciaSeleccionada);
				if(objUsuarioSeleccionado.vPrestamos.size() < 3) {
					objUsuarioSeleccionado.vPrestamos.add(objPrestamo);
					DefaultComboBoxModel objModelo = (DefaultComboBoxModel) listaPrestamos.getModel();
					objModelo.addElement(objReferenciaSeleccionada.getNombre());
					boolean tieneMulta = false;
					for (int j = 0; j < objUsuarioSeleccionado.vPrestamos.size(); j++) {
						Prestamo objPres = (Prestamo) objUsuarioSeleccionado.vPrestamos
								.get(j);
						// Averiguando si tiene alguna multa:
						GregorianCalendar objFechaHoy = new GregorianCalendar();
						if (objPres.getFechaFin().before(objFechaHoy)) {
							tieneMulta = true;
						}
					}

					if (tieneMulta) {
						// lblSi.setFont(lblSi.getFont().)
						lblSi.setForeground(Color.RED);
						lblSi.setText("SI");
					} else {
						lblSi.setForeground(Color.BLACK);
						lblSi.setText("NO");
					}
					
				} else {
					JOptionPane
					.showMessageDialog(
							this,
							"El usuario solamente puede tener màximo 3 referencias prestadas.",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane
						.showMessageDialog(
								this,
								"Para agregar un prestamos, debe primero seleccionar una referencia.",
								"Error", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(
							this,
							"La fecha de entrega tiene un formato incorrecto.\nAsegurese de ingresar el formato DD/MM/YYYY\nEn donde DD = Dia; MM = Mes; YYYY = Año.",
							"Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void salir() {
		this.dispose();

	}

	public void eliminarPrestamo() {
		String prestamoSeleccionado = (String) listaPrestamos
				.getSelectedValue();
		if (prestamoSeleccionado != null) {

			for (int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
				Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
				if (objUsuario.getIdentificacion().equals(
						cmbIdentificacionUsuario.getSelectedItem())) {
					i = Biblioteca.vUsuarios.size();
					for (int j = 0; j < objUsuario.vPrestamos.size(); j++) {
						Prestamo objPrestamo = (Prestamo) objUsuario.vPrestamos
								.get(j);
						if (objPrestamo.getObjReferencia().getNombre().equals(
								prestamoSeleccionado)) {
							objUsuario.vPrestamos.remove(j);
							j = objUsuario.vPrestamos.size();
							cargarDatosUsuario();
							lblFechaInicio.setText("");
							lblFechaFin.setText("");
							lblTipoReferencia.setText("");
							lblNombreReferencia.setText("");
							lblRecargo.setText("");
						}
					}

				}
			}
		}

	}

	protected void cargarDatosPrestamo() {
		for (int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
			Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
			if (objUsuario.getIdentificacion().equals(
					cmbIdentificacionUsuario.getSelectedItem())) {

				i = Biblioteca.vUsuarios.size();
				// Llenando el cuadro de texto NOMBRE USUARIO

				// Cargando todos los posibles prestamos que tiene dicho
				// usuario:
				DefaultComboBoxModel objModelo = (DefaultComboBoxModel) listaPrestamos
						.getModel();

				for (int j = 0; j < objUsuario.vPrestamos.size(); j++) {
					Prestamo objPrestamo = (Prestamo) objUsuario.vPrestamos
							.get(j);

					if (objPrestamo.getObjReferencia().getNombre().equals(
							listaPrestamos.getSelectedValue())) {
						Referencia objReferencia = objPrestamo
								.getObjReferencia();
						int añoInicio = objPrestamo.getFechaInicio().get(
								Calendar.YEAR);
						int mesInicio = objPrestamo.getFechaInicio().get(
								Calendar.MONTH)+1;
						int diaInicio = objPrestamo.getFechaInicio().get(
								Calendar.DATE);
						String fechaInicio = diaInicio + "/" + mesInicio + "/"
								+ añoInicio;
						lblFechaInicio.setText(fechaInicio);

						int añoFin = objPrestamo.getFechaFin().get(
								Calendar.YEAR);
						int mesFin = objPrestamo.getFechaFin().get(
								Calendar.MONTH)+1;
						int diaFin = objPrestamo.getFechaFin().get(
								Calendar.DATE);
						String fechaFin = diaFin + "/" + mesFin + "/" + añoFin;
						lblFechaFin.setText(fechaFin);

						if (objReferencia instanceof CD) {
							lblTipoReferencia.setText("CD");
						}
						if (objReferencia instanceof Revista) {
							lblTipoReferencia.setText("Revista");
						}
						if (objReferencia instanceof Libro) {
							lblTipoReferencia.setText("Libro");
						}
						lblNombreReferencia.setText(objReferencia.getNombre());

						// Calculando el recargo:
						// 1970-------------------------------------------------HOY
						// 1970------------------------------|||||||||||||||||||HOY
						GregorianCalendar objFechaHoy = new GregorianCalendar();
						if (objPrestamo.getFechaFin().before(objFechaHoy)) {
							// Milisegundos cuando debiò haber entregado la
							// referencia:
							long milisegundosFechaEntrega = objPrestamo
									.getFechaFin().getTimeInMillis();

							// Milisegundos que van hasta la fecha de hoy:
							long milisegundosFechaHoy = objFechaHoy
									.getTimeInMillis();

							// Milisegundos que han pasado desde que tenia que
							// haber entregado la referencia hasta hoy:
							long milisegundosTranscurridos = milisegundosFechaHoy
									- milisegundosFechaEntrega;

							// Transformando los milisegundos en dias.
							long dias = milisegundosTranscurridos / 1000 / 60
									/ 60 / 24;
							int recargo = (int) (1000 * dias);
							lblRecargo.setText("$ " + recargo); // pasando de
							// entero a
							// String.

						} else {
							// No tiene recargo
							lblRecargo.setText("$ 0");
						}
					}
				}

			}
		}

	}

	public void cargarDatosReferencia() {
		for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
			Referencia objReferencia = (Referencia) Biblioteca.vReferencias
					.get(i);
			if (objReferencia.getCodigo().equals(
					cmbReferencias.getSelectedItem())) {

				lblNombre.setText(objReferencia.getNombre());
				lblGenero.setText(objReferencia.getGenero());

				// Se debe transformar el entero a String
				lblAno.setText("" + objReferencia.getAño());

			}
		}

	}

	public void cargarReferencias() {
		DefaultComboBoxModel objModelo = (DefaultComboBoxModel) cmbReferencias
				.getModel();
		objModelo.removeAllElements();

		// Agregando del vector referencia los objetos que pertenecen solamente
		// a CD
		if (btnCD.isSelected()) {
			for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
				Referencia objReferencia = (Referencia) Biblioteca.vReferencias
						.get(i);
				if (objReferencia instanceof CD) {
					objModelo.addElement(objReferencia.getCodigo());
				}
			}
		}

		// Agregando del vector referencia los objetos que pertenecen solamente
		// a Libro
		if (btnLibro.isSelected()) {
			for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
				Referencia objReferencia = (Referencia) Biblioteca.vReferencias
						.get(i);
				if (objReferencia instanceof Libro) {
					objModelo.addElement(objReferencia.getCodigo());
				}
			}
		}

		// Agregando del vector referencia los objetos que pertenecen solamente
		// a Revista
		if (btnRevista.isSelected()) {
			for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
				Referencia objReferencia = (Referencia) Biblioteca.vReferencias
						.get(i);
				if (objReferencia instanceof Revista) {
					objModelo.addElement(objReferencia.getCodigo());
				}
			}
		}

	}

	protected void cargarDatosUsuario() {
		for (int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
			Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
			if (objUsuario.getIdentificacion().equals(
					cmbIdentificacionUsuario.getSelectedItem())) {

				i = Biblioteca.vUsuarios.size();
				// Llenando el cuadro de texto NOMBRE USUARIO
				lblNombreUsuario.setText(objUsuario.getNombre());

				// Cargando todos los posibles prestamos que tiene dicho
				// usuario:
				DefaultComboBoxModel objModelo = (DefaultComboBoxModel) listaPrestamos
						.getModel();
				objModelo.removeAllElements();
				boolean tieneMulta = false;
				for (int j = 0; j < objUsuario.vPrestamos.size(); j++) {
					Prestamo objPrestamo = (Prestamo) objUsuario.vPrestamos
							.get(j);
					Referencia objReferencia = objPrestamo.getObjReferencia();
					objModelo.addElement(objReferencia.getNombre());

					// Averiguando si tiene alguna multa:
					GregorianCalendar objFechaHoy = new GregorianCalendar();
					if (objPrestamo.getFechaFin().before(objFechaHoy)) {
						tieneMulta = true;
					}
				}

				if (tieneMulta) {
					// lblSi.setFont(lblSi.getFont().)
					lblSi.setForeground(Color.RED);
					lblSi.setText("SI");
				} else {
					lblSi.setForeground(Color.BLACK);
					lblSi.setText("NO");
				}

			}
		}

	}

	public void cargarUsuarios() {
		DefaultComboBoxModel objModelo = (DefaultComboBoxModel) cmbIdentificacionUsuario
				.getModel();
		objModelo.removeAllElements();
		for (int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
			Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
			objModelo.addElement(objUsuario.getIdentificacion());
		}

	}

	private ButtonGroup getBg() {
		if (bg == null) {
			bg = new ButtonGroup();
		}
		return bg;
	}

}
