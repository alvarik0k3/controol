/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author mplab4.pc06
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int[] normal;
        int[] revez;
        
        String x;

        int i = 0, op;

        while (i == 0) {
            System.out.println("1. ingresar numero");
            System.out.println("2. salir");
            op = entrada.nextInt();
            if (op == 1) {
                entrada.nextLine();
                System.out.println("ingrese el numero: ");
                numero = entrada.nextInt();
                x = Integer.toString(numero);
                
                
                normal = new int[x.length()];
                revez = new int[x.length()];
                int index=0;
                for(int j =0;j<x.length();j++){
                    normal[j]=(int) (numero/(Math.pow(10,(j+1))));
                    
                }
                for(int j=x.length()-1;j>=0;j--){
                revez[index]=normal[j];
                index++;
                    
                }
                for(int j =0;j<x.length();j++){
                    
                    System.out.print(revez[j]);

            }
                System.out.println("");
            
            }
            if (op == 2) {
                i = 2;

            }
            else{
               
                System.out.println("ingrese una opcion valida");
                
            }
        }
    }
}
            




    

