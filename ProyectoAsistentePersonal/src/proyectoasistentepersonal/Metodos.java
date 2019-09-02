package proyectoasistentepersonal;

import java.io.File;
import java.util.Date;
import java.util.Arrays;
import javax.swing.*;

class Metodos {
    File archivo = new File("/home/mateo/Escritorio/archivo.txt");
    private String texto;
    private JTextArea consola;
    private JLabel labelimagen;
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton division;
    private JTextField numero1;
    private JTextField numero2;
    private JLabel signo;
    private JTextField resultadito;
    private JButton signoresultado;
    
    public Metodos(String texto, JTextArea consola, JLabel labelimagen, JButton suma, JButton resta, JButton multiplicacion, JButton division, JTextField numero1, JTextField numero2, JLabel signo, JTextField resultadito, JButton signoresultado){
        this.texto = texto;
        this.consola = consola;
        this.labelimagen = labelimagen;
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.signo = signo;
        this.resultadito = resultadito;
        this.signoresultado = signoresultado;
    }
    
    public void analisis(){
        String container = texto;
                String nada = "";
                texto = "";
                
                int longitud = container.length();
                
                String[] vector = container.split(" +");
                
                for (int x=0;x<vector.length;x++)
                    System.out.println("[" + x + "] " + vector[x]);
                    if (Arrays.asList(vector).contains("fecha") && Arrays.asList(vector).contains("hoy") || Arrays.asList(vector).contains("fecha?")){
                        java.util.Date fecha = new java.util.Date();
                        consola.append("[Directiva]: " + container);
                        consola.append(System.getProperty("line.separator"));
                        consola.append("- Hoy es " + fecha.toString());
                        consola.append(System.getProperty("line.separator"));
                        consola.append(System.getProperty("line.separator"));
                        consola.append(System.getProperty("line.separator"));
                        consola.append(System.getProperty("line.separator"));
                        ProyectoAsistentePersonal pierre = new ProyectoAsistentePersonal("- Hoy es " + fecha.toString());
                        
                    }else if (Arrays.asList(vector).contains("aborto") || Arrays.asList(vector).contains("aborto?")){
                        labelimagen.setIcon(new ImageIcon("/home/mateo/Escritorio/Colegio/Programación 2019/Java/Ejercicios/Sistema de Control de Versiones (SCV)/Proyecto-Java-2019/base2.png"));
                        consola.append("[Directiva]: " + container);
                        consola.append(System.getProperty("line.separator"));
                        consola.append("- Legal, seguro y gratuito wacho");
                        consola.append(System.getProperty("line.separator"));
                        consola.append(System.getProperty("line.separator"));
                        consola.append(System.getProperty("line.separator"));
                        consola.append(System.getProperty("line.separator"));
                        ProyectoAsistentePersonal pierre = new ProyectoAsistentePersonal("Legal, seguro y gratuito wacho");
                    
                    }else if (Arrays.asList(vector).contains("calculo") || Arrays.asList(vector).contains("calculo?") || Arrays.asList(vector).contains("calcular")|| Arrays.asList(vector).contains("calcular?")){
                        consola.append("[Directiva]: " + container);
                        consola.append(System.getProperty("line.separator"));
                        consola.append("- Puedo hacer: Suma");
                        consola.append(System.getProperty("line.separator"));
                        consola.append("-                       Resta");
                        consola.append(System.getProperty("line.separator"));
                        consola.append("-                       Multiplicación");
                        consola.append(System.getProperty("line.separator"));
                        consola.append("-                       División");
                        consola.append(System.getProperty("line.separator"));
                        
                        suma.setVisible(true);
                        resta.setVisible(true);
                        multiplicacion.setVisible(true);
                        division.setVisible(true);
                        
                        
                    }
                        
                }
    
    public void sumar(){
        suma.setVisible(false);
        resta.setVisible(false);
        multiplicacion.setVisible(false);
        division.setVisible(false);
        
        numero1.setVisible(true);
        numero2.setVisible(true);
        signo.setVisible(true);
        resultadito.setVisible(true);
        signoresultado.setVisible(true);
        
        signo.setText("+");
    }
    
    public void resultasuma(){
        String valor1 = numero1.getText();
        String valor2 = numero2.getText();
        int numEntero1 = Integer.parseInt(valor1);
        int numEntero2 = Integer.parseInt(valor2);
        int operacion = numEntero1 + numEntero2;
        resultadito.setText(Integer.toString(operacion));
    }
    
    public void restar(){
        suma.setVisible(false);
        resta.setVisible(false);
        multiplicacion.setVisible(false);
        division.setVisible(false);
        
        numero1.setVisible(true);
        numero2.setVisible(true);
        signo.setVisible(true);
        resultadito.setVisible(true);
        signoresultado.setVisible(true);
        
        signo.setText("-");
    }
    
    public void resultaresta(){
        String valor1 = numero1.getText();
        String valor2 = numero2.getText();
        int numEntero1 = Integer.parseInt(valor1);
        int numEntero2 = Integer.parseInt(valor2);
        int operacion = numEntero1 - numEntero2;
        resultadito.setText(Integer.toString(operacion));
    }
    
    public void multiplicar(){
        suma.setVisible(false);
        resta.setVisible(false);
        multiplicacion.setVisible(false);
        division.setVisible(false);
        
        numero1.setVisible(true);
        numero2.setVisible(true);
        signo.setVisible(true);
        resultadito.setVisible(true);
        signoresultado.setVisible(true);
        
        signo.setText("x");
    }
    
    public void resultamulti(){
        String valor1 = numero1.getText();
        String valor2 = numero2.getText();
        int numEntero1 = Integer.parseInt(valor1);
        int numEntero2 = Integer.parseInt(valor2);
        int operacion = numEntero1 * numEntero2;
        resultadito.setText(Integer.toString(operacion));
    }
    
    public void dividir(){
        suma.setVisible(false);
        resta.setVisible(false);
        multiplicacion.setVisible(false);
        division.setVisible(false);
        
        numero1.setVisible(true);
        numero2.setVisible(true);
        signo.setVisible(true);
        resultadito.setVisible(true);
        signoresultado.setVisible(true);
        
        signo.setText(":");
    }
    
    public void resultadivi(){
        String valor1 = numero1.getText();
        String valor2 = numero2.getText();
        int numEntero1 = Integer.parseInt(valor1);
        int numEntero2 = Integer.parseInt(valor2);
        int operacion = numEntero1 / numEntero2;
        resultadito.setText(Integer.toString(operacion));
    }
    
    
    
    public void existe(){
        if (archivo.exists()){
            System.out.println("dou");
        }else{
            System.out.println("sad dou");
        }
            
    }

    private void pierre(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}

