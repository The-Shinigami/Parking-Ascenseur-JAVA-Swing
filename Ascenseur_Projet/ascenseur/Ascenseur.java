package ascenseur;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import java.awt.Font;

public class Ascenseur {

	private JFrame frmAscenseur;
	private int i = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascenseur window = new Ascenseur();
					window.frmAscenseur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ascenseur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAscenseur = new JFrame();
		frmAscenseur.setResizable(false);
		frmAscenseur.setTitle("Ascenseur");
		frmAscenseur.getContentPane().setBackground(new Color(30, 144, 255));
		frmAscenseur.getContentPane().setLayout(null);
		
		JLabel lblNom = new JLabel("Simulation d'ascenseur",JLabel.CENTER);
		lblNom.setForeground(new Color(0,0,0));
		lblNom.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblNom.setBounds(10, 10, 600, 38);
		frmAscenseur.getContentPane().add(lblNom);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		panel.setBackground(new Color(255,255,255));
		panel.setBounds(10, 49, 599, 372);
		frmAscenseur.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lbl11 = new JLabel("");
		lbl11.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/window.png")));
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setBounds(10, 10, 76, 50);
		panel.add(lbl11);
		
		JLabel lbl12 = new JLabel("");
		lbl12.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/window.png")));
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setBounds(10, 70, 76, 50);
		panel.add(lbl12);
		
		JLabel lbl13 = new JLabel("");
		lbl13.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/window.png")));
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setBounds(10, 130, 76, 50);
		panel.add(lbl13);
		
		JLabel lbl14 = new JLabel("");
		lbl14.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/window.png")));
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setBounds(10, 190, 76, 50);
		panel.add(lbl14);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/Shoji1-paper-sliding-door-icon.png")));
		lbl5.setBounds(10, 250, 76, 50);
		panel.add(lbl5);
		
		JLabel lbl16 = new JLabel("");
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/car-in-garage.png")));
		lbl16.setBounds(10, 310, 76, 50);
		panel.add(lbl16);
		
		JLabel lbl21 = new JLabel("");
		lbl21.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/window.png")));
		lbl21.setHorizontalAlignment(SwingConstants.CENTER);
		lbl21.setBounds(523, 10, 66, 50);
		panel.add(lbl21);
		
		JLabel lbl22 = new JLabel("");
		lbl22.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/window.png")));
		lbl22.setHorizontalAlignment(SwingConstants.CENTER);
		lbl22.setBounds(523, 70, 66, 50);
		panel.add(lbl22);
		
		JLabel lbl23 = new JLabel("");
		lbl23.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/window.png")));
		lbl23.setHorizontalAlignment(SwingConstants.CENTER);
		lbl23.setBounds(523, 130, 66, 50);
		panel.add(lbl23);
		
		JLabel lbl24 = new JLabel("");
		lbl24.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/window.png")));
		lbl24.setHorizontalAlignment(SwingConstants.CENTER);
		lbl24.setBounds(523, 190, 66, 50);
		panel.add(lbl24);
		
		JLabel lbl25 = new JLabel("");
		lbl25.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/Shoji1-paper-sliding-door-icon.png")));
		lbl25.setHorizontalAlignment(SwingConstants.CENTER);
		lbl25.setBounds(523, 250, 66, 50);
		panel.add(lbl25);
		
		JLabel lbl26 = new JLabel("");
		lbl26.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/car-in-garage.png")));
		lbl26.setHorizontalAlignment(SwingConstants.CENTER);
		lbl26.setBounds(523, 310, 66, 50);
		panel.add(lbl26);
		
		JLabel lbl34 = new JLabel("");
		lbl34.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-porte-40.png")));
		lbl34.setHorizontalAlignment(SwingConstants.CENTER);
		lbl34.setBounds(96, 190, 45, 50);
		panel.add(lbl34);
		
		JLabel lbl33 = new JLabel("");
		lbl33.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-porte-40.png")));
		lbl33.setHorizontalAlignment(SwingConstants.CENTER);
		lbl33.setBounds(96, 130, 45, 50);
		panel.add(lbl33);
		
		JLabel lbl32 = new JLabel("");
		lbl32.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-porte-40.png")));
		lbl32.setHorizontalAlignment(SwingConstants.CENTER);
		lbl32.setBounds(96, 70, 45, 50);
		panel.add(lbl32);
		
