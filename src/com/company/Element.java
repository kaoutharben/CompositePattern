package com.company;

public abstract class Element {
    public void add(Element element){
        throw new UnsupportedOperationException();
    }
    public void remove(Element element){
        throw new UnsupportedOperationException();
    }
    public Element getElement(int i ){
        throw new UnsupportedOperationException();
    }


    int getTaille() {
        throw new UnsupportedOperationException();
    }

    String getNom() {
        throw new UnsupportedOperationException();

    }

    void show() {
        throw new UnsupportedOperationException();
    }
}
