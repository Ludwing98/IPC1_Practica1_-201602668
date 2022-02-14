/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;
import java.util.Scanner;
import java.io.IOException;

public class Pacman {
    
       static Scanner Scanner=new Scanner(System.in);
       
   
    public static void main(String []args){
        
        
        System.out.println("--INICIAR JUEGO--");
        System.out.println("1  Iniciar juego");
        System.out.println("2  Historial de Partidas");
        System.out.println("3  Salir");
        
        System.out.println("Por favor digite la opción");
       
        
        int option= Scanner.nextInt();
         
       
          
        
       switch(option){
           case 1:
               iniciar();
               break;
           case 2:
               historial();
               break;
           case 3:
               fin();
               break; 
    }
    


    }
static void iniciar() {
    Scanner tecla= new Scanner(System.in);
    String usuario;
    System.out.println("Nombre de Usuario");
            usuario = tecla.nextLine();
    System.out.println("POR FAVOR INGRESE LOS SIGUIENTES VALORES");
    System.out.println("TABLERO");
           String tablero = tecla.nextLine();
          
    System.out.println("PREMIOS[1-40]");
    int premio=Scanner.nextInt();   
    System.out.println("PAREDES[1-20]");
           int paredes=Scanner.nextInt();
    System.out.println("TRAMPAS[1-20]");
           int trampas=Scanner.nextInt();
    
   }


static void historial(){
    System.out.println("puntajes");
   int option= Scanner.nextInt();
}

static void fin(){
    System.out.println("Hasta pronto");
  
          
}
    
    public static void tablero(String[] args) throws IOException {
       String tableroGrande [][];
       int x = 10;
       int y = 10;
       tableroGrande = new String [x][y];
       
        menu(tableroGrande, 10, 10);
    }
    
    
   public static void menu(String tablero[][],int x, int y){
   for ( x = 0; x <10; x++ ){
       for ( y = 0; y <10; y++ ){
           System.out.print( tablero[x][y] = "" );
       
       }
   }
   for ( x = 0; x <10; x++ ){
       for ( y = 0; y <10; y++ ){
           if( x == 0 || x == 9 ){
               tablero[x][y] = "-";
               
           } else if (y == 0 || y == 9) {
               tablero[x][y] = "|";
           
           } else{
               tablero[x][y] = "0$";
           }
           
          
       
       }
   }
   
   for ( x = 0; x <10; x++ ){
       for ( y = 0; y <10; y++ ){ 
           System.out.print( tablero[x][y] +" " );
       
       }
       System.out.println();
   }
}    

   
}
    
   



