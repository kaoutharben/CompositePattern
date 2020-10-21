package com.company;


public class Fichier extends Element  {
    String nom;
    int taille;
    Fichier(String nom,int taille){
        this.taille=taille;
        this.nom=nom;

    }
    public String getNom() {
        return nom;
    }
    public int getTaille(){
        return taille;
    }
    public void show(){
        System.out.println(
          "Fichier : "+this.getNom()+" Taille : "+this.getTaille()

        );

    }


}
