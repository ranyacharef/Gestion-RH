package Interfaces;
import java.awt.BorderLayout;

import javax.swing.*;

import ClassesMetiers.Admin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminLogin extends JFrame implements ActionListener{
	
	private JPanel p;
	private JButton Login, Cancel;
    private JLabel labName, LabPassword, labAL;
    private JLabel LabIcone;
    private JLabel NewAdminAccount, SignUp;
    private JSeparator Sep1, Sep2;
    private JPasswordField password;
    private JTextField username;
    
	public AdminLogin(String s) {
		
		super(s);
		setLocation(600,30); 
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(696, 980);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
		p.setBackground(new Color(42, 44, 54));
        p.setInheritsPopupMenu(true);
        //p.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
      
    
        
        //Label ADMIN Login
        labAL = new JLabel();
        labAL.setFont(new Font("Century", 0, 14)); // NOI18N
        labAL.setForeground(new Color(153, 153, 153));
        labAL.setText("Admin Login");
        labAL.setBounds(18,18,100,20);
        p.add(labAL);
        
        
        
        //Label ICONE 
        LabIcone = new JLabel();
        LabIcone.setIcon(new ImageIcon(getClass().getResource("/images/lalalala.png")));
        LabIcone.setBounds(280, 60, 136, 200);
        p.add(LabIcone);
        
        
        //Label USERNAME
        labName = new JLabel();
        labName.setFont(new Font("Tahoma", 0, 14)); 
        labName.setForeground(new Color(0, 204, 204));
        labName.setText("Nom d'utulisateur");
        labName.setBounds(70, 300, 150, 17);
        p.add(labName);
       
        
        //TextField USERNAME
        username = new JTextField();
        username.setBackground(new Color(42, 44, 54));
        username.setForeground(new Color(240, 240, 240));
        username.setToolTipText("");
        username.setBorder(null);
        username.setBounds(150, 350, 350, 30);
        p.add(username);
        
        //Separator 1
        Sep1 = new JSeparator();
        Sep1.setBounds(150, 390, 421, 2);
        p.add(Sep1);
        
        
        
        
        
        //Label  PASSWORD
        LabPassword = new JLabel();
        LabPassword.setFont(new Font("Tahoma", 0, 14)); 
        LabPassword.setForeground(new Color(0, 204, 204));
        LabPassword.setText("Mot de passe");
        LabPassword.setBounds(70, 460, 150, 17);
        p.add(LabPassword);
        
        //PasswordField PASSWORD
        password = new JPasswordField();
        password.setBackground(new Color(42, 44, 54));
        password.setForeground(new Color(204, 204, 204));
        password.setBorder(null);
        password.setBounds(150, 500, 350,30);
        p.add(password);
        
        //SEPARATOR 2
        Sep2 = new JSeparator();
        Sep2.setBounds(150, 540, 421, 2);
        p.add(Sep2);
        
        
        

        //Label Create New ADMIN Account
        NewAdminAccount = new JLabel();
        NewAdminAccount.setBackground(new Color(204, 204, 204));
        NewAdminAccount.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        NewAdminAccount.setForeground(new Color(153, 153, 153));
        NewAdminAccount.setText("Créer un nouveau compte");
        NewAdminAccount.setBounds(240, 600, 250, 17);
        p.add(NewAdminAccount);
       
       
        //Label Sign up
        SignUp = new JLabel();
        SignUp.setFont(new Font("Tahoma", 0, 12));
        SignUp.setForeground(new Color(0, 204, 204));
        SignUp.setText("S'inscrire");
        SignUp.setBounds(395, 600, 53, 17);
        SignUp.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
            	SignUpMouseClicked(evt);
            }
        });
        p.add(SignUp);
        
        
        
        
        
        //Login Button
        Login = new JButton();
        Login.setText("Valider");
        Login.setFont(new Font("Arial",0,16));
        Login.setBounds(180, 800, 125, 60);
        Login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
            	LoginMouseClicked(evt);
            }});
        p.add(Login);

        
        
        
        //Cancel Button
        Cancel = new JButton();
        Cancel.setText("Annuler");
        Cancel.setFont(new Font("Arial",0,16));
        Cancel.setBounds(400, 800, 125, 60);
        Cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            CancelActionPerformed(evt);
            }
        });
        p.add(Cancel);
        
        

        
	}
	
	
	private void CancelActionPerformed(ActionEvent e) {                                         

        username.setText("");
        password.setText("");
        
    }                                    

    private void LoginMouseClicked(MouseEvent e) { 
    	
   try {
     if(username.getText().equals("")||password.getText().equals(""))
    		 JOptionPane.showMessageDialog(null, "Remplir tous les champs", "Erreur saisie",0);
     else {
        if(username.getText().contains("Ranya")){
            if(password.getText().contains("Ranya")){
            
                JOptionPane.showMessageDialog(null, "Login successfully\nWelcome Admin ");
                Home h = new Home("Home");
                h.setVisible(true);
                this.dispose();
        }
        else {
              JOptionPane.showMessageDialog(null, "Failed to login\nThe password you’ve entered is incorrect");
              password.setText("");
            }
        }
        else {
              JOptionPane.showMessageDialog(null, "Failed to login. The username you’ve entered doesn’t match any account");
              username.setText("");
              password.setText("");
            
       }}}
       catch(NumberFormatException e1) {
    	   JOptionPane.showMessageDialog(null, "Vérifier le format des entrées", "Erreur de saisie",JOptionPane.ERROR_MESSAGE);
       }
    }        
    
 private void SignUpMouseClicked(MouseEvent e) {           
    	
        // Creation d'un nouveau Admin
    	CreateNewAdmin n = new CreateNewAdmin("New Admin");
         n.setVisible(true);
                
        this.dispose();
    }                           



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    
    public static void main(String []args) {
    	
    	AdminLogin al = new AdminLogin("Admin");
    	al.show();
    	
    } 
    
   
}