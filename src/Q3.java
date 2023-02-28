import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int vogaisT = 0;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        for(int i=0; i<frase.length(); i++){
            char f = frase.charAt(i);
            if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u'){
                vogaisT++;
            }
        }
        System.out.println("Total de vogais: " + vogaisT);



    }
}
