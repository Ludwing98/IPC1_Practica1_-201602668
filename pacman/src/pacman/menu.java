/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class menu {
    
    public static void menu(String []args){
        
        Scanner Scanner=new Scanner(System.in);
        
        System.out.println("--INICIAR JUEGO--");
        System.out.println("1  Iniciar juego");
        System.out.println("2  Historial de Partidas");
        System.out.println("3  Salir");
        
        System.out.println("Por favor digite la opción");
        int option= Scanner.nextInt();
    }
    
}
