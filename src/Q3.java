import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int vogaisT = 0;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        //for(int i=0; i<frase.length(); i++){ Codigo feito por mim
           // if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u'){
               // vogaisT++;
           // }
        //}
        
        for(int i=0; i<frase.length(); i++){ //Codigo feito pela professora
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'|| frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O'|| frase.charAt(i) == 'U')
                vogaisT++;
        }
        System.out.println("Total de vogais: " + vogaisT);
    }
}

