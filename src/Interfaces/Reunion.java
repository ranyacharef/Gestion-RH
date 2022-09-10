package Interfaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reunion extends JFrame {
	

 	private JPanel p;
    private JPanel p1; 
    private JLabel LabIcone;
    private JLabel BigIcone;
    private JLabel title;
    private JButton auj;
    private JButton mod;
    private JButton sup;
    private JButton org;
    private JButton rec;
    private JButton retour;
	
	public  Reunion(String s) {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(new Point(0,0));
        setSize(1920, 1030);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
        p.setBackground(new Color(3, 3, 22));
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(3, 3, 22));
        p1.setBounds(0,0,1406,70);
        p.add(p1);
        
        LabIcone = new JLabel();
        LabIcone.setIcon(new ImageIcon(getClass().getResource("/images/logocr.jpg")));
        LabIcone.setBounds(0,0,160,65);
        p1.add(LabIcone);
        
        title = new JLabel();
        title.setFont(new Font("Century", 2, 24));
        title.setForeground(new Color(204, 204, 204));
        title.setText("Les reunions");
        title.setBounds(940,10, 344, 44);
        p1.add(title);
        
       /* JSeparator Sep = new JSeparator();
        Sep.setBounds(0, 70, 1506, 20);
        p.add(Sep);
        */
     
		
        BigIcone = new JLabel();
        BigIcone.setIcon(new ImageIcon(getClass().getResource("/images/1_XVJg3i1j5fhPDx961bbsvQ.jpg")));
        BigIcone.setBounds(0, 70, 1920, 970);
        p.add(BigIcone);
        
        auj = new JButton();
        auj.setBackground(new Color(32, 32, 38));
        auj.setFont(new Font("Century", 0, 18)); 
        auj.setForeground(new Color(204, 204, 204));
        auj.setText("Reunion d'aujourd'hui");
        auj.setBounds(770,100,500,70);
        BigIcone.add(auj);
        auj.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               auj(e);
            }

			
        });
        
        mod = new JButton();
        mod.setBackground(new Color(32, 32, 38));
        mod.setFont(new Font("Century", 0, 18)); 
        mod.setForeground(new Color(204, 204, 204));
        mod.setText("Mettre a jour reunion");
        mod.setBounds(770,240,500,70);
        mod.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent e) {
                modifier(e);
             }

 			
         });
        BigIcone.add(mod);
        
        sup = new JButton();
        sup.setBackground(new Color(32, 32, 38));
        sup.setFont(new  Font("Century", 0, 18)); 
        sup.setForeground(new Color(204, 204, 204));
        sup.setText("Supprimer reunion");
        sup.setBounds(770,480,500,70);
        sup.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent e) {
                supprimer(e);
             }

 			
         });
        BigIcone.add(sup);

        org = new JButton();
        org.setBackground(new Color(32, 32, 38));
        org.setFont(new  Font("Century", 0, 18)); 
        org.setForeground(new  Color(204, 204, 204));
        org.setText("Organiser reunion");
        org.setBounds(770,360,500,70);
        BigIcone.add(org);
        org.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent e) {
               organiser(e);
            }

			
        });
        
        rec = new JButton();
        rec.setBackground(new Color(32, 32, 38));
        rec.setFont(new  Font("Century", 0, 18)); 
        rec.setForeground(new  Color(204, 204, 204));
        rec.setText("Reunion recrutement");
        rec.setBounds(770,600,500,70);
        BigIcone.add(rec);
        rec.addMouseListener(new  MouseAdapter() {
            public void mouseClicked( MouseEvent e) {
               rec(e);
            }

        });
        
        retour = new JButton();
        retour.setForeground(new  Color(204, 204, 204));
        retour.setBackground(new Color(32, 32, 38));
        retour.setFont(new  Font("Century",0, 24)); 
        retour.setText("RETOUR");
        retour.setBounds(770, 720, 500, 70);
        BigIcone.add(retour);
        retour.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
           	 retour(e);}
        });
        
	}
	
	protected void modifier(MouseEvent e) {
		
		ModifierReunion h = new ModifierReunion("");
        h.setVisible(true);
        this.dispose();
	}

	protected void supprimer(MouseEvent e) {
		
		SupprimerReunion h = new SupprimerReunion("");
       
        h.setVisible(true);
        this.dispose();
	}

	private void retour(MouseEvent e) {
		
		Home h = new Home("");
        
        h.setVisible(true);
        this.dispose();
	}
	
	private void rec(MouseEvent e) {
		
		ReunionRecrutement rr = new ReunionRecrutement("");
       
        rr.setVisible(true);
        this.dispose();
	}
	
	private void organiser(MouseEvent e) {
		
		 	OrganiserReunion o = new OrganiserReunion("");
	        o.setVisible(true);
	        this.dispose();
	}

	
	private void auj(MouseEvent e) {
		
		ReminderReu r = new ReminderReu("");
        r.setVisible(true);
        this.dispose();
	}
	
	
	public static void main(String[] args) {
		
		Reunion r = new Reunion("Reunion");
		r.show();
		
		
	}
}
