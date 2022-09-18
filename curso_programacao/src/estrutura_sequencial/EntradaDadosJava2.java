package estrutura_sequencial;

import java.util.Scanner;

public class EntradaDadosJava2 {

    public static void main(String[] args) {
    
        int x;
        String s1, s2, s3;
        Scanner sc = new Scanner(System.in);
    
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println("x: " + x);
        System.out.println("s1: " + s1);
        System.out.println("s1: " + s2);
        System.out.println("s1: " + s3);
        
        
    }
}