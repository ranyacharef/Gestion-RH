package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;

import javax.swing.*;

public class Home extends JFrame{
	
	private JPanel p;
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JLabel background;
	private JLabel LabIcone;
	private JLabel date;
    private JLabel time;
    private JLabel affdate;
    private JLabel afftime;
	private JButton SignOut;
	private JButton save;
	private JButton reset;
	private JButton presences;
	private JButton Fonc;
	private JButton reu;
	private JButton Con;
    private JButton Contart;
	private JTextField taches;
    private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JCheckBox c1;
	private JCheckBox c2;
	private JCheckBox c3;
	private JCheckBox c4;
	private JCheckBox c5;
	private JCheckBox c6;
	private JLabel e;
	
	public Home(String s){
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0,0);
        setSize(1920, 1030);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
        
        background = new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/images/1_XVJg3i1j5fhPDx961bbsvQ.jpg")));
        background.setBounds(0,80,1920,970);
        p.add( background);
        
		
        //////////////////////////////////////////////////////////////////////////////////////////////////
        										//Header//
        ////////////////////////////////////////////////////////////////////////////////////////////////
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(3, 3, 22));
        p1.setBounds(0,0,1920,70);
        p.add(p1);
        
        LabIcone = new JLabel();
        LabIcone.setIcon(new ImageIcon(getClass().getResource("/images/logocr.jpg")));
        LabIcone.setBounds(0,0,140,65);
        p1.add(LabIcone);
        
        
        SignOut = new JButton();
        SignOut.setBackground(new Color(229, 66, 49));
        SignOut.setText("Sign Out");
        SignOut.setBounds(1780, 15, 100, 40);
        SignOut.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                SignOut(e);
            }});
        p1.add(SignOut);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(45, 62, 80));
        p2.setBounds(1420,0,500,200);
        background.add(p2);
        
        date = new JLabel();
        date.setFont(new Font("Century", 0, 24)); 
        date.setForeground(new Color(255, 255, 255));
        date.setText("Date :");
        date.setBounds(50, 30, 100, 50);
        p2.add(date);
        
        time = new JLabel();
        time.setFont(new Font("Century", 0, 24));
        time.setForeground(new Color(255, 255, 255));
        time.setText("Temps :");
        time.setBounds(50, 100, 100, 50);
        p2.add(time);
        
        affdate = new JLabel();
        affdate.setFont(new Font("Calibri Light", 0, 24)); 
        affdate.setForeground(new Color(255, 255, 255));
        affdate.setText("Date");
        affdate.setToolTipText("dateLab");
        affdate.setBounds(200, 30, 200, 50);
        p2.add(affdate);
        
        showDate();
        
        afftime = new JLabel();
        afftime.setFont(new Font("Calibri Light", 0, 24));
        afftime.setForeground(new Color(255, 255, 255));
        afftime.setText("Time");
        afftime.setToolTipText("TimeLab");
        showTime();
        afftime.setBounds(200, 100, 200, 50);
        p2.add(afftime);
        
        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(1420, 200, 500, 750);
        background.add(p3);
        
        taches = new JTextField();
        taches.setBackground(new Color(32, 32, 38));
        taches.setFont(new Font("Calibri Light", 2, 18)); 
        taches.setForeground(new Color(255, 255, 255));
        taches.setHorizontalAlignment(JTextField.CENTER);
        taches.setText("Taches d'aujourd'hui");
        taches.setBounds(0,10,500,30);
        p3.add(taches);
        
        
        t1 = new JTextField();
        t1.setBounds(10, 80, 400, 50);
        p3.add(t1);		
        c1 = new JCheckBox();
        c1.setBounds(440, 80, 50, 50);
        p3.add(c1);
       		
        t2 = new JTextField();
        t2.setBounds(10, 170, 400, 50);
        p3.add(t2);
        
        c2 = new JCheckBox();
        c2.setBounds(440, 170, 50, 50);
        p3.add(c2);
        
       
        t3 = new JTextField();
        t3.setBounds(10, 270, 400, 50);
        p3.add(t3);
        
        c3 = new JCheckBox();
        c3.setBounds(440, 270, 50, 50);
        p3.add(c3);
        
        t4 = new JTextField();
        t4.setBounds(10, 370, 400, 50);
        p3.add(t4);
        
        c4 = new JCheckBox();
        c4.setBounds(440, 370, 50, 50);
        p3.add(c4);	
       
        
        t5 = new JTextField();	
        t5.setBounds(10, 470, 400, 50);
        p3.add(t5);
        
        c5 = new JCheckBox();
        c5.setBounds(440, 470, 50, 50);
        p3.add(c5);
       		
        
        t6 = new JTextField(); 
        t6.setBounds(10, 570, 400, 50);
        p3.add(t6);
        
        c6 = new JCheckBox();
        c6.setBounds(440, 570, 50, 50);
        p3.add(c6);
       		
        reset = new JButton();
        reset.setText("Réinitialiser");
        reset.setFont(new Font("Calibri Light", 0, 20));
        reset.setBounds(250,650,150,50);
        reset.setForeground(Color.white);
        reset.setBackground(new Color(45, 62, 80));
        p3.add(reset);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
            } });
        
        save = new JButton();
        save.setText("Enregistrer");
        save.setFont(new Font("Calibri Light", 0, 20));
        save.setBounds(30, 650, 150, 50);
        save.setBackground(new Color(45, 62, 80));
        save.setForeground(Color.white);
        p3.add(save);
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SaveActionPerformed(e);
            }

			private void SaveActionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });

        presences = new JButton();
        presences.setBackground(new Color(32, 32, 38));
        presences.setFont(new Font("Century", 0, 24)); 
        presences.setForeground(new Color(204, 204, 204));
        presences.setText("Les presences");
        presences.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Presence(e);
            }
        });
        presences.setBounds(600, 50, 450, 100);
        background.add(presences);
        
        Fonc = new JButton();
        Fonc.setBackground(new Color(32, 32, 38));
        Fonc.setFont(new Font("Century", 0, 24));
        Fonc.setForeground(new Color(204, 204, 204));
        Fonc.setText("Les fonctionnaires");
        Fonc.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e ) {
                Fonc(e);
            }
        });
        Fonc.setBounds(600, 220, 450, 100);
        background.add(Fonc);
        
        reu = new JButton();
        reu.setBackground(new Color(32, 32, 38));
        reu.setFont(new Font("Century", 0, 24)); 
        reu.setForeground(new Color(204, 204, 204));
        reu.setText("Les reunions");
        reu.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Reunion(e);
            }
        });
        reu.setBounds(600, 390, 450, 100);
        background.add(reu);

        Con = new JButton();
        Con.setBackground(new Color(32, 32, 38));
        Con.setFont(new Font("Century", 0, 24)); 
        Con.setForeground(new Color(204, 204, 204));
        Con.setText("Les conges");
        Con.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Conge(e);
            }
        });
        Con.setBounds(600, 560, 450, 100);
        background.add(Con);
        
        Contart = new JButton();
        Contart.setBackground(new Color(32, 32, 38));
        Contart.setFont(new Font("Century", 0, 24));
        Contart.setForeground(new Color(204, 204, 204));
        Contart.setText("Les contrats");
        Contart.setBorder(BorderFactory.createCompoundBorder());
        Contart.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Contrats(e);
            }
        });
        Contart.setBounds(600, 730, 450, 100);
        background.add(Contart);
        
	}
	
	 void showDate(){
	        Date d = new Date();
	        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
	        affdate.setText(s.format(d));   
	    }
	    
	 void showTime(){
         new Timer(0,new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
              Date d = new Date();
              SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
              afftime.setText(s.format(d));
             }
         }).start();
}
                        

	                
	 private void SignOut(MouseEvent e) {                                      
	        // Sign Out
	            JOptionPane.showMessageDialog(null, "Goodbye Admin ");
	           
	            AdminLogin l1 = new AdminLogin("Admin");
	            l1.setVisible(true);
	            this.dispose();
	    }                                     

	  private void Contrats(MouseEvent e) {                                      
	        // TODO add your handling code here:
	        Contrats h = new Contrats("Nouveau Contrat");
	       
	        h.setVisible(true);
	        this.dispose();
	    }                                     

	    private void Conge(MouseEvent e) {                                      
	        // TODO add your handling code here:
	        Conge c = new Conge("Conge");
	        
	        c.setVisible(true);
	        this.dispose();
	    }                                     

	    private void Reunion(MouseEvent e) {                                      
	        // Bouton reunion
	        Reunion r = new Reunion("");
	        
	        r.setVisible(true);
	        this.dispose();
	    }                                     

	    private void Fonc(MouseEvent e) {                                      
	       
	        LesFonctionnaires f = new LesFonctionnaires("Les Fonctionnaires");
	        
	        f.setVisible(true);
	        this.dispose();
	    }                                     

	    private void Presence(MouseEvent e) {                                      
	      
	        Presence p = new Presence("");
	        
	        p.setVisible(true);
	        this.dispose();
	    }                                     

	public static void main(String[] args) {
		Home a = new Home("Welcome Home");
		a.show();
	}
}
