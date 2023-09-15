/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.monedas.y;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CalculadoraDeMonedasY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euro = 18.21;
        double dolar = 17.07;
        double yen = 0.12;
        double libras = 21.18;
       Scanner lectura = new Scanner(System.in);
       System.out.print("Ingrese cantidad en pesos");
       double pesos = lectura.nextInt();
       
       System.out.print("euro: " + pesos/euro);
       System.out.print("dolar: " + pesos/dolar);
       System.out.print("yen: " + pesos/ yen);
       System.out.print("libras: " + pesos/libras);
       
       
    }  
    
}