		JLabel lbl31 = new JLabel("");
		lbl31.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-porte-40.png")));
		lbl31.setHorizontalAlignment(SwingConstants.CENTER);
		lbl31.setBounds(96, 10, 45, 50);
		panel.add(lbl31);
		
		JLabel lbl41 = new JLabel("");
		lbl41.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-porte-40.png")));
		lbl41.setHorizontalAlignment(SwingConstants.CENTER);
		lbl41.setBounds(468, 10, 45, 50);
		panel.add(lbl41);
		
		JLabel lbl42 = new JLabel("");
		lbl42.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-porte-40.png")));
		lbl42.setHorizontalAlignment(SwingConstants.CENTER);
		lbl42.setBounds(468, 70, 45, 50);
		panel.add(lbl42);
		
		JLabel lbl43 = new JLabel("");
		lbl43.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-porte-40.png")));
		lbl43.setHorizontalAlignment(SwingConstants.CENTER);
		lbl43.setBounds(468, 130, 45, 50);
		panel.add(lbl43);
		
		JLabel lbl44 = new JLabel("");
		lbl44.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-porte-40.png")));
		lbl44.setHorizontalAlignment(SwingConstants.CENTER);
		lbl44.setBounds(468, 190, 45, 50);
		panel.add(lbl44);
		
		JLabel lblP1 = new JLabel("");
		lblP1.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-employ\u00E9-48.png")));
		lblP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblP1.setBounds(185, 310, 45, 50);
		panel.add(lblP1);
		
		JLabel lblP2 = new JLabel("");
		lblP2.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-gar\u00E7on-40.png")));
		lblP2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP2.setBounds(185, 250, 45, 50);
		panel.add(lblP2);
		
		JLabel lblP3 = new JLabel("");
		lblP3.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-gar\u00E7on-48.png")));
		lblP3.setHorizontalAlignment(SwingConstants.CENTER);
		lblP3.setBounds(185, 190, 45, 50);
		panel.add(lblP3);
		
		JLabel lblP4 = new JLabel("");
		lblP4.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-homme-debout-48 (1).png")));
		lblP4.setHorizontalAlignment(SwingConstants.CENTER);
		lblP4.setBounds(185, 130, 45, 50);
		panel.add(lblP4);
		
		JLabel lblP5 = new JLabel("");
		lblP5.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-personne-\u00E2g\u00E9er-48.png")));
		lblP5.setHorizontalAlignment(SwingConstants.CENTER);
		lblP5.setBounds(185, 70, 45, 50);
		panel.add(lblP5);
		
		JLabel lblP6 = new JLabel("");
		lblP6.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-voyageur-avec-bagages-40.png")));
		lblP6.setHorizontalAlignment(SwingConstants.CENTER);
		lblP6.setBounds(185, 10, 45, 50);
		panel.add(lblP6);
		
		JLabel lblPr1 = new JLabel("");
		lblPr1.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-homme-debout-48.png")));
		lblPr1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPr1.setBounds(375, 310, 45, 50);
		panel.add(lblPr1);
		
		JLabel lblPr2 = new JLabel("");
		lblPr2.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-homme-debout-48 (1).png")));
		lblPr2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPr2.setBounds(375, 250, 45, 50);
		panel.add(lblPr2);
		
		JLabel lblPr3 = new JLabel("");
		lblPr3.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-homme-48.png")));
		lblPr3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPr3.setBounds(375, 190, 45, 50);
		panel.add(lblPr3);
		
		JLabel lblPr4 = new JLabel("");
		lblPr4.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-gar\u00E7on-40.png")));
		lblPr4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPr4.setBounds(375, 130, 45, 50);
		panel.add(lblPr4);
		
		JLabel lblPr5 = new JLabel("");
		lblPr5.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-gar\u00E7on-48.png")));
		lblPr5.setHorizontalAlignment(SwingConstants.CENTER);
		lblPr5.setBounds(375, 70, 45, 50);
		panel.add(lblPr5);
		
		JLabel lblPr6 = new JLabel("");
		lblPr6.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/icons8-employ\u00E9-48.png")));
		lblPr6.setHorizontalAlignment(SwingConstants.CENTER);
		lblPr6.setBounds(375, 10, 45, 50);
		panel.add(lblPr6);
		
