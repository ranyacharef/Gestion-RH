package Interfaces;
import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import ClassesMetiers.Conge;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.sql.Types;
public class AffecterConge extends JFrame implements ActionListener{
	
	private JPanel p;
	private JPanel p1;
    private JButton save;
    private JButton back;
    private JComboBox<String> Poste;
    private JComboBox<String> type;
    private JComboBox<String> Grade;
    private JLabel LabIcone;
    private JLabel icone;
    private JLabel dateDeb;
    private JLabel	typeCon;
    private JLabel dateFin;
    private JLabel title;
    private JLabel Nom;
    private JLabel Prenom;
    private JLabel DateNais;
    private JLabel CIN;
    private JLabel id;
    private JLabel LieuNais;
    private JLabel DateEmb;
    private JLabel numtel;
    private JLabel 	poste;
    private JLabel  grade;
    private JTextField NomField;
    private JTextField PrenomField;
	private JTextField CINField;
    private JTextField idField;
    private JTextField numtelField;
    private JTextField dateEmbField;
    private JTextField dateDebField;
    private JTextField dateFinField;
    private JTextField dateNaisField;
    private JTextField LieuNaisField;
    private JSeparator Sep;
    private String[] pos= { "Ouvier qualifie", "Employé", "Cadre", "Ingenieur" };
    private String[] gr={ "Grade 0", "Grade 1", "Grade 2", "Grade 4" };
    private String[] co= { "Maladie", "Maternité", "Paternité", "Vacances", "Sans Solde" };
    
