/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnee;

/**
 *
 * @author Dobler
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
public class RenterInterface extends JFrame {
    Renter Renter = new Renter (); // to hold the info about the renter
    
    private JPanel AddPanel ;
    //_________UPDATE VARIABLES
    private JPanel UpdatePanel;
    private JPanel MapPanel; 
    private JTextField UpdateText;
    private JLabel UpdateLabel;
    private JButton Update ; 
    //_________DELETE VARIABLES
    private JPanel DeletPanel;
    private JLabel DeletLabel;
    private JTextField DeletText;
    private JButton Submit ; 
    private int SerialNumber;
    private JLabel BigLogo;
    
    private JButton Refresh ;
    private JLabel Logo ; 
    
    private JTabbedPane TabbedPane ; 
    RenterInterface (){
    super("CarNee");   
      
      Logo = new JLabel(new ImageIcon("C:\\Users\\Dobler\\OneDrive - King Faisal University\\4th\\OOP2\\CarNee\\Logo.jpeg"));
      add(Logo,BorderLayout.NORTH);
      
      TabbedPane = new JTabbedPane ();
      TabbedPane.setBackground(Color.WHITE);
      AddPanel = new JPanel ();
      AddPanel.setBackground(Color.WHITE);
      DeletPanel = new JPanel ();
      DeletPanel.setBackground(Color.WHITE);
      UpdatePanel = new JPanel ();
      UpdatePanel.setBackground(Color.WHITE);
      TabbedPane.addTab("Add a car",AddPanel );
      TabbedPane.addTab("Update a car",UpdatePanel );
      TabbedPane.addTab("Delete a car",DeletPanel );
        
      add(TabbedPane,BorderLayout.CENTER);
      
      Refresh = new JButton ("Refresh");
      add(Refresh,BorderLayout.SOUTH);
    //_______add panel
    
        //----> it will be the same as the addition in the registiration
    
    //______Delete Panel 
    DeletLabel = new JLabel("Enter the serial number : ");
    DeletText = new JTextField(7);
    BigLogo = new JLabel(new ImageIcon("C:\\Users\\Dobler\\OneDrive - King Faisal University\\4th\\OOP2\\CarNee\\BigLogo.png"));        
    DeletPanel.setLayout(new BorderLayout());
    JPanel textPanel = new JPanel();
    Submit = new JButton("Submit");
    textPanel.setLayout(new BoxLayout(textPanel,BoxLayout.X_AXIS)); textPanel.add(DeletLabel);
    textPanel.add(DeletText); textPanel.add(Submit); textPanel.setBackground(Color.WHITE);

    DeletPanel.add(textPanel,BorderLayout.NORTH);
    DeletPanel.add(BigLogo,BorderLayout.CENTER);
   //______UPDATE PANEL
    UpdateLabel = new JLabel("Enter the serial number : ");
    UpdateText = new JTextField(7);
    MapPanel = new JPanel();
    MapPanel.setBackground(Color.RED);
    UpdatePanel.setLayout(new BorderLayout());
    JPanel textPanel2 = new JPanel();
    Update = new JButton("Update");
    textPanel2.setLayout(new BoxLayout(textPanel2,BoxLayout.X_AXIS)); textPanel2.add(UpdateLabel);
    textPanel2.add(UpdateText); textPanel2.add(Update); textPanel2.setBackground(Color.WHITE);

    UpdatePanel.add(textPanel2,BorderLayout.NORTH);
    UpdatePanel.add(MapPanel,BorderLayout.CENTER);
      
      
//Menu_______________________
    JMenu File = new JMenu ("File");
    File.setMnemonic('f');
    JMenuItem AboutItem = new JMenuItem ("About");
    File.add(AboutItem);
    AboutItem.addActionListener(new ActionListener (){
        @Override
        public void actionPerformed (ActionEvent e ) { JOptionPane.showMessageDialog(RenterInterface.this ,"This's CarNee bitch!","About", JOptionPane.INFORMATION_MESSAGE); }   });
        AboutItem.setMnemonic('A');
    
    JMenuItem Exit = new JMenuItem("Exit");
    Exit.setMnemonic('X');
    Exit.addActionListener(new ActionListener () { public void actionPerformed (ActionEvent e) { System.exit(0); } });
    File.add(Exit); 
    
    JMenuBar bar = new JMenuBar (); bar.add(File);
    setJMenuBar(bar);
    
    
    
    setSize(570,510);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setResizable(true);
    getContentPane().setBackground(Color.WHITE);
    
        }
}
