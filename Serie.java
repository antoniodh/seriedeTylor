/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import java.util.Scanner;
/**
 *
 * @author ANTONIO
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantos términos desea: ");
        double n = sc.nextInt();
        
        System.out.print("Digita el valor de x..: ");
        double x = sc.nextDouble();
        
        //Calculo
        double s = 0, t;
        int sig = 1;
        for (int i = 1; i <= n; i++) {
            t = Math.pow(x, i) / (double)factorial(i) * sig;
            sig *= -1;
            s += t;
            i++;
        }
        System.out.println("f("+x+") =RESULTADO EN RADIANES:"+ s);

    }
    
    public static double factorial(int n) {
        double aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *=  i;
        }
        return aux;
    }﻿
    
}