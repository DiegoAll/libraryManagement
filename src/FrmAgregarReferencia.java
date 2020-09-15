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
public class FrmAgregarReferencia extends javax.swing.JFrame {
	private JRadioButton radioCD;
	private JRadioButton radioLibro;
	private JButton btnAgregarAutor;
	private JLabel lblTipoReferencia;
	private JButton btnCancelar;
	private JButton btnAgregarReferencia;
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
	private JTextField txtCodigo;
	private JLabel lblAno;
	private JRadioButton radioRevista;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FrmAgregarReferencia inst = new FrmAgregarReferencia();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public FrmAgregarReferencia() {
		super();
		initGUI();
		this.setVisible(true);
	}

	private void initGUI() {
		try {
			this.setPreferredSize(new Dimension(700, 600));
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Agregar Referencia");
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
			radioCD.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent evt) {
					cambiarRadioButton();
				}
			});
			grupoDeRadios.add(radioLibro);
			radioLibro.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent evt) {
					cambiarRadioButton();
				}
			});
			grupoDeRadios.add(radioRevista);
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
				txtCodigo = new JTextField();
				getContentPane().add(txtCodigo);
				txtCodigo.setBounds(135, 89, 155, 21);
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
				btnAgregarReferencia = new JButton();
				getContentPane().add(btnAgregarReferencia);
				btnAgregarReferencia.setText("AGREGAR REFERENCIA");
				btnAgregarReferencia.setBounds(132, 497, 172, 32);
				btnAgregarReferencia.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						agregarReferencia();
					}
				});
			}
			{
				btnCancelar = new JButton();
				getContentPane().add(btnCancelar);
				btnCancelar.setText("CANCELAR");
				btnCancelar.setBounds(357, 496, 131, 32);
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
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void cancelar() {
		this.dispose();		
	}

	public void agregarReferencia() {

		String codigo = txtCodigo.getText();
		String nombre = txtNombre.getText();
		String genero = txtGenero.getText();
		int año = Integer.parseInt(txtAno.getText());
		if (radioCD.isSelected()) {
			if (codigo.equals("") || genero.equals("") || nombre.equals("")
					|| txtAno.getText().equals("")) {
				JOptionPane.showMessageDialog(this,
						"No ha agregado todos los datos", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				CD objCD = new CD();

				objCD.setCodigo(codigo);
				objCD.setNombre(nombre);
				objCD.setGenero(genero);

				int duracion = Integer.parseInt(txtDuracion.getText());
				
				objCD.setDuracion(duracion);

				String tipo = txtTipo.getText();
				objCD.setTipo(tipo);

				DefaultComboBoxModel modelo = (DefaultComboBoxModel) listaAutores
						.getModel();
				for (int i = 0; i < modelo.getSize(); i++) {
					String nombreAutor = (String) modelo.getElementAt(i);
					objCD.vAutores.add(nombreAutor);
				}
				Biblioteca.vReferencias.add(objCD);
			}
		} else {
			if (radioRevista.isSelected()) {
				if (codigo.equals("") || genero.equals("") || nombre.equals("")
						|| txtAno.getText().equals("")) {
					JOptionPane.showMessageDialog(this,
							"No ha agregado todos los datos", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Revista objRevista = new Revista();

					objRevista.setCodigo(codigo);
					objRevista.setNombre(nombre);
					objRevista.setGenero(genero);

					String edicion = txtEdicion.getText();
					objRevista.setEdicion(edicion);

					Editorial objEditorial = new Editorial();
					String editorial = txtEditorial.getText();
					objEditorial.setNombre(txtEditorial.getText());
					objRevista.setEditorial(objEditorial);

					DefaultComboBoxModel modelo = (DefaultComboBoxModel) listaAutores
							.getModel();
					for (int i = 0; i < modelo.getSize(); i++) {
						String nombreAutor = (String) modelo.getElementAt(i);
						objRevista.vAutores.add(nombreAutor);
					}
					Biblioteca.vReferencias.add(objRevista);
				}
			} else {
				if (codigo.equals("") || genero.equals("") || nombre.equals("")
						|| txtAno.getText().equals("")) {
					JOptionPane.showMessageDialog(this,
							"No ha agregado todos los datos", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Libro objLibro = new Libro();

					objLibro.setCodigo(codigo);
					objLibro.setNombre(nombre);
					objLibro.setGenero(genero);

					Editorial objEditorial = new Editorial();
					String editorial = txtEditorial.getText();
					objEditorial.setNombre(txtEditorial.getText());
					objLibro.setEditorial(objEditorial);

					DefaultComboBoxModel modelo = (DefaultComboBoxModel) listaAutores
							.getModel();
					for (int i = 0; i < modelo.getSize(); i++) {
						String nombreAutor = (String) modelo.getElementAt(i);
						objLibro.vAutores.add(nombreAutor);
					}
					Biblioteca.vReferencias.add(objLibro);
				}
			}
		}
		JOptionPane.showMessageDialog(this,
				"La referencia se ha agregado exitosamente!",
				"Agregado Exitoso", JOptionPane.INFORMATION_MESSAGE);
		txtCodigo.setText("");
		txtGenero.setText("");
		txtNombre.setText("");
		txtAno.setText("");
		radioCD.setSelected(false);
		radioRevista.setSelected(false);
		radioLibro.setSelected(false);
		txtDuracion.setText("");
		txtDuracion.setEnabled(false);
		txtTipo.setText("");
		txtTipo.setEnabled(false);
		txtEdicion.setText("");
		txtEdicion.setEnabled(false);
		txtEditorial.setText("");
		txtEditorial.setEnabled(false);
		txtNombreAutor.setText("");
		txtNombreAutor.setEnabled(false);
		DefaultComboBoxModel modelo = (DefaultComboBoxModel) listaAutores.getModel();
		modelo.removeAllElements();
		listaAutores.setEnabled(false);

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
