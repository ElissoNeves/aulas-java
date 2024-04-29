package Métodos;

public class SmartTv {
    boolean ligada = false;
    double canal = 14.1;
    int volume = 15;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        //volume = volume + 1
        volume++;
    }
    public void diminuirVolume(){
        //volume = volume - 1
        volume--;
    }

    public void mudarCanal(double novoCanal){
        canal = novoCanal;
    }
    public void mudarCanalPraMais(){
        //canal = canal + 1
        canal++;
    }

    public void mudarCanalPraMenos(){
        //canal = canal - 1
        canal--;
    }





}
