package APS_LP;

import java.util.Scanner;

public class questão_18_ok {
    /*18. Fazer um programa que verifique se um dado ano é ou não bissexto. Considere que:
• Anos divisíveis pelo número 4 são considerados bissextos.
• Anos divisíveis por 100 não são bissextos.
• Anos divisíveis por 400 são bissextos.*/
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Informe um ano");
        int ano =input.nextInt();

        if((ano % 400 == 0)|| (ano % 4 ==0 && ano % 100 !=0)){
            System.out.println("Ano bissexto!");
        } else {
            System.out.println("Ano não é bissexto!");
        }
    }
}

