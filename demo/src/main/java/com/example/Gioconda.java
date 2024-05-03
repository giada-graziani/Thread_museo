package com.example;

public class Gioconda {
    private int contaTuristi=0;

    public synchronized void entra(){
        String nome= Thread.currentThread().getName();

        //se entra il theread conta++

        try{
            while(contaTuristi>4){
                System.out.println(nome+" è in attesa di entrare");
                wait();
            }

            //entra
            contaTuristi++;
            System.out.println(nome+" è entrato nel museo"); 
        }
        catch( InterruptedException e){

        }
    }

    public synchronized void esci(){
        String nome= Thread.currentThread().getName();
        System.out.println(nome+ " è uscito dal museo");
        contaTuristi--;
        notify();
    }
}
