/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.helloworld;
import java.util.Scanner;
/**
 *
 * @author asautier
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ex01
        /*
        System.out.println("Bonjour\nJava\nCode");
        */
        
        //Exo 4
     
       Scanner sc = new Scanner(System.in); 
        
 System.out.print("x : ");
 int x = sc.nextInt();
 
 System.out.print("y : ");
 int y = sc.nextInt();
 
 System.out.println("x" +x +" y" +y );
 
 int z=0;
         
z=x;
x=y;
y=z;

System.out.println("x "+x +"y: " +y );
 
 
    }
   
}