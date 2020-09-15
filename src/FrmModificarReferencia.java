import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
public class FrmModificarReferencia extends javax.swing.JFrame {
	private JRadioButton radioCD;
	private JRadioButton radioLibro;
	private JButton btnAgregarAutor;
	private JComboBox cmbCodigo;
	private JButton btnEliminarReferencia;
	private JLabel lblTipoReferencia;
	private JButton btnCancelar;
	private JButton btnModificarReferencia;
	private JButton btnEliminarAutor;
	private JList listaAutores;
	private JScrollPane jscroll;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JTextField txtNombreAutor;
	private JLabel jLabel1;
	private JLabel lblReferencia;
	private JLabel lblautor;
	private JTextField txtEditorial;
	private JLabel lblEditorial;
	private JLabel lblRevista;
	private JLabel lblCD;
	private JTextField txtEdicion;
	private JLabel lblEdicion;
	private JTextField txtTipo;
	private JTextField txtDuracion;
	private JTextField txtNombre;
	private JLabel lblDuracion;
	private JLabel lblTipo;
	private JTextField txtAno;
	private JTextField txtGenero;
	private JLabel lblAno;
	private JRadioButton radioRevista;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FrmModificarReferencia inst = new FrmModificarReferencia();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public FrmModificarReferencia() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			this.setPreferredSize(new Dimension(700, 600));
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setVisible(true);
			this.setTitle("Modificar Referencia");
			{
				radioCD = new JRadioButton();
				getContentPane().add(radioCD);
				radioCD.setText("CD");
				radioCD.setBounds(192, 163, 62, 18);
			}
			{
				radioRevista = new JRadioButton();
				getContentPane().add(radioRevista);
				radioRevista.setText("Revista");
				radioRevista.setBounds(265, 163, 81, 18);
			}
			{
				radioLibro = new JRadioButton();
				getContentPane().add(radioLibro);
				radioLibro.setText("Libro");
				radioLibro.setBounds(357, 163, 66, 18);
			}
			ButtonGroup grupoDeRadios = new ButtonGroup();
			grupoDeRadios.add(radioCD);
			radioCD.setEnabled(false);
			radioCD.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent evt) {
					cambiarRadioButton();
				}
			});
			grupoDeRadios.add(radioLibro);
			radioLibro.setEnabled(false);
			radioLibro.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent evt) {
					cambiarRadioButton();
				}
			});
			grupoDeRadios.add(radioRevista);
			radioRevista.setEnabled(false);
			radioRevista.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent evt) {
					cambiarRadioButton();
				}
			});
			{
				lblCodigo = new JLabel();
				getContentPane().add(lblCodigo);
				lblCodigo.setText("CODIGO:");
				lblCodigo.setBounds(58, 92, 74, 14);
			}
			{
				lblNombre = new JLabel();
				getContentPane().add(lblNombre);
				lblNombre.setText("NOMBRE:");
				lblNombre.setBounds(54, 123, 63, 14);
			}
			{
				lblGenero = new JLabel();
				getContentPane().add(lblGenero);
				lblGenero.setText("GÉNERO:");
				lblGenero.setBounds(336, 95, 53, 14);
			}
			{
				lblAno = new JLabel();
				getContentPane().add(lblAno);
				lblAno.setText("AÑO:");
				lblAno.setBounds(336, 123, 30, 14);
			}
			{
				txtNombre = new JTextField();
				getContentPane().add(txtNombre);
				txtNombre.setBounds(135, 120, 155, 21);
			}
			{
				txtGenero = new JTextField();
				getContentPane().add(txtGenero);
				txtGenero.setBounds(395, 92, 114, 21);
			}
			{
				txtAno = new JTextField();
				getContentPane().add(txtAno);
				txtAno.setBounds(395, 120, 114, 21);
			}
			{
				lblDuracion = new JLabel();
				getContentPane().add(lblDuracion);
				lblDuracion.setText("DURACIÓN:");
				lblDuracion.setBounds(84, 200, 77, 14);
			}
			{
				lblTipo = new JLabel();
				getContentPane().add(lblTipo);
				lblTipo.setText("TIPO:");
				lblTipo.setBounds(346, 200, 38, 14);
			}
			{
				txtDuracion = new JTextField();
				getContentPane().add(txtDuracion);
				txtDuracion.setBounds(173, 197, 102, 21);
				txtDuracion.setEnabled(false);
			}
			{
				txtTipo = new JTextField();
				getContentPane().add(txtTipo);
				txtTipo.setBounds(396, 197, 113, 21);
				txtTipo.setEnabled(false);
			}
			{
				lblEdicion = new JLabel();
				getContentPane().add(lblEdicion);
				lblEdicion.setText("EDICIÓN:");
				lblEdicion.setBounds(216, 253, 53, 14);
			}
			{
				txtEdicion = new JTextField();
				getContentPane().add(txtEdicion);
				txtEdicion.setBounds(287, 250, 124, 21);
				txtEdicion.setEnabled(false);
			}
			{
				lblReferencia = new JLabel();
				getContentPane().add(lblReferencia);
				lblReferencia.setText("REFERENCIA");
				lblReferencia.setBounds(569, 109, 99, 17);
			}
			{
				lblCD = new JLabel();
				getContentPane().add(lblCD);
				lblCD.setText("CD");
				lblCD.setBounds(569, 200, 21, 14);
			}
			{
				lblRevista = new JLabel();
				getContentPane().add(lblRevista);
				lblRevista.setText("REVISTA");
				lblRevista.setBounds(569, 253, 73, 14);
			}
			{
				lblEditorial = new JLabel();
				getContentPane().add(lblEditorial);
				lblEditorial.setText("EDITORIAL:");
				lblEditorial.setBounds(216, 305, 74, 14);
			}
			{
				txtEditorial = new JTextField();
				getContentPane().add(txtEditorial);
				txtEditorial.setBounds(290, 302, 124, 21);
				txtEditorial.setEnabled(false);
			}
			{
				lblautor = new JLabel();
				getContentPane().add(lblautor);
				lblautor.setText("AUTOR (ES):");
				lblautor.setBounds(569, 377, 99, 14);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("NOMBRE DEL AUTOR:");
				jLabel1.setBounds(27, 351, 134, 14);
			}
			{
				txtNombreAutor = new JTextField();
				getContentPane().add(txtNombreAutor);
				txtNombreAutor.setBounds(159, 348, 162, 21);
				txtNombreAutor.setEnabled(false);
			}
			{
				jscroll = new JScrollPane();
				getContentPane().add(jscroll);
				jscroll.setBounds(337, 335, 210, 109);
				jscroll
						.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				{
					ListModel listaAutoresModel = new DefaultComboBoxModel();
					listaAutores = new JList();
					jscroll.setViewportView(listaAutores);
					listaAutores.setModel(listaAutoresModel);
					listaAutores.setEnabled(false);

				}
			}
			{
				btnAgregarAutor = new JButton();
				getContentPane().add(btnAgregarAutor);
				btnAgregarAutor.setText("Agregar Autor");
				btnAgregarAutor.setBounds(204, 381, 122, 25);
				btnAgregarAutor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						agregarAutor();
					}
				});
			}
			{
				btnEliminarAutor = new JButton();
				getContentPane().add(btnEliminarAutor);
				btnEliminarAutor.setText("Eliminar Autor");
				btnEliminarAutor.setBounds(204, 417, 122, 26);
				btnEliminarAutor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						eliminarAutor();
					}
				});
			}
			{
				btnModificarReferencia = new JButton();
				getContentPane().add(btnModificarReferencia);
				btnModificarReferencia.setText("MODIFICAR REFERENCIA");
				btnModificarReferencia.setBounds(65, 497, 172, 32);
				btnModificarReferencia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						modificarReferencia();
					}
				});
			}
			{
				btnCancelar = new JButton();
				getContentPane().add(btnCancelar);
				btnCancelar.setText("CANCELAR");
				btnCancelar.setBounds(473, 497, 131, 32);
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cancelar();
					}
				});
			}
			{
				lblTipoReferencia = new JLabel();
				getContentPane().add(lblTipoReferencia);
				lblTipoReferencia.setText("TIPO DE REFERENCIA:");
				lblTipoReferencia.setBounds(53, 165, 127, 14);
			}
			{
				ComboBoxModel cmbCodigoModel = new DefaultComboBoxModel();
				cmbCodigo = new JComboBox();
				getContentPane().add(cmbCodigo);
				cmbCodigo.setModel(cmbCodigoModel);
				cmbCodigo.setBounds(135, 85, 152, 21);
				cmbCodigo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cargarDatos();
					}
				});
			}
			{
				btnEliminarReferencia = new JButton();
				getContentPane().add(btnEliminarReferencia);
				btnEliminarReferencia.setText("ELIMINAR REFERENCIA");
				btnEliminarReferencia.setBounds(271, 497, 179, 32);
				btnEliminarReferencia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						eliminarReferencia();
					}
				});
			}
			cargarCodigos();
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void eliminarReferencia() {
		for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
			Referencia objReferencia = (Referencia) Biblioteca.vReferencias
					.get(i);
			if(objReferencia.getCodigo().equals(cmbCodigo.getSelectedItem())) {
				Biblioteca.vReferencias.remove(i);
				i = Biblioteca.vReferencias.size();
				cargarCodigos();
			}
		}
		
	}

	public void modificarReferencia() {
		for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
			Referencia objReferencia = (Referencia) Biblioteca.vReferencias
					.get(i);
			if (objReferencia.getCodigo().equals(cmbCodigo.getSelectedItem())) {
				// asignando un numero alto para que se salga de la repetitiva.
				i = Biblioteca.vReferencias.size();
				objReferencia.setGenero(txtGenero.getText());
				objReferencia.setAño(Integer.parseInt(txtAno.getText()));
				objReferencia.setNombre(txtNombre.getText());
				objReferencia.vAutores.removeAllElements();

				// Pasando todos los autores que estàn en la interfaz grafica al
				// vector de autores que tiene referencia.
				DefaultComboBoxModel objModelo = (DefaultComboBoxModel) listaAutores
						.getModel();
				for (int j = 0; j < objModelo.getSize(); j++) {
					Autor objAutor = new Autor();
					objAutor.setNombre((String) objModelo.getElementAt(j));
					objReferencia.vAutores.add(objAutor);
				}

				if (radioCD.isSelected()) {
					CD objCD = (CD) objReferencia;
					objCD.setDuracion(Integer.parseInt(txtDuracion.getText()));
					objCD.setTipo(txtTipo.getText());
				}
				if (radioRevista.isSelected()) {
					Revista objRevista = (Revista) objReferencia;
					objRevista.setEdicion(txtEdicion.getText());
					Editorial objEditorial = new Editorial();
					objEditorial.setNombre(txtEditorial.getText());
					objRevista.setEditorial(objEditorial);
				}
				if (radioLibro.isSelected()) {
					Libro objLibro = (Libro) objReferencia;
					Editorial objEditorial = new Editorial();
					objEditorial.setNombre(txtEditorial.getText());
					objLibro.setEditorial(objEditorial);
				}
				JOptionPane.showMessageDialog(this, "LA Referencia ha sido modificada exitosamente!", "Modificacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

	public void cancelar() {
		this.dispose();

	}

	public void cargarCodigos() {
		DefaultComboBoxModel objModelo = (DefaultComboBoxModel) cmbCodigo
				.getModel();
		objModelo.removeAllElements();
		for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
			Referencia objReferencia = (Referencia) Biblioteca.vReferencias
					.get(i);
			objModelo.addElement(objReferencia.getCodigo());
		}

	}

	public void cargarDatos() {
		for (int i = 0; i < Biblioteca.vReferencias.size(); i++) {
			Referencia objReferencia = (Referencia) Biblioteca.vReferencias
					.get(i);

			if (objReferencia.getCodigo().equals(cmbCodigo.getSelectedItem())) {

				// Llenando todos los cuadros de texto y demàs informacion de la
				// ventana:
				txtNombre.setText(objReferencia.getNombre());
				txtGenero.setText(objReferencia.getGenero());
				txtAno.setText("" + objReferencia.getAño());

				// Cargando en la lista los autores que tiene la referencia.
				DefaultComboBoxModel objModelo = (DefaultComboBoxModel) listaAutores
						.getModel();
				objModelo.removeAllElements();
				for (int j = 0; j < objReferencia.vAutores.size(); j++) {
					Autor objAutor = (Autor) objReferencia.vAutores.get(j);
					objModelo.addElement(objAutor.getNombre());
				}
				if (objReferencia instanceof CD) {
					CD objCD = (CD) objReferencia;
					radioCD.setSelected(true);
					// Estoy convirtiendo un entero a String. y meto el
					// resultado en el cuadro de texto.
					txtDuracion.setText("" + objCD.getDuracion());
					txtTipo.setText(objCD.getTipo());
					txtEditorial.setText("");
					txtEdicion.setText("");
				}
				if (objReferencia instanceof Revista) {
					Revista objRevista = (Revista) objReferencia;
					radioRevista.setSelected(true);
					txtEdicion.setText(objRevista.getEdicion());
					txtEditorial.setText(objRevista.getEditorial().getNombre());
					txtDuracion.setText("");
					txtTipo.setText("");
				}
				if (objReferencia instanceof Libro) {
					Libro objLibro = (Libro) objReferencia;
					radioLibro.setSelected(true);
					txtEditorial.setText(objLibro.getEditorial().getNombre());
					txtDuracion.setText("");
					txtEdicion.setText("");
					txtTipo.setText("");
				}
			}
		}

	}

	public void eliminarAutor() {
		int posicionSeleccionado = listaAutores.getSelectedIndex();

		if (posicionSeleccionado >= 0) {
			DefaultComboBoxModel modelo = (DefaultComboBoxModel) listaAutores
					.getModel();
			modelo.removeElementAt(posicionSeleccionado);
		}

	}

	public void agregarAutor() {
		String nombreAutor = txtNombreAutor.getText();
		if (nombreAutor.equals("")) {
			JOptionPane
					.showMessageDialog(
							this,
							"No ha escrito nada en Nombre Autor\nVerifique Nuevamente!",
							"Error", JOptionPane.ERROR_MESSAGE);
		} else {
			DefaultComboBoxModel autores = (DefaultComboBoxModel) listaAutores
					.getModel();
			autores.addElement(nombreAutor);
			txtNombreAutor.setText("");
		}

	}

	public void cambiarRadioButton() {
		if (radioCD.isSelected()) {
			txtDuracion.setEnabled(true);
			txtTipo.setEnabled(true);
			txtEdicion.setEnabled(false);
			txtEditorial.setEnabled(false);
			txtNombreAutor.setEnabled(true);
			listaAutores.setEnabled(true);
		}
		if (radioLibro.isSelected()) {
			txtDuracion.setEnabled(false);
			txtTipo.setEnabled(false);
			txtEdicion.setEnabled(false);
			txtEditorial.setEnabled(true);
			txtNombreAutor.setEnabled(true);
			listaAutores.setEnabled(true);
		}
		if (radioRevista.isSelected()) {
			txtDuracion.setEnabled(false);
			txtTipo.setEnabled(false);
			txtEdicion.setEnabled(true);
			txtEditorial.setEnabled(true);
			txtNombreAutor.setEnabled(true);
			listaAutores.setEnabled(true);
		}

	}

}
