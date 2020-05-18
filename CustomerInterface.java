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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
public class CustomerInterface extends JFrame {
    //___________Non-interface variables
    
    private double NoOfHours ; // number of hours   
    private Customer Customer = new Customer(10,"Mahdi"); // Object to hold the Customer Information getted form the login interface
                                //Note ; the first argument for the ID , the second one is the name
    
    
    //__________Interface variables 
    private JLabel Logo;
    private JLabel HoursText ;
    private JTextField HoursField ;
    
       
    private JTextArea CarInfo ; 
    private JButton Pick  ; //TO Send Query to the server to change the status of the car
    private JButton Upload ; //to upload the map 
    private JComboBox Cars;  // to choose the car -- > then the info about the car will be display in the textare
    
    private JPanel TextPanel ; // to hold HoursText and the HoursField
    private JPanel MainPanel ; // To hold the MapPanel , TextArea, TextPanel
    
    CustomerInterface () {
        super("CarNee!");
    Logo = new JLabel(new ImageIcon("C:\\Users\\Dobler\\OneDrive - King Faisal University\\4th\\OOP2\\CarNee\\Logo.jpeg"));
    HoursText = new JLabel("Enter the number of hours :");
    HoursField = new JTextField (4);
    
    
   
     Pick = new JButton ("Pick") ; 
    
     TextPanel = new JPanel (); 
     MainPanel = new JPanel() ; 
     TextPanel.setVisible(true);
    
        MainPanel.setVisible(true);
     
     
        add(Logo,BorderLayout.NORTH);
        setBackground(Color.WHITE);
        
        this.TextPanel.setLayout(new BoxLayout(TextPanel,BoxLayout.X_AXIS));
        TextPanel.add(this.HoursText);
        TextPanel.add(this.HoursField);
        TextPanel.setBackground(Color.WHITE);
        
        String Test = "Car Name : Corola\nCar Color: Red\nCar Type: Family\nCar Cost: 23$\nOwner Name: Mohammed\nPhone Number:05233440";
        CarInfo=new JTextArea(Test,9,14);
        
        CarInfo.setFont(new Font("Salif",Font.PLAIN,24));
        
        JPanel p1 = new JPanel(); p1.setLayout(new BorderLayout());
        p1.setBackground(Color.WHITE);
        Upload = new JButton("Upload");
        String n[] = {"car1","car2","car3","car4"};
        Cars = new JComboBox(n);
        Cars.setMaximumRowCount(4);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));
        p2.add(Upload); p2.add(Cars);
        p1.add(p2,BorderLayout.NORTH); p1.add(CarInfo,BorderLayout.CENTER);
        
        MainPanel.setLayout(new BorderLayout());
        MainPanel.setBackground(Color.WHITE);
        MainPanel.add(p1,BorderLayout.CENTER);
        MainPanel.add(TextPanel,BorderLayout.NORTH);

        
        
        
        add(MainPanel,BorderLayout.CENTER);
        add(Pick,BorderLayout.SOUTH);
     
        
        //Menu_______________________
    JMenu File = new JMenu ("File");
    File.setMnemonic('f');
    JMenuItem AboutItem = new JMenuItem ("About");
    File.add(AboutItem);
    AboutItem.addActionListener(new ActionListener (){
        public void actionPerformed (ActionEvent e ) { JOptionPane.showMessageDialog(CustomerInterface.this,"This's CarNee bitch!","About", JOptionPane.INFORMATION_MESSAGE); }   });
        AboutItem.setMnemonic('A');
    
    JMenuItem Exit = new JMenuItem("Exit");
    Exit.setMnemonic('X');
    Exit.addActionListener(new ActionListener () { public void actionPerformed (ActionEvent e) { System.exit(0); } });
    File.add(Exit); 
    
    JMenuBar bar = new JMenuBar (); bar.add(File);
    setJMenuBar(bar);
    
    //Frame sization
    
    setSize(570,510);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setResizable(true);
    getContentPane().setBackground(Color.WHITE);
    }
}
