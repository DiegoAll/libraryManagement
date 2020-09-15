import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
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
public class Prueba extends javax.swing.JFrame {
	private JPanel panelPrestamos;
	private JLabel jLabel1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Prueba inst = new Prueba();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Prueba() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				panelPrestamos = new JPanel();
				getContentPane().add(panelPrestamos);
				panelPrestamos.setBounds(138, 77, 225, 188);
				panelPrestamos.setBorder(BorderFactory.createTitledBorder("Prestamo"));
				panelPrestamos.setLayout(null);
				{
					jLabel1 = new JLabel();
					panelPrestamos.add(jLabel1, "Center");
					jLabel1.setText("SI");
					jLabel1.setForeground(Color.RED);
					jLabel1.setFont(new java.awt.Font("Arial",0,72));
					jLabel1.setBounds(40, 36, 79, 91);
				}
			}
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
