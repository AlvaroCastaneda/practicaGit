/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo;

import java.util.Scanner;

/**
 *
 * @author tank3
 */
public class AreaCirculo {

    double radio, area, pi;
    Scanner sc;
    
    public AreaCirculo(){
        radio = 0;
        area = 0;
        sc = new Scanner(System.in);
    }
    
    public void leer(){
        System.out.println("area");
        radio = sc.nextDouble();
    }
    
    public void saca(){
        pi = Math.PI;
        area = pi * Math.pow(radio, 2);
        
        System.out.println("Area: " + area);
        
    }
    
    public static void main(String[] args) {
        AreaCirculo ac = new AreaCirculo();
        ac.leer();
        ac.saca();
    }
    
}
