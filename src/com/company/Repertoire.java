package com.company;

import java.util.ArrayList;

public class Repertoire extends Element {
    String nom;
    ArrayList<Element> elements;
   Repertoire(String nom){
        this.nom=nom;
    }
    public void add(Element element){
       elements.add(element);
    }
    public void remove(Element element){
       elements.remove(element);
    }
    public Element getElement(int i ){
       return elements.get(i);
    }
    public String getNom(){
       return nom;
    }
    public int getTaille(){
       int taille=0;
        for (Element e:elements) {
            taille+=e.getTaille();
        }

        return taille;
    }
    public void show(){
       System.out.println("Repertoir : "+this.getNom()+" Taille: "+this.getTaille());
        for (Element e : elements
             ) {
            e.show();

        }
    }
}
