package proyectoasistentepersonal;

import java.util.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.util.Date;

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
        
        JButton suma = new JButton("Suma");
        suma.setBounds(225, 300, 75, 30);
        suma.setVisible(false);
        
        JButton resta = new JButton("Resta");
        resta.setBounds(325, 300, 75, 30);
        resta.setVisible(false);
        
        JButton multiplicacion = new JButton("Mult.");
        multiplicacion.setBounds(425, 300, 75, 30);
        multiplicacion.setVisible(false);
        
        JButton division = new JButton("Div.");
        division.setBounds(525, 300, 75, 30);
        division.setVisible(false);
        
        JTextField numero1 = new JTextField();
        numero1.setBounds(325, 300, 75, 30);
        numero1.setVisible(false);
        
        JTextField numero2 = new JTextField();
        numero2.setBounds(425, 300, 75, 30);
        numero2.setVisible(false);
        
        JLabel signo = new JLabel("?");
        signo.setBounds(410, 310, 10, 10);
        signo.setVisible(false);
        
        JTextField resultadito = new JTextField();
        resultadito.setBounds(525, 300, 75, 30);
        resultadito.setVisible(false);
        resultadito.setEditable(false);
        
        JButton signoresultado = new JButton("=");
        signoresultado.setBounds(505, 305, 15, 15);
        signoresultado.setVisible(false);
        //-------------------------//
        
        //--Inicio de la ventana--//
        this.add(labelimagen);
        this.add(pierre);
        this.add(texto);
        this.add(enviar);
        //this.add(consola);
        this.add(scroll);
        
        this.add(suma);
        this.add(resta);
        this.add(multiplicacion);
        this.add(division);
        this.add(numero1);
        this.add(numero2);
        this.add(signo);
        this.add(resultadito);
        this.add(signoresultado);
        
        //------------------------//
        
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent enviar) {
                Metodos m = new Metodos(texto.getText(),consola, labelimagen, suma, resta, multiplicacion, division, numero1, numero2, signo, resultadito, signoresultado);
                m.analisis();
                
            suma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent suma) {
                    m.sumar();
                    signoresultado.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent signoresultado) {
                        m.resultasuma();
                
                }
            });
                
                }
            });
            
            resta.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent resta) {
                    m.restar();
                    signoresultado.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent signoresultado) {
                        m.resultaresta();
                }
            });
                    
            }
        });
            
            multiplicacion.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent multiplicacion) {
                    m.multiplicar();
                    signoresultado.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent signoresultado) {
                        m.resultamulti();
                }
            });
                    
            }
        });
            division.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent division) {
                    m.multiplicar();
                    signoresultado.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent signoresultado) {
                        m.resultadivi();
                }
            });
                    
            }
        });
            
        }
    });
    }
}

            