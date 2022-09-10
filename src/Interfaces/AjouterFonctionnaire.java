package Interfaces;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.sql.Types;

import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

public class AjouterFonctionnaire extends JFrame{
		

		
		private JPanel p;
	    private JPanel pimage;
	    private JLabel LabIcone;
	    private JLabel title;
	    private JSeparator Sep;
	    private JLabel nom;
	    private JLabel prenom;
	    private JLabel cin;
	    private JLabel DateNais;
	    private JLabel sexe;
	    private JLabel ad;
	    private JLabel mail;
	    private JLabel dip;
	    private JLabel typeCont;
	    private JLabel ntel;
	    private JLabel grade;
	    private JLabel LieuNais;
	    private JLabel situation;
	    private JLabel CodePost;
	    private JLabel image;
	    private JRadioButton Homme;
	    private JRadioButton Femme;
	    private JScrollPane adresse;
	    private JTextField textnom;
	    private JTextField textprenom;
	    private JTextField textcin;
	    private JTextField date;
	    private JTextField admail;
	    private JTextField LNais;
	    private JTextField code;
	    private JTextField ntelphone;
	    private JTextPane text;
	    private JButton save;
	    private JButton retour;
	    private JButton inserer;
	    private JComboBox<String> typeC;
	    private JComboBox<String> niveau;
	    private JComboBox<String> grades;
	    private JComboBox<String> sit;
	    private String[] SF= { "Célibataire", "Marié(e)", "Divorcé(e)", "Voeuf(ve)" };
	    private String[] dipl={ "Non diplome(e)", "Bac", "Bac+3", "Bac+5", "Bac+8" };
	    private String[] co={ "SIVP", "CDD", "KARAMA", "CDI" };
	    private String[] pos={ "Agent de production", "Ouvrier qualifie", "Employe/Maitrise", "Cadre/Ingenieur" };
	    
