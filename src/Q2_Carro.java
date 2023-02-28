import java.util.Scanner;

public class Q2_Carro {
    public static void main(String[] args) {
        int ano = 0;
        String placa;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a placa");
        placa = sc.next();
        System.out.println("Digite o ano");
        ano = sc.nextInt();

        if (ano <= 2010)
            System.out.println("Carro velho");

        else if (ano <= 2021)
            System.out.println("Carro semi-novo");

        else if (ano == 2022)
            System.out.println("Carro novo");

        else
            System.out.println("Ano desconhecido");

        //if (placa.charAt(i) == 'a' || placa.charAt(i) == 'e' || placa.charAt(i) == 'i' || placa.charAt(i) == 'o' || placa.charAt(i) == 'u');
        //for (int i = 0; i < placa.length(); i++) { O for não era necesario no codigo
            placa = placa.replace('a', '*');
            placa = placa.replace('e', '*');
            placa = placa.replace('i', '*');
            placa = placa.replace('o', '*');
            placa = placa.replace('u', '*');
            placa = placa.replace('A', '*');
            placa = placa.replace('E', '*');
            placa = placa.replace('I', '*');
            placa = placa.replace('O', '*');
            placa = placa.replace('U', '*');
       // }
        System.out.println("Placa alterada: " + placa);
    }
}
