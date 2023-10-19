import java.util.Scanner;


public class Ejemplo29

{
    public static void main(String[] args)
    {
    	boolean esPalindromo = true;
    	Scanner sc = new Scanner(System.in);

        
    	
    	System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine();
        sc.close();

        for (int i = 0; i < palabra.length()/2; i++)
        {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1))
            {
                esPalindromo = false;
                break;
            }
        }
        if(esPalindromo)
        {
            System.out.println("Es palíndromo");
        }

        else
        {
            System.out.println("No es palíndromo");
        }

    }
}