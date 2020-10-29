package com.company;

public class Raccourci extends Element {
    Element cible;
    Raccourci(Element cible){
        this.cible=cible;
    }

    @Override
    public void add(Element element) {
        cible.add(element);
    }

    @Override
    public Element getElement(int i) {
        return cible.getElement(i);
    }

    @Override
    public void remove(Element element) {
        cible.remove(element);
    }
    public String getNom(){
       return cible.getNom();
    }
    public int getTaille(){
        return(2);
    }
    public void show(){
        cible.show();
    }
}
