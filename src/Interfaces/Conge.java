package Interfaces;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Conge extends JFrame implements ActionListener{
	
	private JButton Affecter;
	private JButton Modifier;
	private JButton Annuler	;
	private JButton Retour;
	private JLabel  LabIcone;
	private JLabel  icone;
	private JPanel smallp;
	private JPanel p;
	

	
    public Conge(String s){
    	
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBackground(new Color(255, 255, 255));
	    setSize(1920, 1030);
	    setResizable(false);
	    setLocation(0,0);
	    setLayout(null);
	    
	    p=(JPanel)this.getContentPane();
	    p.setBackground(new Color(255,255,255));
	   
	    //Panel One
	    smallp = new JPanel();
	    smallp.setLayout(null);
	    smallp.setBackground(new Color(44,46,48));
	    smallp.setBounds(0, 0, 1920, 60);
	    p.add(smallp);
	    
	    //Lab Icone CR
	    LabIcone = new JLabel();
	    LabIcone.setIcon(new ImageIcon(getClass().getResource("/images/logocr.jpg")));
	    LabIcone.setBounds(0,0,140,60);
	    smallp.add(LabIcone);
	    
	    //Separator
        JSeparator Sep = new JSeparator();
        Sep.setBounds(0, 60, 1920, 20);
        p.add(Sep);
	  
        
	    //Panel two
	    icone = new JLabel();
	    icone.setIcon(new ImageIcon(getClass().getResource("/images/1_XVJg3i1j5fhPDx961bbsvQ.jpg")));
	    icone.setBounds(0,50,1920,950);
	    p.add(icone);
	    
	   
	    
      
        
    
	    //Affecter Button
        Affecter = new JButton();
        Affecter.setFont(new Font("Tahoma", 2, 16)); 
        Affecter.setText("Affecter Congé");
        Affecter.setBounds(500,465,150,60);
        Affecter.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	        	Affecter(e);
	        }
	    });
        
        icone.add(Affecter);
        
        //Modifier Button
        Modifier = new JButton();
        Modifier.setFont(new Font("Tahoma", 2, 16));
        Modifier.setText("Modifier Congé");
        Modifier.setBounds(800,465,150,60);
        Modifier.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	        	Modifier(e);
	        }
	    });
        icone.add(Modifier);
       
        
        //Annuler Button
        Annuler = new JButton();
	    Annuler.setFont(new Font("Tahoma", 2, 16)); 
	    Annuler.setText("Annuler Congé");
	    Annuler.setBounds(1100,465,150,60);
	    Annuler.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	        	Annuler(e);
	        }
	    });
	    icone.add(Annuler);
	    
	    //Retour Button
	    Retour = new JButton();
	    Retour.setFont(new Font("Tahoma", 2, 16)); 
	    Retour.setText("Retour");
	    Retour.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	            Retour(e);
	        }
	    });
	    Retour.setBounds(1400,465,150,60);
	    icone.add(Retour);
	    Retour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ActionPerformed(e);
            }
        });
	
}                       

	protected void Annuler(MouseEvent e) {
		// TODO Auto-generated method stub
		SupprimerConge h = new SupprimerConge("Supprimer Congé");
  
        h.setLocationRelativeTo(null) ;
        h.setVisible(true);
        this.dispose();
	}

	protected void Modifier(MouseEvent e) {
		// TODO Auto-generated method stub
		ModifierConge h = new ModifierConge("Modifier Un Congé");
        h.setVisible(true);
        this.dispose();
	}

	private void Retour(MouseEvent e) {                                      
	    
	           	Home h = new Home("Home");
	            h.setVisible(true);
	            this.dispose();
	}                                     
	                                  
	
	private void Affecter(MouseEvent e) {                                      
	   
	            AffecterConge h= new AffecterConge("Affecter Conge");
	            h.setVisible(true);
	            this.dispose();
	}                                     
	         
	private void ActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }      
	
	
	    
	public static void main(String args[]) {
	    
	   Conge c = new Conge("Les Congés");
	   c.show();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	    
}
	
	                 
	
	
