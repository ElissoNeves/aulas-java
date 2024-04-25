public class tiposdevariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos

        //String é o nome da variavel para representar texto
        String meuNome = "Elisson";
        System.out.println(meuNome);

        double salarioMinimo = 1500;
        System.out.println(salarioMinimo);

        //Mesmo sabendo que a variavel Short tem um valor curto, é necessário que haja a conversão
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroNormal2 = (short) numeroNormal;
        System.out.println(numeroNorma2);

        //Desta maneira o valor da variavel pode ser alterado
        int numero = 5;
        
        numero = 10;
        System.out.println(numero);

        //Colocando o "final" o valor não pode ser alterado
        final double valordePi = 3.14;
        System.out.println(valordePi);
    }
}
