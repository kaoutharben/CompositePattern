package com.company;

import java.util.ArrayList;

public class Repertoire extends DisqueDur {
    String nom;
    ArrayList<DisqueDur> disqueDurs;
   Repertoire(String nom){
        this.nom=nom;
    }
    public void add(DisqueDur disqueDur){
       disqueDurs.add(disqueDur);
    }
    public void remove(DisqueDur disqueDur){
       disqueDurs.remove(disqueDur);
    }
    public DisqueDur getElement(int i ){
       return disqueDurs.get(i);
    }
    public String getNom(){
       return nom;
    }
    public int getTaille(){
       int taille=0;
        for (DisqueDur e:disqueDurs) {
            taille+=e.getTaille();
        }

        return taille;
    }
    public void show(){
       System.out.println("Repertoir : "+this.getNom()+" Taille: "+this.getTaille());
        for (DisqueDur e : disqueDurs
             ) {
            e.show();

        }
    }
}
