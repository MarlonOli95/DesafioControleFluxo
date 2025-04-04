import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int parametroDois = scanner.nextInt();

        try {
            if (parametroDois < parametroUm) {
                throw new ParametrosInvalidosException();
            }
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O SEGUNDO NÚMERO DEVE SER MAIOR QUE O PRIMEIRO");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (parametroUm + i));
        }
    }
}

class ParametrosInvalidosException extends Exception {
}


/*ABAIXO ESTÃO AS TENTATIVAS DE CODIGO QUE TENTEI FAZER. ESTAVA QUEBRANDO A CABEÇA POIS
 * NÃO ESTAVA ENTENDENDO AONDE ESTAVA ERRANDO.
 */
/* 
import java.util.Locale;
import java.util.Scanner;


public class Contador{

    public static void main(String[] args) { 
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite o primeiro número: ");
      int parametroUm = scanner.nextInt();

      System.out.println("Digite o segundo número: ");
      int parametroDois = scanner.nextInt();
      

      try{  if (parametroDois > parametroUm)
            contar(parametroUm, parametroDois)
        }
         catch(ParametrosInvalidosException e) {
          System.out.println("O SEGUNDO NUMERO DEVE SER MAIOR QUE O PRIMEIRO");
   }
  
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
           for (contagem = 0; contagem > 0 ; contagem++);{
            System.out.println("Imprimindo o numero: " + contagem);
               }
}
}
    








/*
try { 
    for (int contagem=0; contagem>0;contagem++) {
      System.out.println("O primeiro numero é: " +);

    contar(parametroUm, parametroDois);

  } catch(InputMismatchException e) {
    System.out.println("O SEGUNDO NUMERO DEVE SER MAIOR QUE O PRIMEIRO");
  }
}
static void contar(int parametroUm, int parametroDois) throws InputMismatchException {
    int contagem = parametroDois - parametroUm;
   }
 */