		JPanel pnlAscenseur1 = new JPanel();
		pnlAscenseur1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnlAscenseur1.setBackground(new Color(0, 0, 0));
		pnlAscenseur1.setBounds(240, 310, 60, 50);
		panel.add(pnlAscenseur1);
		
		JPanel pnlAscenseur2 = new JPanel();
		pnlAscenseur2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnlAscenseur2.setBackground(new Color(0, 0, 0));
		pnlAscenseur2.setBounds(305, 310, 60, 50);
		panel.add(pnlAscenseur2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 67, 599, 9);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 130, 599, 9);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 189, 599, 9);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 245, 599, 9);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 305, 599, 9);
		panel.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(302, 0, 11, 372);
		panel.add(separator_5);
		
	
		
		JButton btnStart = new JButton("");
		btnStart.setToolTipText("Cliquez ici pour commencer");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------- Les personnes de l'ascenseur 1 ---------------
				Personne person = new Personne(lblP3);
				Personne person2 = new Personne(lblP4);
				Personne person3 = new Personne(lblP2);
				Personne person4 = new Personne(lblP5);
				Personne person5 = new Personne(lblP1);
				Personne person6 = new Personne(lblP6);
				//--------------- Les personnes de l'ascenseur 2 ---------------
				Personne p1 = new Personne(lblPr6);
				Personne p2 = new Personne(lblPr5);
				Personne p3 = new Personne(lblPr4);
				Personne p4 = new Personne(lblPr3);
				Personne p5 = new Personne(lblPr2);
				Personne p6 = new Personne(lblPr1);
				
				//--------------- Destinations des personnes ---------------
				person.setEtageTo(3);
				p1.setEtageTo(3);
				
				person2.setEtageTo(1);
				p2.setEtageTo(0);
				
				person3.setEtageTo(4);
				p3.setEtageTo(4);
				
				person4.setEtageTo(5);
				p4.setEtageTo(5);
				
				person5.setEtageTo(2);
				p5.setEtageTo(2);
				
				person6.setEtageTo(0);
				p6.setEtageTo(1);
				
				//--------------- Mouvement des ascenseurs ---------------
				Animation as = new Animation(pnlAscenseur1, person);
				Animation asc = new Animation(pnlAscenseur2, p1);
				as.start();
				asc.start();
				
				ActionListener task = new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						i ++;
						//t.setText(Integer.toString(i));
						if(i == 90)
						{
							System.out.println("Personne1 est stopée !");
							Animation as2 = new Animation(pnlAscenseur1, person3);
							Animation asc2 = new Animation(pnlAscenseur2, p2);
							
							as2.start();
							asc2.start();
						}
						if(i == 180)
						{
							System.out.println("Personne2 est stopée !");
							Animation as3 = new Animation(pnlAscenseur1, person2);
							Animation asc3 = new Animation(pnlAscenseur2, p3);
							
							as3.start();
							asc3.start();
						}
						if(i == 270)
						{
							System.out.println("Personne3 est stopée !");
							Animation as4 = new Animation(pnlAscenseur1, person4);
							Animation asc4 = new Animation(pnlAscenseur2, p4);
							
							as4.start();
							asc4.start();
						}
						if(i == 360)
						{
							System.out.println("Personne4 est stopée !");
							Animation as5 = new Animation(pnlAscenseur1, person5);
							Animation asc5 = new Animation(pnlAscenseur2, p5);
							
							as5.start();
							asc5.start();
						}
						if(i == 450)
						{
							System.out.println("Personne5 est stopée !");
							Animation as6 = new Animation(pnlAscenseur1, person6);
							Animation asc6 = new Animation(pnlAscenseur2, p6);
							
							as6.start();
							asc6.start();
						}
					}
				};
				
				Timer timer = new Timer(50, task);
				timer.start();
			}
		});
		btnStart.setIcon(new ImageIcon(Ascenseur.class.getResource("/Icons/play-button.png")));
		btnStart.setBounds(617, 49, 40, 40);
		frmAscenseur.getContentPane().add(btnStart);
		
	
		frmAscenseur.setBounds(100, 100, 681, 509);
		frmAscenseur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
