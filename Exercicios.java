// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
     // Exercício 1
    // String planeta = "Plutão";
    // System.out.println(planeta);

    // Exercício 2
    // System.out.println("Olá! Qual o seu nome?");
    // Scanner pergunta1 = new Scanner(System.in);
    // String nome = pergunta1.nextLine();
    // System.out.println("Olá! " + nome);

    // Exercício 3
    // Escreva um programa em Java em que o usuário informe o seu nome e em seguida
    // o programa perguntará a idade do usuário. Agora o programa deve exibir a
    // mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
    /*
     * System.out.println("Escreva seu nome");
     * Scanner scan = new Scanner(System.in);
     * String nome = scan.nextLine();
     * 
     * System.out.println("Escreva sua idade");
     * int numero = scan.nextInt();
     * 
     * System.out.println(nome + ", sua idade é " + numero);
     * 
     * // Exercício 4
     * // Calcular a área do retangulo
     * Scanner in = new Scanner(System.in);
     * System.out.println("Informe o valor da base do retangulo");
     * 
     * int base = in.nextInt();
     * 
     * System.out.println("Informe o valor da altura do retangulo");
     * int altura = in.nextInt();
     * 
     * System.out.println("O valor da area do retângulo é " + base * altura);
     

    // Calcular a área do quadrado
    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor do lado do quadrado");

    int lado = in.nextInt();

    System.out.println("O valor da area do quadrado é " + lado * lado);

    // Calcular a área do trapezio
    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor da base maior");
    int base_maior = in.nextInt();
    
    System.out.println("Informe o valor da base menor");
    int base_menor = in.nextInt();

    System.out.println("Informe o valor da altura");
    int altura = in.nextInt();
    
    System.out.println("O valor da area do trapezio é " + ((base_maior + base_menor)*altura)/2);

    // Exercício 5
    //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
    // System.out.println("Escreva um valor");
    //Scanner scan = new Scanner(System.in);
    // int numero_usuario = scan.nextInt();

    // if (numero_usuario < 0){
      // System.out.println("Valor negativo");
    //} else if (numero_usuario > 0) {
      // System.out.println("Valor positivo");
    //} else {
      // System.out.println("Zeroooooo");
    //}
  //}
//

// Exercício 6: Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 

System.out.println("Informe o valor 1");
Scanner sc1= new Scanner(System.in);
int valor_um = sc1.nextInt();

System.out.println("Informe o valor 2");
Scanner sc2= new Scanner(System.in);
int valor_dois = sc2.nextInt();

System.out.println("Informe o valor 3");
Scanner sc3= new Scanner(System.in);
int valor_três = sc3.nextInt();


if (valor_um > valor_dois && valor_um > valor_três) {
  System.out.println("Esse é o maior valor informado" + valor_um);

}  else if (valor_dois > valor_um && valor_dois > valor_três) {
  System.out.println("Esse é o maior valor informado " + valor_dois);

} else {
  System.out.println(" Esse é o maior valor informado:  " + valor_três);
}

  }
} */

//Exercício 7: Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 

/* System.out.println("Escreva o valor 1");
Scanner sc1 = new Scanner(System.in);
int valor1= sc1.nextInt();

System.out.println("Escreva o valor 2");
Scanner sc2 = new Scanner(System.in);
int valor2 = sc2.nextInt();

System.out.println("Escreva o valor 3");
Scanner sc3= new Scanner(System.in);
int valor3= sc3.nextInt();

    int soma= 0;

  if (valor1 > valor2 && valor2 > valor3) {
    soma= valor1 + valor2;
    System.out.println("Essa é a soma dos dois maiores: " + soma);
  } else if (valor2 > valor1 && valor1 > valor3) {
    soma= valor2 + valor1;
    System.out.println("Essa é a soma dos dois maiores: " + soma);
  } else if (valor2 > valor3 && valor3 > valor1) {
    soma= valor2 + valor3;
    System.out.println("Essa é a soma dos dois maiores: " + soma);
  } else if (valor3 > valor2 && valor2 > valor1){
    soma= valor3 + valor2;
    System.out.println("Essa é a soma dos dois maiores: " + soma);
  } else if (valor3 > valor1 && valor1 > valor2) {
    soma= valor3 + valor1;
    System.out.println("Essa é a soma dos dois maiores: " + soma);
  }  else {
    soma= valor1 + valor3;
   System.out.println("Essa é a soma dos dois maiores: " + soma);
  
  }
}
} */
 






// Exercício 8: Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 


//  System.out.println("Escreva o valor 1");
// Scanner scan = new Scanner(System.in);
// int numero1= scan.nextInt();

// System.out.println("Escreva o valor 2");
// int numero2 = scan.nextInt();

// while(numero2 <= 0){
//   System.out.println("Você informou um número que não é aceito, por favor, informe um valor novamente");
// System.out.println("Escreva o valor novamente");
// numero2 = scan.nextInt();
// }
//   int divisão= numero1 / numero2;
//   System.out.println("Esse é o resultado do valor 1 dividido pelo valor 2: " + divisão ); 

//   }
// } 