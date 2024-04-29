package Operadores;
public class Operadores {
    public static void main(String[] args) {
        // O operador de igualdade ( = ) funciona como atribuição, se utilizar dois ( == ) funciona como igualdade

        // O operador ( + ) também pode ser usado para concatenar/juntar duas palavras.
        // Para numero serve como operador de soma, mas para texto serve unir as palavras
        //Exemplo, operador soma( + )
        double soma = 10 + 10;
            System.out.println(soma);

        //Exemplo do operador soma( + ) sendo usado para concatenar.
        String meuNome = "Elisson";
        int idade = 31;
            System.out.println("Eu me chamo " + meuNome + " e tenho " + idade + " anos.");

        int subtracao = 10 - 5;
            System.out.println(subtracao);

        int multiplicacao = 5 * 10;
            System.out.println(multiplicacao);

        int divisao = 100 / 5;
            System.out.println(divisao);
        
        int modulo = 18 % 3;
            System.out.println(modulo);

        double resultado = (10 * 7) + (20 / 5) - 2;
            System.out.println(resultado);

        //Operadores relacionais: ==(igual), >(maior), >=(maior ou igual), <(menor), <=(menor ou igual), !=(diferente)
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
            System.out.println(simNao);

            simNao = numero1 != numero2;
            System.out.println(simNao);

            simNao = numero1 < numero2;
            System.out.println(simNao);

            simNao = numero1 <= numero2;
            System.out.println(simNao);

            simNao = numero1 > numero2;
            System.out.println(simNao);

            simNao = numero1 >= numero2;
            System.out.println(simNao);
    
        boolean condicao1 = true;
        boolean condicao2 = true;

        // Operador lógicos &&(operador lógico " E "), ||( operador lógico " OU ")
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
    
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeiras");
        }

        System.out.println("Fim");
    }
}
