import java.util.Scanner; 

  

public class Main { 

public static void main (String args []) { 

  

    Scanner scan= new Scanner (System.in); 

    System.out.println("Escreva um número!"); 

    int numero = scan.nextInt(); 

    if (numero % 2==0) { 

        System.out.println("O seu número é par!"); 

    } 

     

    else{ 

        System.out.println("O seu número é impar!"); 

         

    } 
       scan.close();  
} 

} 