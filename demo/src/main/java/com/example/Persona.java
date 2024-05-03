package com.example;

public class Persona extends Thread {
    private Gioconda g;

    public Persona(Gioconda g, String nome){
        super(nome);
        this.g=g;
    }

    public Gioconda getG() {
        return g;
    }

    public void setG(Gioconda g) {
        this.g = g;
    }


    public void run(){
        String nome=this.currentThread().getName();
        
        try{
            g.entra();
            int attesa= 2000+(int)(Math.random()*3000);
            System.out.println(nome+ " occupa il museo per: "+ ((attesa/1000)+ "secondi"));
            Thread.sleep(attesa);
            g.esci();

        }
        catch(InterruptedException i){
            i.printStackTrace();
        }

    }
}
