import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
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
public class FrmModificarUsuario extends javax.swing.JFrame {
	private JLabel lblIdentificacion;
	private JComboBox cmbIdentificacion;
	private JLabel lblNombreUsuario;
	private JTextField txtNombreUsuario;
	private JButton btnEliminarUsuario;
	private JButton btnCancelar;
	private JButton btnModificarUsuario;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FrmModificarUsuario inst = new FrmModificarUsuario();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public FrmModificarUsuario() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			this.setPreferredSize(new Dimension(600, 300));
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setVisible(true);
			this.setTitle("Modificar Usuario");
			{
				lblIdentificacion = new JLabel();
				getContentPane().add(lblIdentificacion);
				lblIdentificacion.setText("IDENTIFICACIÓN");
				lblIdentificacion.setBounds(53, 59, 118, 14);
			}
			{
				ComboBoxModel cmbIdentificacionModel = new DefaultComboBoxModel();
				cmbIdentificacion = new JComboBox();
				getContentPane().add(cmbIdentificacion);
				cmbIdentificacion.setModel(cmbIdentificacionModel);
				cmbIdentificacion.setBounds(239, 56, 131, 21);
				cmbIdentificacion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cargarNombreUsuario();
					}
				});
				
			}
			{
				lblNombreUsuario = new JLabel();
				getContentPane().add(lblNombreUsuario);
				lblNombreUsuario.setText("NOMBRE DEL USUARIO:");
				lblNombreUsuario.setBounds(53, 96, 168, 14);
			}
			{
				txtNombreUsuario = new JTextField();
				getContentPane().add(txtNombreUsuario);
				txtNombreUsuario.setBounds(239, 93, 131, 21);
			}
			{
				btnModificarUsuario = new JButton();
				getContentPane().add(btnModificarUsuario);
				btnModificarUsuario.setText("MODIFICAR USUARIO");
				btnModificarUsuario.setBounds(43, 192, 156, 21);
				btnModificarUsuario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						modificarUsuario();
					}
				});
			}
			{
				btnEliminarUsuario = new JButton();
				getContentPane().add(btnEliminarUsuario);
				btnEliminarUsuario.setText("ELIMINAR USUARIO");
				btnEliminarUsuario.setBounds(226, 192, 144, 21);
				btnEliminarUsuario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						eliminarUsuario();
					}
				});
			}
			{
				btnCancelar = new JButton();
				getContentPane().add(btnCancelar);
				btnCancelar.setText("CANCELAR");
				btnCancelar.setBounds(408, 192, 108, 21);
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						cancelar();
					}
				});
			}
			cargarUsuarios();
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cancelar() {
		this.dispose();
		
	}

	public void eliminarUsuario() {
		for(int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
			Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
			if(objUsuario.getIdentificacion().equals(cmbIdentificacion.getSelectedItem())) {
				Biblioteca.vUsuarios.remove(i);
				cargarUsuarios();
				i = Biblioteca.vUsuarios.size();
				JOptionPane.showMessageDialog(this, "El usuario ha sido eliminado correctamente.", "Modificar", JOptionPane.INFORMATION_MESSAGE);
				
	
			}
			
		}
		
	}

	public void modificarUsuario() {
		for(int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
			Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
			if(objUsuario.getIdentificacion().equals(cmbIdentificacion.getSelectedItem())) {
				objUsuario.setNombre(txtNombreUsuario.getText());
				JOptionPane.showMessageDialog(this, "El usuario ha sido modificado correctamente.", "Modificar", JOptionPane.INFORMATION_MESSAGE);
	
			}
			
		}
	}

	public void cargarNombreUsuario() {
		for (int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
			Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
			if (objUsuario.getIdentificacion()
					.equals(cmbIdentificacion.getSelectedItem())) {

				//Llenando el cuadro de texto NOMBRE USUARIO
				txtNombreUsuario.setText(objUsuario.getNombre());
			}
		}

	}

	public void cargarUsuarios() {
		DefaultComboBoxModel objModelo = (DefaultComboBoxModel) cmbIdentificacion
				.getModel();
		objModelo.removeAllElements();
		for (int i = 0; i < Biblioteca.vUsuarios.size(); i++) {
			Usuario objUsuario = (Usuario) Biblioteca.vUsuarios.get(i);
			objModelo.addElement(objUsuario.getIdentificacion());
		}
	}

}
