package com.example;

public class Main {
    public static void main(String[] args) {
        Gioconda g1= new Gioconda();
        //String[] nomi={"M","N","B","V","C","X","Z","L","K","J","H","G","F","D","S","A","P","O","I","U"};

        for(int i =0; i<20;i++){
            Persona p= new Persona(g1,"Turista " + (i+1));
            p.start();
        }
    }
}