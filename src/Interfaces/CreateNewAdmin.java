package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateNewAdmin extends JFrame{
	
	
	private JPanel p;
    private JLabel LabCreate;
    private JLabel LabNom;
    private JLabel LabPrenom;
    private JLabel LabCIN;
    private JLabel LabEmail;
    private JLabel LabPseudo;
    private JLabel LabPassword;
    private JLabel LabCodeSecret;
    private JPasswordField Password;
    private JTextField Name;
    private JTextField Prenom;
    private JTextField CIN;
    private JTextField Email;
    private JTextField Pseudo;
    private JTextField Code;
    private JButton Registre;
    
	public CreateNewAdmin(String s) {
		
		super(s);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600, 50);
        setSize(696, 980);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
		p.setBackground(new Color(42, 44, 54));
        p.setInheritsPopupMenu(true);
        p.setBounds(507, 527, 600, 100);
        
        //Label Create New Admin
        LabCreate = new JLabel();
        LabCreate.setFont(new Font("Tahoma", 2, 36)); // NOI18N
        LabCreate.setForeground(new Color(0, 255, 255));
        LabCreate.setHorizontalAlignment(SwingConstants.CENTER);
        LabCreate.setText("Create New Admin");
        LabCreate.setBounds(190,30,310, 50);
        p.add(LabCreate);
        
        
        //Label Name 
        LabNom = new JLabel();
        LabNom.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LabNom.setForeground(new java.awt.Color(204, 204, 204));
        LabNom.setText("Nom :");
        LabNom.setBounds(50, 200, 150, 20);
        p.add(LabNom);
        
        //Name Field
        Name = new JTextField();
        Name.setBounds(200, 200, 400, 30);
        p.add(Name);
        
        
        //Label Surname
        LabPrenom = new JLabel();
        LabPrenom.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LabPrenom.setForeground(new java.awt.Color(204, 204, 204));
        LabPrenom.setText("Prenom :");
        LabPrenom.setBounds(50, 280, 150, 20);
        p.add(LabPrenom);
        
        //Surname Field
        Prenom = new JTextField();
        Prenom.setBounds(200, 280, 400, 30);
        p.add(Prenom);
        
        //Label CIN
        LabCIN = new JLabel();
        LabCIN.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LabCIN.setForeground(new java.awt.Color(204, 204, 204));
        LabCIN.setText("CIN :");
        LabCIN.setBounds(50, 360, 150, 20);
        p.add(LabCIN);
        
        //CIN Field
        CIN = new JTextField();
        CIN.setBounds(200, 360, 400, 30);
        p.add(CIN);
        
        //Label Email 
        LabEmail = new JLabel();
        LabEmail.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LabEmail.setForeground(new java.awt.Color(204, 204, 204));
        LabEmail.setText("E-mail :");
        LabEmail.setBounds(50, 440, 150, 20);
        p.add(LabEmail);
        
        //Email Field
        Email = new JTextField();
        Email.setBounds(200, 440, 400, 30);
        p.add(Email);
        
        //Label Pseudo 
        LabPseudo = new JLabel();
        LabPseudo.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LabPseudo.setForeground(new java.awt.Color(204, 204, 204));
        LabPseudo.setText("Pseudo :");
        LabPseudo.setBounds(50, 520, 150, 20);
        p.add(LabPseudo);
        
        //Pseudo Field
        Pseudo = new JTextField();
        Pseudo.setBounds(200, 520, 400, 30);
        p.add(Pseudo);
        
        //Label Password 
        LabPassword = new JLabel();
        LabPassword.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LabPassword.setForeground(new java.awt.Color(204, 204, 204));
        LabPassword.setText("Mot de passe :");
        LabPassword.setBounds(50, 600, 150, 20);
        p.add(LabPassword);
        
        //Password Field
        Password = new JPasswordField();
        Password.setBounds(200, 600, 400, 30);
        p.add(Password);
        
        //Label Code Secret  
        LabCodeSecret = new JLabel();
        LabCodeSecret.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        LabCodeSecret.setForeground(new java.awt.Color(204, 204, 204));
        LabCodeSecret.setText("Code secret :");
        LabCodeSecret.setBounds(50, 680, 150, 20);
        p.add(LabCodeSecret);
        
        //Code Field
        Code = new JTextField();
        Code.setBounds(200, 680, 400, 30);
        p.add(Code);
        
        
        
        //REGISTRE
        Registre = new JButton("Registre");
        Registre.setFont(new Font("Arial",0,16));
        Registre.setBounds(280, 850, 125, 51);
        Registre.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
            	RegistreMouseClicked(evt);
            }
        });
        p.add(Registre);
        
        
        

	}
	
	
	 private void RegistreMouseClicked(MouseEvent evt) {                                      
	        // Button REGISTRE
	        
	        JOptionPane.showMessageDialog(null,"New Admin Added\n Welcome Admin");
	        AdminLogin l1 = new AdminLogin("Admin");
	        l1.setVisible(true);
	        this.dispose();
	    }                                     

    
    
	 public static void main(String []args) {
	    	
	    	CreateNewAdmin n = new CreateNewAdmin("New Admin");
	    	n.show();
	    	
	    } 
}
