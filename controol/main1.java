/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author mplab4.pc06
 */
public class main1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        char[] normal;
        char[] revez;
        String x;
        
        
        

        int i = 0, op;

        while (i == 0) {
            System.out.println("1. ingresar numero");
            System.out.println("2. salir");
            
            op = entrada.nextInt();
            if (op == 1) {
                try{
                    entrada.nextLine();
                    System.out.println("ingrese el numero: ");
                    numero = entrada.nextInt();
                    x = Integer.toString(numero);
                    
                    
                    normal = new char[x.length()];
                    revez = new char[x.length()];
                    int index=0;
                    for(int j =0;j<x.length();j++){
                        normal[j]= x.charAt(j);
                        
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
                catch(InputMismatchException ex){
                    System.out.println("debes ingrese un entero para que el programa funcione");
                    return;
                }
            
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

       




    