		public AjouterFonctionnaire(String s){
			
			super(s);
			 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocation(new Point(10, 00));
	        setSize(1876, 1030);
	        setResizable(false);
	        setLayout(null);
			
	        p=(JPanel)this.getContentPane();
	        p.setBackground(new Color(35, 35, 48));
	        
	       
	      
	        
	        pimage = new JPanel();
	        pimage.setLayout(null);
	        pimage.setBackground(new Color(3, 3, 22));
	        pimage.setBounds(0,0,1876,70);
	        p.add(pimage);
	        
	        LabIcone = new JLabel();
	        LabIcone.setIcon(new ImageIcon(getClass().getResource("/images/logocr.jpg")));
	        LabIcone.setBounds(0,0,140,65);
	        pimage.add(LabIcone);
	        
	       
	        
	        title = new JLabel();
	        title.setFont(new Font("Century", 2, 26));
	        title.setForeground(new Color(204, 204, 204));
	        title.setText("Ajouter Fonctionnaire");
	        title.setBounds(820,12,350, 40);
	        pimage.add(title);
	        
	        Sep = new JSeparator();
	        Sep.setBounds(0, 65, 1876, 20);
	        p.add(Sep);
	        
	        cin = new JLabel();
	        cin.setFont(new Font("Century", 2, 20));
	        cin.setForeground(new Color(255, 255, 255));
	        cin.setText("CIN :");
	        cin.setBounds(50,100,63,28);
	        p.add(cin);
	        
	        textcin = new JTextField();
	        textcin.setBorder(null);
	        textcin.setBounds(270,100,246,31);
	        p.add(textcin);

	        nom = new JLabel();
	        nom.setFont(new Font("Century", 2, 20)); 
	        nom.setForeground(new Color(255, 255, 255));
	        nom.setText("Nom :");
	        nom.setBounds(50,170,63,28);
	        p.add(nom);
	        
	        textnom = new JTextField();
	        textnom.setBorder(null);
	        textnom.setBounds(270,170,487,31);
	        p.add(textnom);
	        
	        prenom = new JLabel();
	        prenom.setFont(new Font("Century", 2, 18));
	        prenom.setForeground(new Color(255, 255, 255));
	        prenom.setText("Prénom :");
	        prenom.setBounds(880,170,120,28);
	        p.add(prenom);
	        
	        
	        textprenom = new JTextField();
	        textprenom.setBorder(null);
	        textprenom.setBounds(270,170,487,31);
	        textprenom.setBounds(1100,170,480,30);
	        p.add(textprenom);

	        DateNais = new JLabel();
	        DateNais.setFont(new Font("Century", 2, 20)); 
	        DateNais.setForeground(new Color(255, 255, 255));
	        DateNais.setText("Date de naissance :");
	        DateNais.setBounds(50,240,182,28);
	        p.add(DateNais);
	        
	        LieuNais = new JLabel();
	        LieuNais.setFont(new Font("Century", 2, 18));
	        LieuNais.setForeground(new Color(255, 255, 255));
	        LieuNais.setText("Lieu de Naissance :");
	        LieuNais.setBounds(880,240,200,28);
	        p.add(LieuNais);
	        
	        LNais = new JTextField();
	        LNais.setBorder(null);
	        LNais.setBounds(1100,240,480,30);
	        p.add(LNais);
	        
	        date = new JTextField();
	        date.setBorder(null);
	        date.setBounds(270,240,487,31);
	        p.add(date);
	        
	        sexe = new JLabel();
	        sexe.setFont(new Font("Century", 2, 20)); 
	        sexe.setForeground(new Color(255, 255, 255));
	        sexe.setText("Sexe :");
	        sexe.setBounds(50,310,63,28);
	        p.add(sexe);
	        
	       
	        Homme = new JRadioButton();
	        Homme.setBackground(new Color(255, 255, 255));
	        Homme.setFont(new Font("Arial", 0, 14));
	        Homme.setText("Homme");
	        Homme.setBounds(270,300,152,36);
	        p.add(Homme);

	        Femme = new JRadioButton();
	        Femme.setBackground(new Color(255, 255, 255));
	        Femme.setFont(new Font("Arial", 0, 14));
	        Femme.setText("Femme");
	        Femme.setBounds(605,300,152,36);
	        p.add(Femme);
	        
	        ad = new JLabel();
	        ad.setFont(new Font("Century", 2, 20));
	        ad.setForeground(new Color(255, 255, 255));
	        ad.setText("Adresse  : ");
	        ad.setBounds(50,380,120,28);
	        p.add(ad);
	        
	        adresse = new JScrollPane();
	        text = new JTextPane();
	        adresse.setViewportView(text);
	        adresse.setBounds(270,380,487,120);
	        p.add(adresse);
	        
	        
	        CodePost = new JLabel();
	        CodePost.setFont(new Font("Century", 2, 18));
	        CodePost.setForeground(new Color(255, 255, 255));
	        CodePost.setText("Code Postal :");
	        CodePost.setBounds(880,380,120,28);
	        p.add(CodePost);
	        
	        code = new JTextField();
	        code.setBorder(null);
	        code.setBounds(1100,380,246,30);
	        p.add(code);
	        
	        
	        ntel = new JLabel();
	        ntel.setFont(new Font("Century", 2, 20));
	        ntel.setForeground(new Color(255, 255, 255));
	        ntel.setText("N° de Téléphone :");
	        ntel.setBounds(50,530,180,28);
	        p.add(ntel);
	        
	        ntelphone = new JTextField();
	        ntelphone.setBounds(270,530,487,31);
	        p.add(ntelphone);

	        situation = new JLabel();
	        situation.setFont(new Font("Century", 2, 20));
	        situation.setForeground(new Color(255, 255, 255));
	        situation.setText("Situation familiale :");
	        situation.setBounds(50,600,190,28);
	        p.add(situation);

	        sit = new JComboBox<String>();
	        sit.setModel(new DefaultComboBoxModel<>(SF));
	        sit.setBounds(270,600,163,37);
	        p.add(sit);
	        
	        dip = new JLabel();
	        dip.setFont(new Font("Century", 2, 18));
	        dip.setForeground(new Color(255, 255, 255));
	        dip.setText("Diplome :");
	        dip.setBounds(50,670,180,28);
	        p.add(dip);
	        
	        niveau = new JComboBox<String>();
	        niveau.setModel(new DefaultComboBoxModel<>(dipl));
	        niveau.setBounds(270,670,163,37);
	        p.add(niveau);
	        
	        typeCont = new JLabel();
	        typeCont.setFont(new Font("Century", 2, 18));
	        typeCont.setForeground(new Color(255, 255, 255));
	        typeCont.setText("Type Contrat : ");
	        typeCont.setBounds(50,740,180,28);
	        p.add(typeCont);
	        
	        typeC = new JComboBox<String>();
	        typeC.setModel(new DefaultComboBoxModel<>(co));
	        typeC.setBounds(270,740,163,37);
	        p.add(typeC);
	        
	        grade = new JLabel();
	        grade.setFont(new Font("Century", 2, 18));
	        grade.setForeground(new Color(255, 255, 255));
	        grade.setText("Grade :");
	        grade.setBounds(50,810,180,28);
	        p.add(grade);
	        
	        grades = new JComboBox<String>();
	        grades.setModel(new DefaultComboBoxModel<>(pos));
	        grades.setBounds(270,810,163,37);
	        p.add(grades);
	        
	        
	        
	        mail = new JLabel();
	        mail.setFont(new Font("Century", 2, 20));
	        mail.setForeground(new Color(255, 255, 255));
	        mail.setText("Adresse e-mail : ");
	        mail.setBounds(50,880,180,28);
	        p.add(mail);
	        
	        admail =  new JTextField();
	        admail.setBorder(null);
	        admail.setBounds(270,880,487,31);
	        p.add(admail);
	        
	      

	      

	        pimage = new JPanel();
	        pimage.setBackground(new Color(45, 62, 80));
	        pimage.setBounds(1636,70,240,1030);
	        pimage.setLayout(null);
	        p.add(pimage);
	        
	        image = new JLabel();
	        image.setIcon(new ImageIcon(getClass().getResource("/images/4911a934710eede408be06cef5434004--free-icon-vector-icons.jpg"))); // NOI18N
	        image.setBounds(11, 325, 212, 236);
	        pimage.add(image);
	        
	        inserer = new JButton();
	        inserer.setText("Inserez l'image");
	        inserer.setBounds(50, 570, 129, 17);
	        pimage.add(inserer);

	      
	        save = new JButton();
	        save.setText("Enregistrer");
	        save.setFont(new Font("Arial",0,16));
	        save.setBounds(600,930,137,48);
	        save.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent evt) {
	                save(evt);
	            }
	        });
	        p.add(save);
	        
	        retour =   new JButton();
	        retour.setText("Retour");
	        retour.setFont(new Font("Arial",0,16));
	        retour.setBounds(1060,930,137,48);
	        retour.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent evt) {
	                retour(evt);
	            }
	        });
	        p.add(retour);
	        


		}
	    
		 private void retour(MouseEvent e) {                                      
			 			// Bouton de retour
		                LesFonctionnaires h = new LesFonctionnaires("Les Fonctionnaires");
		                h.setVisible(true);
		                this.dispose();
		        
		    }                                     

		    private void save(MouseEvent e) {   
		    	int teste=0;
		    	
		    	try {
		    		
		    	    if(textnom.getText().equals("")||textprenom.getText().equals("")||textcin.getText().equals("")|| date.getText().equals("")||admail.getText().equals("")||LNais.getText().equals("")||code.getText().equals("")||ntelphone.getText().equals("")||text.getText().equals("")||Homme.getText().equals("")|Femme.getText().equals(""))
		       		 		
		    	    	JOptionPane.showMessageDialog(null, "Remplir tous les champs", "Erreur saisie",0);
		    	    else 
		    	    	teste=1;
		    	    	
		    	   
		    	}
		    	catch(NumberFormatException e1) {
		     	   JOptionPane.showMessageDialog(null, "Vérifier le format des entrées", "Erreur de saisie",JOptionPane.ERROR_MESSAGE);
		    	}
		    	
		    	if(teste==1) {
		    	
		    	try{
		    		Connexion c = new Connexion();
		        	String rt = "INSERT INTO fonctionnaire (cin, Nom, Prenom, Date_Naissance, Lieu_Naissance, Sexe, Adresse, Code_Postal, N_tel, Situation_Familial, Diplome, Contrat, Grade, Adresse_mail) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		        	
					PreparedStatement statement = (PreparedStatement)c.con.prepareStatement(rt);
					statement.setObject(1, Integer.parseInt(textcin.getText()),Types.INTEGER);
					statement.setObject(2, textnom.getText(),Types.VARCHAR);
					statement.setObject(3, textprenom.getText(),Types.VARCHAR);
					statement.setObject(4, date.getText(),Types.VARCHAR);
					statement.setObject(5, LNais.getText(),Types.VARCHAR);
					statement.setObject(6, Homme.getText(),Types.VARCHAR);
					statement.setObject(7, text.getText(),Types.VARCHAR);
					statement.setObject(8, Integer.parseInt(code.getText()),Types.INTEGER);
					statement.setObject(9, Integer.parseInt(ntelphone.getText()),Types.INTEGER);
					statement.setObject(10, SF[sit.getSelectedIndex()],Types.VARCHAR);
					statement.setObject(11, dipl[niveau.getSelectedIndex()],Types.VARCHAR);
					statement.setObject(12, co[typeC.getSelectedIndex()],Types.VARCHAR);
					statement.setObject(13, pos[grades.getSelectedIndex()],Types.VARCHAR);
					statement.setObject(14, admail.getText(),Types.VARCHAR);
					 
		    		
					int nb = statement.executeUpdate();
		    	
					if (nb==1) {
					setCursor(new Cursor(Cursor.WAIT_CURSOR));
					System.out.println("Fonctionnaire ajouté !");}
					//JOptionPane.showMessageDialog(null,"Fonctionnaire ajouté !");
					 
					}catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("sql exception!!");
					e1.printStackTrace();
				}
		    	}
		        
		    }                                     

	
		  public static void main(String args[]) {
		     
		    	AjouterFonctionnaire af = new AjouterFonctionnaire("Nouvel Fonctionnaire");
		    	af.show();
		    	
		            }
	    
}