	public AffecterConge(String s){
		
			super(s);
	
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocation(300,0);
	        setSize(1400, 1030);
	        setResizable(false);
	        setLayout(null);
	        
	        
	        
	        p=(JPanel)this.getContentPane();
	        p.setBackground(new Color(35, 35, 48));
	        
	        
	        p1 = new JPanel();
	        p1.setLayout(null);
	        p1.setBackground(new Color(3, 3, 22));
	        p1.setBounds(0,0,1920,70);
	        p.add(p1);
	        
	        LabIcone = new JLabel();
	        LabIcone.setIcon(new ImageIcon(getClass().getResource("/images/logocr.jpg")));
	        LabIcone.setBounds(0,0,140,65);
	        p1.add(LabIcone);
	        
	        title = new JLabel();
	        title.setFont(new Font("Century", 2, 26));
	        title.setForeground(new Color(204, 204, 204));
	        title.setText("Remplir un Congé");
	        title.setBounds(590,20,220, 40);
	        p1.add(title);
	        
	        
	        //Separator
	        Sep = new JSeparator();
	        Sep.setBounds(0, 70, 1920, 20);
	        p.add(Sep);
	        
	        
	        //Label NOM
	        Nom = new JLabel();
	        Nom.setFont(new Font("Tahoma", 2, 18)); 
	        Nom.setForeground(new Color(255, 255, 255));
	        Nom.setText("Nom :");
	        Nom.setBounds(40, 130, 170, 22);
	        p.add(Nom);
	        //TextField NOM
	        NomField = new JTextField();
	        NomField.setBounds(270, 130, 242, 34);
	        p.add(NomField);
	        
	        
	        //Label PRENOM
	        Prenom = new JLabel();
	        Prenom.setFont(new Font("Tahoma", 2, 18)); 
	        Prenom.setForeground(new Color(255, 255, 255));
	        Prenom.setText(" Prénom :");
	        Prenom.setBounds(550, 130, 170, 22);
	        p.add(Prenom);
	        //TextField Prenom
	        PrenomField = new JTextField();
	        PrenomField.setBounds(710, 130, 242,34);
	        p.add(PrenomField);
	        
	        //Label Date NAISSANCE
	        DateNais = new JLabel();
	        DateNais.setFont(new Font("Tahoma", 2, 18)); 
	        DateNais.setForeground(new Color(255, 255, 255));
	        DateNais.setText("Date de naissance :");
	        DateNais.setBounds(40, 200, 170, 22);
	        p.add(DateNais);
	        //Date NAIS Field
	        dateNaisField = new JTextField();
	        dateNaisField.setBounds(270, 200, 242, 34);
	        p.add(dateNaisField);
	        
	        //Lieu NAISSANCE
	        LieuNais = new JLabel();
	        LieuNais.setFont(new Font("Tahoma", 2, 18)); 
	        LieuNais.setForeground(new Color(255, 255, 255));
	        LieuNais.setText("Lieu de Naissance :");
	        LieuNais.setBounds(550, 200, 200, 22);
	        p.add(LieuNais);
	        //Lieu NAIS Field
	        LieuNaisField = new JTextField();
	        LieuNaisField.setBounds(710, 200, 242,34);
	        p.add(LieuNaisField);
	        
	        //Label CIN
	        CIN = new JLabel();
	        CIN.setFont(new Font("Tahoma", 2, 18)); 
	        CIN.setForeground(new Color(255, 255, 255));
	        CIN.setText("CIN :");
	        CIN.setBounds(40, 270, 170, 22);
	        p.add(CIN);
	        //CIN Field
	        CINField = new JTextField();
	        CINField.setBounds(270, 270, 242, 34);
	        p.add(CINField);
	        
	        //Label ID
	        id = new JLabel();
	        id.setFont(new Font("Tahoma", 2, 18)); 
	        id.setForeground(new Color(255, 255, 255));
	        id.setText("ID :");
	        id.setBounds(550, 270, 170, 22);
	        p.add(id);
	        //id Field
	        idField = new JTextField();
	        idField.setBounds(710, 270, 242,34);
	        p.add(idField);
	        
	        //NUM TELEPHONE
	        numtel = new JLabel();
	        numtel.setFont(new Font("Tahoma", 2, 18)); 
	        numtel.setForeground(new Color(255, 255, 255));
	        numtel.setText("N° Téléphone :");
	        numtel.setBounds(40, 340, 170, 22);
	        p.add(numtel);
	        // NUM TEL Field
	        numtelField = new JTextField();
	        numtelField.setBounds(270, 340, 450, 34);
	        p.add(numtelField);
	        

	        
	        //Label DATE EMBAUCHEMENT
	        DateEmb = new JLabel();
	        DateEmb.setFont(new Font("Tahoma", 2, 18)); 
	        DateEmb.setForeground(new Color(255, 255, 255));
	        DateEmb.setText("Date Embauchement :");
	        DateEmb.setBounds(40, 410, 190, 22);
	        p.add(DateEmb);
	        //Date EMB Field
	        dateEmbField = new JTextField();
	        dateEmbField.setBounds(270, 410, 450, 34);
	        p.add(dateEmbField);
	        
	        //ICONE
	        icone = new JLabel();
	        icone.setIcon(new ImageIcon(getClass().getResource("/images/Out-Of-The-Office_Logo-Final-353x227.png")));
	        icone.setBounds(950,200,500, 300);
	        p.add(icone);
	        
	        
	        //POSTE
	        poste = new JLabel();
	        poste.setFont(new Font("Tahoma", 2, 18)); 
	        poste.setForeground(new Color(255, 255, 255));
	        poste.setText("Poste :");
	        poste.setBounds(40, 480, 190, 22);
	        p.add(poste);
	        //Poste ComboBox
	        Poste = new JComboBox<>();
	        Poste.setModel(new DefaultComboBoxModel<>(pos));
	        Poste.setBounds(270, 480, 162, 34);
	        p.add(Poste);
	        
	        
	        
	        //GRADE
	        grade = new JLabel();
	        grade.setFont(new Font("Tahoma", 2, 16));
	        grade.setForeground(new Color(255, 255, 255));
	        grade.setText("Grade :");
	        grade.setBounds(40, 550, 190, 22);
	        p.add(grade);
	        //Grade Box
	        Grade = new JComboBox<>();
	        Grade.setFont(new Font("Tahoma", 2, 16)); 
	        Grade.setModel(new DefaultComboBoxModel<>(gr));
	        Grade.setBounds(270, 550, 162, 34);
	        p.add(Grade);
	        
	        //Date DEBUT CONGE 
	        dateDeb = new JLabel();
	        dateDeb.setFont(new Font("Tahoma", 2, 18));
	        dateDeb.setForeground(new Color(255, 255, 255));
	        dateDeb.setText("Date début Congé :");
	        dateDeb.setBounds(40, 620, 190, 22);
	        p.add(dateDeb);
	        //Date BEDUT CONGE FIELD
	        dateDebField = new JTextField();
	        dateDebField.setBounds(270, 620, 450, 34);
	        p.add(dateDebField);
	        
	        //Date FIN CONGE
	        dateFin = new JLabel();
	        dateFin.setFont(new Font("Tahoma", 2, 18)); 
	        dateFin.setForeground(new Color(255, 255, 255));
	        dateFin.setText("Date fin Congé :");
	        dateFin.setBounds(40, 690, 190, 22);
	        p.add(dateFin);
	        //DATE FIN CONGE FIELD
	        dateFinField = new JTextField();
	        dateFinField.setBounds(270, 690, 450, 34);
	        p.add(dateFinField);
	        
	        
	        //TYPE CONGE
	        typeCon = new JLabel();
	        typeCon.setFont(new Font("Tahoma", 2, 18)); 
	        typeCon.setForeground(new Color(255, 255, 255));
	        typeCon.setText("Type Congé");
	        typeCon.setBounds(40, 780, 190, 22);
	        p.add(typeCon);
	        //TYPE CONGE COMBOBOX
	        type = new JComboBox<>();
	        type.setModel(new DefaultComboBoxModel<>(co));
	        type.setBounds(270, 780, 162, 34);
	        p.add(type);
	       
	        
	        
	        //Bouttons
	        save = new JButton();
	        save.setText("Enregistrer");
	        save.setFont(new Font("Arial",0,16));
	        save.setBounds(450,900,125, 51);
	        save.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	                SAVE(e);
	            }
	        });
	        p.add(save);
	        
	        back = new JButton();
	        back.setText("Retour");
	        back.setFont(new Font("Arial",0,16));
	        back.setBounds(850, 900, 125, 51);
	        back.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e){
	                BACK(e);
	            }
	        });
	        p.add(back);
	
	     
	    }                       

	
	    private void BACK(MouseEvent e) {                                      
	       
	               	Home h = new Home("");
	                h.setVisible(true);
	                this.dispose();
	    }                                     

	    private void SAVE(MouseEvent e) { 
	    	int teste=0;
	    	try {
	    		     
	    	     if(NomField.getText().equals("")||PrenomField.getText().equals("")||CINField.getText().equals("")||idField.getText().equals("")||numtelField.getText().equals("")||numtelField.getText().equals("")||dateEmbField.getText().equals("")||dateDebField.getText().equals("")||dateFinField.getText().equals("")||dateNaisField.getText().equals(""))
	    	    		 JOptionPane.showMessageDialog(null, "Remplir tous les champs", "Erreur saisie",0);
	    	     else 
	    	    	 teste=1;
	    	    	 //JOptionPane.showMessageDialog(null,"Congé Affecté !");
	    }
	    	catch(NumberFormatException e1) {
	     	   JOptionPane.showMessageDialog(null, "Vérifier le format des entrées", "Erreur de saisie",JOptionPane.ERROR_MESSAGE);
	    		}         
	    	if(teste==1) {
	    		try{
		    		Connexion c = new Connexion();
		        	String rt = "INSERT INTO conge (CIN, ID, Nom, Prenom, Date_Naissance, Lieu_Naissance, N_tel, Date_Embauchement, Poste, Grade, Date_Debut, Date_Fin, Type_Conge) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		        	
					PreparedStatement statement = (PreparedStatement)c.con.prepareStatement(rt);
					statement.setObject(1, Integer.parseInt(CINField.getText()),Types.INTEGER);
					statement.setObject(2, Integer.parseInt(idField.getText()),Types.INTEGER);
					statement.setObject(3, NomField.getText(),Types.VARCHAR);
					statement.setObject(4, PrenomField.getText(),Types.VARCHAR);
					statement.setObject(5, dateNaisField.getText(),Types.VARCHAR);
					statement.setObject(6, LieuNaisField.getText(),Types.VARCHAR);
					statement.setObject(7, Integer.parseInt(numtelField.getText()),Types.INTEGER);
					statement.setObject(8, dateEmbField.getText(),Types.VARCHAR);
					statement.setObject(9, pos[Poste.getSelectedIndex()],Types.VARCHAR);
					statement.setObject(10, gr[Grade.getSelectedIndex()],Types.VARCHAR);
					statement.setObject(11, dateDebField.getText(),Types.VARCHAR);
					statement.setObject(12, dateFinField.getText(),Types.VARCHAR);
					statement.setObject(13, co[type.getSelectedIndex()],Types.VARCHAR);
					
					int nb = statement.executeUpdate();
		    	
					if (nb==1) {
					setCursor(new Cursor(Cursor.WAIT_CURSOR));
					System.out.println("Congé affecté!");}
					
					 
					}catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("sql exception!!");
					e1.printStackTrace();
				}
		    	}
	    	}
	    	
	    public static void main(String args[]) {
	       
	        
	       
	    	AffecterConge ac = new AffecterConge("Affecter Conge");
	    	ac.show();
	            }
	  
	
                    
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}



