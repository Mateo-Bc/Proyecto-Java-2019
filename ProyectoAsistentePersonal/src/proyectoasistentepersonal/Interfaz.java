package proyectoasistentepersonal;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Interfaz extends JFrame {
    
    public Interfaz(){
        this.iniciarVentana();
        this.iniciarComponentes();
        this.setVisible(true);
        
    }

    private void iniciarVentana() {
        //-Definición de la ventana-//
        this.setTitle("Pierre, Asistente Personal");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        this.setLayout(null);
        //--------------------------//
        
    }

    private void iniciarComponentes() {
        
        //----------Colores---------//
        Color violeta = new Color(155, 0, 255);
        Color violeta_claro = new Color(194, 124, 255);
        Color verde = new Color(0, 255, 0);
        //--------------------------//
        
        //Propiedades de la ventana//
        this.setSize(800,500);
        //this.getContentPane().setBackground();
        //-------------------------//
        
        //--Objetos de la ventana--//
        JLabel labelimagen = new JLabel();
        labelimagen.setIcon(new ImageIcon("/home/mateo/Escritorio/Colegio/Programación 2019/Java/Ejercicios/Sistema de Control de Versiones (SCV)/Proyecto-Java-2019/base.png"));
        labelimagen.setBounds(100,25,600,150);
        
        JLabel pierre = new JLabel("¿Que quieres que Pierre haga por tí?");
        pierre.setBounds(275,200,300,50);
        
        JTextField texto = new JTextField();
        texto.setEditable(true);
        texto.setBounds(100, 250, 550, 15);
        
        JButton enviar = new JButton("→");
        enviar.setBounds(650, 250, 50, 15);
        
        JTextArea consola = new JTextArea();
        consola.setEditable(false);
        consola.setBounds(100, 350, 600, 100);
        add(consola);
        
        JScrollPane scroll = new JScrollPane(consola);
        scroll.setBounds(100, 350, 600, 100);
        scroll.setVisible(true);
        
        
        //-------------------------//
        
        //--Inicio de la ventana--//
        this.add(labelimagen);
        this.add(pierre);
        this.add(texto);
        this.add(enviar);
        //this.add(consola);
        this.add(scroll);
        
        //------------------------//
        
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent enviar) {
                String container = texto.getText();
                String nada = "";
                texto.setText(nada);
                consola.append(container);
                consola.append(System.getProperty("line.separator"));
                //new ProyectoAsistentePersonal("");
                
                
            }
        });
    }
}