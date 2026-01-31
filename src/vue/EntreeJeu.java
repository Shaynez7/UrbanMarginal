package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIp;


	private void btnExit_clic() {
	    System.exit(0);
	}


	private void btnStart_clic() {
	    Arene arene = new Arene(); 
	    arene.setVisible(true);     
	    this.dispose();            
	}

	
	private void btnConnect_clic() {
	    ChoixJoueur choixJoueur = new ChoixJoueur(); 
	    choixJoueur.setVisible(true);              
	    this.dispose();                             
	}

	

	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 159);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic();
			}
		});
		btnExit.setBounds(194, 91, 69, 21);
		contentPane.add(btnExit);
		
		JLabel txt = new JLabel("Start a server :");
		txt.setBounds(20, 12, 84, 17);
		contentPane.add(txt);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_clic();
			}
		});
		btnStart.setBounds(194, 10, 69, 21);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic();
			}
		});
		btnConnect.setBounds(194, 60, 69, 21);
		contentPane.add(btnConnect);
		
		JLabel txt2 = new JLabel("Connect an existing server :");
		txt2.setBounds(20, 39, 209, 12);
		contentPane.add(txt2);
		
		JLabel txt3 = new JLabel("IP server :");
		txt3.setBounds(20, 64, 56, 12);
		contentPane.add(txt3);
		
		txtIp = new JTextField();
		txtIp.setText("127.0.0.1");
		txtIp.setBounds(86, 61, 96, 18);
		contentPane.add(txtIp);
		txtIp.setColumns(10);

	}

}
