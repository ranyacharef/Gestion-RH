package Interfaces;


import java.awt.*;
import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class OrganiserReunion extends JFrame {
	
	private JPanel p;
	private JButton save;
    private JButton retour;
    private JComboBox<String> MembresReu;
    private JLabel Nom;
    private JLabel date;
    private JLabel HD;
    private JLabel HF;
    private JLabel Membres;
    private JLabel Icone;
    private JLabel title;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private String[]m = {"Tous", "Cadres", "Ingenieurs", "Ouvriers"};
   
    public OrganiserReunion(String s) {
    
    	super(s);
	      

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(new Point(200, 80));
        setSize(1600, 800);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
        p.setBackground(new Color(42, 44, 54));
        
        title = new JLabel();
        title.setFont(new Font("Tahoma", 2, 30)); 
        title.setForeground(new Color(204, 204, 204));
        title.setText("Une Nouvelle Réunion De Travail");
        title.setBounds(550, 40, 449, 37);
        p.add(title);

        Nom = new JLabel();
        Nom.setFont(new Font("Century", 2, 24));
        Nom.setForeground(new Color(204, 204, 204));
        Nom.setText("Nom reunion : ");
        Nom.setBounds(350, 150, 169, 39);
        p.add(Nom);
        
        t1 = new JTextField();
        t1.setBounds(550,155,449,40);
        p.add(t1);
        
        date = new JLabel();
        date.setFont(new Font("Century", 2, 24));
        date.setForeground(new Color(204, 204, 204));
        date.setText("Date reunion :");
        date.setBounds(350, 250, 169, 39);
        p.add(date);
        
        t2 = new JTextField();
        t2.setBounds(550,255,449,40);
        p.add(t2);
        
        HD = new JLabel();
        HD.setFont(new Font("Century", 2, 24)); 
        HD.setForeground(new Color(204, 204, 204));
        HD.setText("Heure début :");
        HD.setBounds(350, 350, 169, 39);
        p.add(HD);
        
        t3 = new JTextField();
        t3.setBounds(550,355,449,40);
        p.add(t3);
        
        HF = new JLabel();
        HF.setFont(new Font("Century", 2, 24));
        HF.setForeground(new Color(204, 204, 204));
        HF.setText("Heure fin :");
        HF.setBounds(350, 450, 169, 39);
        p.add(HF);
        
        t4 = new JTextField();
        t4.setBounds(550,455,449,40);
        p.add(t4);
        
        Membres = new JLabel();
        Membres.setFont(new Font("Century", 2, 24)); 
        Membres.setForeground(new Color(204, 204, 204));
        Membres.setText("Membres :");
        Membres.setBounds(350, 550, 169, 39);
        p.add(Membres);

        MembresReu = new JComboBox<>();
        MembresReu.setModel(new DefaultComboBoxModel<>((m)));
        MembresReu.setBounds(550,555,200,40);
        p.add(MembresReu);
        
        Icone = new JLabel();
        Icone.setIcon(new ImageIcon(getClass().getResource("/images/work-metting.jpg")));
        Icone.setBounds(1291,  0, 309, 800);
        p.add(Icone);
        
        save = new JButton();
        save.setText("Enregistrer");
        save.setFont(new Font("Arial",0,16));
        save.setBounds(550, 680, 119,42);
        save.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              
					SaveMouseClicked(e);
				
            }
        });
        p.add(save);
        
        retour = new JButton();
        retour.setText("Retour");
        retour.setFont(new Font("Arial",0,16));
        retour.setBounds(880,680, 119,42);
        retour.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                RetourMouseClicked(e);
            }
        });
        p.add(retour);

        
       
    }
    private void RetourMouseClicked(MouseEvent e) {                                      
        // TODO add your handling code here:
        Reunion r = new Reunion("");
        r.setVisible(true);
        this.dispose();
    }                                     

    private void SaveMouseClicked(MouseEvent e) {
    	int teste=0;
    	try {
    	if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals(""))
			JOptionPane.showInternalMessageDialog(null,"Remplir tous les champs!");
    	 else 
 	    	teste=1;
 	    	
 	   
 	}
 	catch(NumberFormatException e1) {
  	   JOptionPane.showMessageDialog(null, "Vérifier le format des entrées", "Erreur de saisie",JOptionPane.ERROR_MESSAGE);
 	}
 	
 	if(teste==1) {
			
    	Connexion c = new Connexion();
    	String rt = "INSERT INTO reuniontravail (nom, date, hd, hf, membres) VALUES (?, ?, ?, ?, ?)";
    	try{
    		
			PreparedStatement statement = (PreparedStatement)c.con.prepareStatement(rt);
			statement.setObject(1, t1.getText(),Types.VARCHAR);
			statement.setObject(2, t2.getText(),Types.VARCHAR);
			statement.setObject(3, Integer.parseInt(t3.getText()),Types.INTEGER);
			statement.setObject(4, Integer.parseInt(t4.getText()),Types.INTEGER);
			statement.setObject(5, m[MembresReu.getSelectedIndex()],Types.VARCHAR);
			
    		
			int nb = statement.executeUpdate();
    	
			if (nb==1)
				//JOptionPane.showInternalMessageDialog(null,"Un nouvelle réunion est ajoutée !");
				System.out.println("Un nouvelle réunion est ajoutée !");
			}catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("sql exception!!");
			e1.printStackTrace();
		}}
    }
    

    private void jComboBox1ActionPerformed(ActionEvent e) {                                           
        // TODO add your handling code here:
    }                                          

    private void jTextField4ActionPerformed(ActionEvent e) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField1ActionPerformed(ActionEvent e) {                                            
        // TODO add your handling code here:
    }                                           

    
    public static void main(String args[]) {
       OrganiserReunion o = new OrganiserReunion("Nouvelle Réunion");
       o.show();
    }

          
}
