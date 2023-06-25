package APS_LP;
import java.util.Scanner;
public class questão_9_ok {
    //(9.) Efetuar a leitura de 4 valores inteiros e exibir na tela o menor e o maior deles.//
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int n= 0,maior = 0, menor = 0;

            System.out.println("Digite o primeiro numero!");
            int n1=leitor.nextInt();
            System.out.println("Digite o segundo numero!");
            int n2=leitor.nextInt();
            System.out.println("Digite o terceiro numero!");
            int n3=leitor.nextInt();
            System.out.println("Digite o quarto numero!");
            int n4=leitor.nextInt();

            if(n4>n3 && n4>n2 && n4>n1){
                maior = n4;
            } else if(n3>n4 && n3>n2 && n3>n1){
                maior = n3;
            } else if(n2>n4 && n2>n3 && n2>1){
                maior = n2;
            } else if (n1>n2 && n1>n3 && n1>n4){
                maior = n1;
            }

            if(n4<n3 && n4<n2 && n4<n1){
                menor = n4;
            } else if(n<n4 && n3<n2 && n3<n1){
                menor = n3;
            } else if(n2<n4 && n2<n3 && n2<1){
                menor = n2;
            } else if (n1<n2 && n1<n3 && n1<n4){
                menor = n1;
            }
            System.out.println("O maior valor é " + maior + ", E o menor valor é " + menor);
        }
    }





