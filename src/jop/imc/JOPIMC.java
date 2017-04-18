/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jop.imc;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class JOPIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 menu();
        
    }
    public static void menu () {
    
     double   Peso, Altura;
        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora de IMC");
        
        Peso =  JOPfromStringtoINT ("Introduce tu peso en kilogramos.");
        Altura = JOPfromStringtoINT ("Introduce tu altura en metros");
        Operacion ( Peso, Altura);
       
        
    }
    
    public static double JOPfromStringtoINT (String a) {
    boolean flag ;
    double x = 0;
        do {
        try {
         String h = JOptionPane.showInputDialog(null, a);
          x = Double.parseDouble(h);
         flag = false;
        }
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Introduzca un valor correcto, por favor");
                flag = true;
            }
        
        }
        
        while (flag ); 
    
    return x;
    
    
    }
    public static void Operacion (double Peso, double Altura){
    
    double IMC = Peso / Math.pow(Altura, 2) ;
    
    JOptionPane.showMessageDialog(null, "Tu indice de masa corporal (IMC) es de: "+ IMC);
    
    salida();
    }
    
    public static void salida(){
    int x;
   x = JOptionPane.showConfirmDialog(null,"Operacion terminada ¿Desea salir?" );
    
    if (x==0) {System.exit(0);}
     if (x==1) {menu();}
    
    
    }
            
            
        
    
    
}
