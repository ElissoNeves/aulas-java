package Métodos;

public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    
        smartTv.ligar ();
        System.out.println("Novo Status: A Tv está ligada?" + smartTv.ligada);
    
        smartTv.desligar ();
        System.out.println("Novo Status: A Tv está ligada?" + smartTv.ligada);
    
        smartTv.aumentarVolume ();
        smartTv.aumentarVolume ();
        smartTv.aumentarVolume ();
        smartTv.aumentarVolume ();
        smartTv.diminuirVolume ();
        System.out.println("Volume atual: " + smartTv.volume);
    
        //smartTv.mudarCanalPraMais ();
        //smartTv.mudarCanalPraMais ();
        //smartTv.mudarCanalPraMais ();
        //smartTv.mudarCanalPraMais ();
        //smartTv.mudarCanalPraMenos ();
        System.out.println("Canal atual: " + smartTv.canal);
    
        smartTv.mudarCanal (2.1);

        System.out.println("Canal atual: " + smartTv.canal);
    }
}
