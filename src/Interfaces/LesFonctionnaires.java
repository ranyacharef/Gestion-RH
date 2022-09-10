package Interfaces;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


public class LesFonctionnaires extends JFrame{
	
	 	private JPanel p;
	    private JPanel p1;
	    private JLabel BigIcone;
	    private JLabel LabIcone;
	    private JButton aj;
	    private JButton mod;
	    private JButton sup;
	    private JButton lister;
	    private JButton retour;
	    
	    public  LesFonctionnaires(String s) {
	    	
	    	super(s);
	    	 
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
	        
	       
	     
			
	        BigIcone = new JLabel();
	        BigIcone.setIcon(new ImageIcon(getClass().getResource("/images/1_XVJg3i1j5fhPDx961bbsvQ.jpg")));
	        BigIcone.setBounds(0, 70, 1920, 970);
	        p.add(BigIcone);
	        
	         
	         aj = new JButton();
	         aj.setBackground(new Color(32, 32, 38));
	         aj.setFont(new Font("Century", 0, 18)); 
	         aj.setForeground(new Color(204, 204, 204));
	         aj.setText("Ajouter Fonctionnaire");
	         aj.setActionCommand("Ajoutfonc");
	         aj.setBounds(770,100,500,70);
	         BigIcone.add(aj);
	         aj.addMouseListener(new MouseAdapter() {
	             public void mouseClicked(MouseEvent e) {
	                ajouter(e);
	             }
	         });
	         
	         mod = new JButton();
	         mod.setBackground(new Color(32, 32, 38));
	         mod.setFont(new Font("Century", 0, 18)); 
	         mod.setForeground(new Color(204, 204, 204));
	         mod.setText("Modifier Fonctionnaire");
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
	         sup.setText("Supprimer Fonctionnaire");
	         sup.setBounds(770,380,500,70);
	         sup.addMouseListener(new  MouseAdapter() {
	             public void mouseClicked( MouseEvent e) {
		                Supprimer(e);
		             }

		         });
		         
	         BigIcone.add(sup);

	         lister = new JButton();
	         lister.setBackground(new Color(32, 32, 38));
	         lister.setFont(new  Font("Century", 0, 18)); 
	         lister.setForeground(new  Color(204, 204, 204));
	         lister.setText("Lister Les Fonctionnaires");
	         lister.setBounds(770,520,500,70);
	         BigIcone.add(lister);
	         lister.addMouseListener(new  MouseAdapter() {
	             public void mouseClicked( MouseEvent e) {
	                lister(e);
	             }

	         });
	         
	         retour = new JButton();
	         retour.setText("RETOUR");
	         retour.setForeground(new  Color(204, 204, 204));
	         retour.setBackground(new Color(32, 32, 38));
	         retour.setBounds(770,660,500,70);
	         BigIcone.add(retour);
	         retour.addMouseListener(new MouseAdapter() {
	             public void mouseClicked(MouseEvent e) {
	            	 retour(e);}

				

	         });
	    }

	    
	    protected void Supprimer(MouseEvent e) {
			// TODO Auto-generated method stub
	    	SupprimerFonctionnaire h = new SupprimerFonctionnaire("Supprimer Fonctionnaire");
             
             h.setVisible(true);
             this.dispose();
		}


		protected void modifier(MouseEvent e) {
			// TODO Auto-generated method stub
			ModifierFonctionnaire h = new ModifierFonctionnaire("Modifier les données d'un fonctionnaire");
            
            h.setVisible(true);
            this.dispose();
		}


		private void ajouter(MouseEvent evt) {
			
	    		AjouterFonctionnaire newf = new AjouterFonctionnaire("Nouveau Fonctionnaire");
	             
	             newf.setVisible(true);
	             this.dispose();
		} 
	    private void lister(MouseEvent evt) {
	    	ListerFonctionnaires h = new ListerFonctionnaires("Liste des Fonctionnaires");
	       
	        h.setVisible(true);
	        this.dispose();
	    }
	    
	    private void retour(MouseEvent e) {
			// TODO Auto-generated method stub
	    	Home h = new Home("Home");
            
            h.setVisible(true);
            this.dispose();
		}
	    public static void main(String args[]) {
		       
	        
		       
	    	LesFonctionnaires f = new LesFonctionnaires("Les Fonctionnaires");
	    	f.show();
	            }
}
