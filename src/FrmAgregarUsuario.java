import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


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
public class FrmAgregarUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblidentificacion = null;
	private JLabel lblnombre = null;
	private JButton btnAgregar = null;
	private JButton btnCancelar = null;
	private JTextField txtIdentificacion = null;
	private JTextField txtNombre = null;

	/**
	 * This is the default constructor
	 */
	public FrmAgregarUsuario() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		lblnombre = new JLabel();
		lblnombre.setBounds(new Rectangle(61, 121, 164, 18));
		lblnombre.setText("NOMBRE:");
		lblidentificacion = new JLabel();
		lblidentificacion.setBounds(new Rectangle(61, 76, 156, 18));
		lblidentificacion.setText("IDENTIFICACION:");
		this.setLayout(null);
		this.setSize(572, 315);
		this.setTitle("Agregar Usuario");

		this.add(lblidentificacion, null);
		this.add(lblnombre, null);
		this.add(getBtnagregar(), null);
		this.add(getBtncancelar(), null);
		this.add(getTxtidentificacion(), null);
		this.add(getTxtnombre(), null);
		this.setVisible(true);
	}

	/**
	 * This method initializes btnagregar
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnagregar() {
		if (btnAgregar == null) {
			btnAgregar = new JButton();
			btnAgregar.setBounds(new Rectangle(47, 213, 135, 34));
			btnAgregar.setText("AGREGAR");
			btnAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					agregar();
				}

			});
		}
		return btnAgregar;
	}

	public void agregar() {
		String identificacion = txtIdentificacion.getText();
		String nombre = txtNombre.getText();

		Usuario objUsuario = new Usuario();
		objUsuario.setNombre(nombre);
		objUsuario.setIdentificacion(identificacion);

		Biblioteca.vUsuarios.add(objUsuario);

		if (identificacion.equals("") || nombre.equals("")) {
			JOptionPane.showMessageDialog(this,
					"Le falta algun dato para escribir.\nCompruebe nuevamente!", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this,
					"El usuario se ha agregado satisfactoriamente!",
					"Usuario Agregado", JOptionPane.INFORMATION_MESSAGE);
			txtIdentificacion.setText("");
			txtNombre.setText("");
		}

	}

	/**
	 * This method initializes btncancelar
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtncancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton();
			btnCancelar.setBounds(new Rectangle(352, 209, 170, 39));
			btnCancelar.setText("CANCELAR");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					cancelar();
				}
			});
		}
		return btnCancelar;
	}

	/**
	 * This method initializes txtidentificacion
	 * 
	 * @return javax.swing.JTextField
	 */

	private JTextField getTxtidentificacion() {
		if (txtIdentificacion == null) {
			txtIdentificacion = new JTextField();
			txtIdentificacion.setBounds(new Rectangle(255, 75, 180, 20));
		}
		return txtIdentificacion;
	}

	/**
	 * This method initializes txtnombre
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtnombre() {
		if (txtNombre == null) {
			txtNombre = new JTextField();
			txtNombre.setBounds(new Rectangle(255, 119, 182, 20));
		}
		return txtNombre;
	}
	
	public void cancelar() {
		this.dispose();
	}

} // @jve:decl-index=0:visual-constraint="10,10"
