/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preuba2;


import java.awt.Desktop;
import java.io.File;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */



////////PARA BUSCAR URL///////////////
public class Buscar extends JFrame{
 public void goToURL(String URL){
           if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
 
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(URL);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                    Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
 
 
 
 ////////PARA ABRIR ARCHIVOS/////////
 
 public void abrirarchivo(String archivo){
     try{
         File objetofile = new File (archivo);
         Desktop.getDesktop().open(objetofile);
     }catch (IOException ex){
         System.out.println(ex);
     }
     
 }
 

 
 
 
    JTextArea area;
    
    //-- LE AGREGAMOS TODO A LA VENTANA MEDIANTE EL CONSTRUCTOR
public Buscar(){
IniciarVentana();
IniciarComponentes();
setVisible(true);


}



    public void IniciarVentana() {
    setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
    setSize(500,500); 
    setLayout(null);
    setTitle("ola");
            
    
    setResizable(false);
    }

    
    public void IniciarComponentes() {
    ////AREA////    
    area = new JTextArea();
    area.setEditable(false);
    
    area.setBounds(10, 10, 470, 300);
    add(area);
    
    ////TEXTFIELD////
    JTextField texto = new JTextField();
    texto.setBounds(10,320,470,15);
    texto.setText("Copie una URL");
    JTextField texto2 = new JTextField();
    texto2.setBounds(10,345,470,15);
    texto2.setText("Ingrese directorio de un archivo que quiera abrir");

            

    add(texto);
    add(texto2);
    
    
    
    ////BOTON////
    JButton boton = new JButton();
    boton.setText("Buscar");
    JButton boton2 = new JButton();
    boton2.setText("Borrar");
    JButton boton3 = new JButton();
    boton3.setText("AbrirArchivo");
    
    
    boton.setBounds(130, 415, 100, 30);
    boton2.setBounds(240, 415, 100, 30);
    boton3.setBounds(350, 415, 100, 30);
    
    add(boton);
    add(boton2);
    add(boton3);
    
    ////FUNCIONES DEL BOTON////
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String txt = texto.getText();
            area.append("Usted buscó: " + txt); 
            area.append(System.getProperty("line.separator"));  	
            goToURL(txt);
            }
         });
    
       boton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae2) {
            texto.setText("Copie una URL");
            area.setText("");
            }
         });  
       
        boton3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae3) {
            String txt2 = texto2.getText();  
            abrirarchivo(txt2);
            }
         });        
       
       
    ////CHECKBOTON////
    JCheckBox check = new JCheckBox("Activar para escribir arriba");
    check.setBounds(142, 370, 220, 23);
    add(check);
    
      check.addItemListener(new ItemListener(){
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
    if(e.getStateChange()==ItemEvent.SELECTED){
      //Acción cuando está seleccionado
      String txt2 = texto.getText();
      area.setText("");
      area.append(texto.getName());
      area.append(System.getProperty("line.separator"));
      area.append(txt2);
      
      
      
     }
    }
    });
    
       
   ////SCROLL////
    JScrollPane scroll = new JScrollPane(area);
    scroll.setBounds(10, 10, 470, 300);
    add(scroll);
    
    scroll.setVisible(true);
    
    
    ////COLOR////
    Color c=Color.RED;
    getContentPane().setBackground(c);
    

    setVisible( true);  
    
    
    
    
    
   }
 
 
 
 
 
    



 
 
