package com.elmernissi.myrestufinder.model;

public class Magasin {
    String nameMagasin;
    String adresseMagasin;
    int numberPhone;

    public Magasin(String nameMagasin,String adresseMagasin,int numberPhone){
        this.nameMagasin=nameMagasin;
        this.adresseMagasin=adresseMagasin;
        this.numberPhone=numberPhone;
    }

    public String getNameMagasin() {
        return nameMagasin;
    }

    public String getAdresseMagasin() {
        return adresseMagasin;
    }

    public int getNumberPhone() {
        return numberPhone;
    }
}
