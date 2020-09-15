

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class FrmPrincipal extends javax.swing.JFrame {
	private JLabel TituloBiblioteca;
	private JPanel jPanel1;
	private JButton btnManejoPrestamos;
	private JButton btnConsultarDeudores;
	private JLabel Informes;
	private JPanel jPanel3;
	private JLabel Prestamos;
	private JPanel jPanel2;
	private JButton btnModificarReferencia;
	private JButton btnModificarUsuario;
	private JButton btnAgregarReferencia;
	private JButton btnAgregarUsuario;
	private JLabel Administracion;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FrmPrincipal inst = new FrmPrincipal();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public FrmPrincipal() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new Dimension(600, 520));
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("SOFTWARE CONTROL DE BIBLIOTECA");
			{
				TituloBiblioteca = new JLabel();
				getContentPane().add(TituloBiblioteca);
				//30385347958
				TituloBiblioteca.setText("SOFTWARE CONTROL DE BIBLIOTECA");
				TituloBiblioteca.setBounds(81, 21, 455, 106);
				TituloBiblioteca.setFont(new java.awt.Font("Rockwell Extra Bold",0,20));
				TituloBiblioteca.setForeground(new java.awt.Color(255,0,0));
			}
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1);
				jPanel1.setBounds(81, 133, 423, 126);
				jPanel1.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
				jPanel1.setLayout(null);
				{
					btnAgregarUsuario = new JButton();
					jPanel1.add(btnAgregarUsuario);
					btnAgregarUsuario.setText("AGREGAR USUARIO");
					btnAgregarUsuario.setBounds(28, 21, 154, 35);
					btnAgregarUsuario.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							FrmAgregarUsuario objAgregarUsuario = new FrmAgregarUsuario();
						}
					});
				}
				{
					btnAgregarReferencia = new JButton();
					jPanel1.add(btnAgregarReferencia);
					btnAgregarReferencia.setText("AGREGAR REFERENCIA");
					btnAgregarReferencia.setBounds(28, 71, 154, 32);
					btnAgregarReferencia.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							FrmAgregarReferencia objAgregarReferencia = new FrmAgregarReferencia();
						}
					});
				}
				{
					btnModificarUsuario = new JButton();
					jPanel1.add(btnModificarUsuario);
					btnModificarUsuario.setText("MODIFICAR USUARIO");
					btnModificarUsuario.setBounds(221, 21, 183, 35);
					btnModificarUsuario.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							FrmModificarUsuario objModificarUsuario = new FrmModificarUsuario();
						}
					});
				}
				{
					btnModificarReferencia = new JButton();
					jPanel1.add(btnModificarReferencia);
					btnModificarReferencia.setText("MODIFICAR REFERENCIA");
					btnModificarReferencia.setBounds(221, 73, 183, 35);
					btnModificarReferencia.setName("SOFTWARE CONTROL BIBLIOTECA");
					btnModificarReferencia.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							FrmModificarReferencia objModificarReferencia = new FrmModificarReferencia();
						}
					});
				}
			}
			{
				Administracion = new JLabel();
				getContentPane().add(Administracion);
				Administracion.setText("ADMINISTRACIÓN:");
				Administracion.setBounds(93, 101, 120, 14);
			}
			{
				jPanel2 = new JPanel();
				getContentPane().add(jPanel2);
				jPanel2.setBounds(81, 288, 423, 82);
				jPanel2.setLayout(null);
				jPanel2.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
				{
					btnManejoPrestamos = new JButton();
					jPanel2.add(btnManejoPrestamos);
					btnManejoPrestamos.setText("MANEJO PRESTAMOS");
					btnManejoPrestamos.setBounds(122, 19, 172, 37);
					btnManejoPrestamos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							FrmGestionarMultasPrestamos objGestionarMultasPrestamos = new FrmGestionarMultasPrestamos();
						}
					});
				}
			}
			{
				Prestamos = new JLabel();
				getContentPane().add(Prestamos);
				Prestamos.setText("PRESTAMOS:");
				Prestamos.setBounds(81, 269, 92, 14);
			}
			{
				jPanel3 = new JPanel();
				getContentPane().add(jPanel3);
				jPanel3.setBounds(81, 402, 423, 68);
				jPanel3.setLayout(null);
				jPanel3.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
				{
					btnConsultarDeudores = new JButton();
					jPanel3.add(btnConsultarDeudores);
					btnConsultarDeudores.setText("CONSULTAR DEUDORES");
					btnConsultarDeudores.setBounds(118, 13, 196, 34);
				}
			}
			{
				Informes = new JLabel();
				getContentPane().add(Informes);
				Informes.setText("INFORMES:");
				Informes.setBounds(81, 383, 79, 14);
			}
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
