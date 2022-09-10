package Interfaces;

//import Controler.Contrats;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Contrats extends JFrame {
	
    private JButton retour;
    private JButton imprimer;
    private JComboBox<String> typeC;
    private JComboBox<String> typeD;
    private JLabel LabIcone;
    private JLabel title;
    private JLabel salarie;
    private JLabel nom;
    private JLabel prenom;
    private JLabel cin;
    private JLabel nat;
    private JLabel sit;
    private JLabel dateNais;
    private JLabel LieuNais;
    private JLabel ntel;
    private JLabel dip;
    private JLabel cont;
    private JLabel cr;
    private JLabel deno;
    private JLabel sect;
    private JLabel rc;
    private JLabel ins;
    private JLabel sig;
    private JLabel dc;
    private JPanel p;
    private JPanel p1;
    private JPanel p2;
    private JSeparator Sep1;
    private JSeparator Sep2;
    private JTextField tnom;
    private JTextField tp;
    private JTextField tc;
    private JTextField td;
    private JTextField tl;
    private JTextField tln;
    private JTextField tnat;
    private JTextField tdeno;
    private JTextField trc;
    private JTextField tsect;
    private JTextField tins;
    private JTextField tdc;
    private JCheckBox c;
    private JCheckBox m;
    private JCheckBox d;
    private JCheckBox v;
	 
	public Contrats(String s) {
		
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(new Point(500, 10));
        setSize(919, 1020);
        setResizable(false);
        setLayout(null);
        
        p=(JPanel)this.getContentPane();
        p.setBackground(new Color(255,255,255));
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(3, 3, 22));
        p1.setBounds(0,0,919,70);
        p.add(p1);
        
        LabIcone = new JLabel();
        LabIcone.setIcon(new ImageIcon(getClass().getResource("/images/logocr.jpg")));
        LabIcone.setBounds(0,0,140,65);
        p1.add(LabIcone);
       
        
        title = new JLabel();
        title.setFont(new Font("Century", 2, 26));
        title.setForeground(new Color(204, 204, 204));
        title.setText("Ajouter Fonctionnaire");
        title.setBounds(350,12,355, 40);
        p1.add(title);
        
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(3, 3, 22));
        p2.setBounds(0,915,919,70);
        p.add(p2);
        
        
        retour = new JButton();
        retour.setText("RETOUR");
        retour.setFont(new Font("Arial",0,16));
        retour.setBounds(250, 10, 120, 50);
        retour.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	retour(e);
            }
        });
        p2.add(retour);
			
        imprimer = new JButton();
        imprimer.setText("IMPRIMER");
        imprimer.setFont(new Font("Arial",0,16));
        imprimer.setBounds(580, 10, 120, 50);
        imprimer.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	imprimer(e);
            }

		
        });
        p2.add(imprimer);
		
        salarie = new JLabel();
        salarie.setFont(new Font("Century", 3, 18));
        salarie.setText("Salarie :");
        salarie.setBounds(10, 70, 160, 22);
        p.add(salarie);
        
        Sep1 = new JSeparator();
        Sep1.setBackground(new Color(160,160,160));
        Sep1.setBounds(40, 95, 819, 1);
        p.add(Sep1);
        
        nom = new JLabel();
        nom.setFont(new Font("Century", 2, 16)); 
        nom.setForeground(new Color(51, 51, 51));
        nom.setText("Nom : ");
        nom.setBounds(20, 110, 80, 17);
        p.add(nom);
        
        tnom = new JTextField();
        tnom.setBounds(170, 110, 300, 25);
        p.add(tnom);
        
        
        prenom = new JLabel();
        prenom.setFont(new Font("Century", 2, 16)); 
        prenom.setText("Prénom :");
        prenom.setBounds(480, 110, 80, 17);
        p.add(prenom);
        
        tp = new JTextField();
        tp.setBounds(570, 110, 290, 25);
        p.add(tp);
        
        
        cin = new JLabel();
        cin.setFont(new Font("Century", 2, 16)); 
        cin.setText("CIN :");
        cin.setBounds(20, 150, 80, 17);
        p.add(cin);
        
        tc = new JTextField();
        tc.setBounds(170, 150, 300, 25);
        p.add(tc);
        
        dateNais = new JLabel();
        dateNais.setFont(new Font("Century", 2, 16)); 
        dateNais.setText("Date de naissance :");
        dateNais.setBounds(20, 190, 145, 17);
        p.add(dateNais);
        
        td = new JTextField();
        td.setBounds(170, 190, 300, 25);
        p.add(td);
        
        LieuNais = new JLabel();
        LieuNais.setFont(new Font("Century", 2, 16)); 
        LieuNais.setText("Lieu de naissance :");
        LieuNais.setBounds(480, 190, 145, 17);
        p.add(LieuNais);
        
        tln = new JTextField();
        tln.setBounds(630, 190, 230, 25);
        p.add(tln);
        
        ntel = new JLabel();
        ntel.setFont(new Font("Century", 2, 16)); 
       	ntel.setText("N° Télephone : ");
       	ntel.setBounds(20, 230, 120, 17);
        p.add(ntel);
        
        tl = new JTextField();
        tl.setBounds(170, 230, 300, 25);
        p.add(tl);
       	
       	nat = new JLabel();
        nat.setFont(new Font("Century", 2, 16)); 
        nat.setText("Nationalité :");
        nat.setBounds(20, 270, 120, 17);
        p.add(nat);
        
        tnat = new JTextField();
        tnat.setBounds(170, 270, 300, 25);
        p.add(tnat);
        
        
        
        sit = new JLabel();
        sit.setFont(new Font("Century", 2, 16));
        sit.setText("Situation familiale :");
        sit.setBounds(20, 310, 155, 17);
        p.add(sit);
        
        c = new JCheckBox();
        c.setBackground(new Color(255, 255, 255));
        c.setText("Célibataire");
        c.setBounds(170, 310, 155, 17);
        p.add(c);
        
        m = new JCheckBox();
        m.setBackground(new Color(255, 255, 255));
        m.setText("Marié(e)");
        m.setBounds(330, 310, 155, 17);
        p.add(m);
        
        d = new JCheckBox();
        d.setBackground(new Color(255, 255, 255));
        d.setText("Divorcé(e)");
        d.setBounds(490, 310, 155, 17);
        p.add(d);
        
        v = new JCheckBox();
        v.setBackground(new Color(255, 255, 255));
        v.setText("Voeuf(ve)");
        v.setBounds(650, 310, 155, 17);
        p.add(v);

        dip = new JLabel();
        dip.setFont(new Font("Century", 2, 16));
        dip.setText("Diplome Obtenu : ");
        dip.setBounds(20,350, 155, 17);
        p.add(dip);
        
        typeD= new JComboBox<String>();
        typeD.setModel(new DefaultComboBoxModel<>(new String[] { "Non Diplomé(e)", "Bac", "Bac+3", "Bac+5" }));
        typeD.setBounds(170,350,300,25);
        p.add(typeD);
        
        cont = new JLabel();
        cont.setFont(new Font("Century", 2, 16));
        cont.setText("Type Contrat :");
        cont.setBounds(20, 390, 155, 17);
        p.add(cont);
       
        typeC = new JComboBox<String>();
        typeC.setModel(new DefaultComboBoxModel<>(new String[] { "CDI", "CDD", "CTT", "Aprentissage", "Professionnalisation", "CUI" }));
        typeC.setBounds(170,390,300,25);
        p.add(typeC);
        
        cr = new JLabel();
        cr.setFont(new Font("Century", 3, 18));
        cr.setText("Entreprise CR: ");
        cr.setBounds(10, 450, 145, 22);
        p.add(cr);

        
        Sep2 = new JSeparator();
        Sep2.setBackground(new Color(160,160,160));
        Sep2.setBounds(40, 475, 819, 1);
        p.add(Sep2);
        
        deno = new JLabel();
        deno.setFont(new Font("Century", 2, 16));
        deno.setText("Dénomination de l'entreprise : ");
        deno.setBounds(20, 500, 250, 17);
        p.add(deno);
        
        tdeno = new JTextField();
        tdeno.setBounds(270, 500, 300, 25);
        p.add(tdeno);
        
        sect = new JLabel();
        sect.setFont(new Font("Century", 2, 16)); 
        sect.setText("Secteur d'activité :");
        sect.setBounds(20, 540,199, 17);
        p.add(sect);
        
        tsect = new JTextField();
        tsect.setBounds(270, 540, 300, 25);
        p.add(tsect);

        ins = new JLabel();
        ins.setFont(new Font("Century", 2, 16));
        ins.setText("Numéro d'affilation à la CNSS :");
        ins.setBounds(20, 580, 250, 17);
        p.add(ins);
        
        tins = new JTextField();
        tins.setBounds(270, 580, 300, 25);
        p.add(tins);
        
        rc = new JLabel();
        rc.setFont(new Font("Century", 2, 16)); 
        rc.setText("N° d'inscription au registre de commerce :");
        rc.setBounds(20, 620, 320, 17);
        p.add(rc);
        
        trc = new JTextField();
        trc.setBounds(330, 620, 240, 25);
        p.add(trc);
        
        dc = new JLabel();
        dc.setFont(new Font("Century", 2, 16));
        dc.setText("Dénomination de la Compagnie d'assurance des maladies et des accidents de travail :");
        dc.setBounds(20, 660, 700, 17);
        p.add(dc);
        
        tdc = new JTextField();
        tdc.setBounds(20, 690, 860, 50);
        p.add(tdc);

        sig = new JLabel();
        sig.setFont(new Font("Calibri Light", 2, 20)); 
        sig.setText("Signatures");
        sig.setBounds(80, 760, 90, 23);
        p.add(sig);

        

	}
	
        
        private void retour(MouseEvent e) {
			
             Home h = new Home("Home");
             h.setVisible(true);
             this.dispose(); 
             
		}
        
    	private void imprimer(MouseEvent e) {
			
    		JOptionPane.showMessageDialog(null,"Impression en cours");
            Home h = new Home("Home");
            h.setVisible(true);
            this.dispose();
			
		}
    
	  public static void main(String args[]) {
	       
	        
	       
	    	Contrats c = new Contrats("Nouveau Contrat");
	    	c.show();
	            }
}
