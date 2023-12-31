package com.example.appgr10;
import java.util.ArrayList;

public class Succursale {
    private String nomSuc="";

    private String adresseSuc="";

    private ArrayList<String> joursOuvrables;

    private String heuresO ="", heuresF="";

    public Succursale(String nomSuc, String adresseSuc, ArrayList joursOuvrables, String[] heures) {

        this.nomSuc = nomSuc;

        this.adresseSuc = adresseSuc;


        this.joursOuvrables = joursOuvrables;

        this.heuresO = heures[0];
        this.heuresF = heures[1];
    }

    public Succursale() {

    }
    public String getNomSuc() {
        return nomSuc;
    }

    public void setNomSuc(String nomSuc) {
        this.nomSuc = nomSuc;
    }

    public String getAdresseSuc() {
        return adresseSuc;
    }

    public void setAdresseSuc(String adresseSuc) {
        this.adresseSuc = adresseSuc;
    }

    public ArrayList<String> getJoursOuvrables() {
        return joursOuvrables;
    }

    public void setJoursOuvrables(ArrayList<String> joursOuvrables) {
        this.joursOuvrables = joursOuvrables;
    }

    public String getHeuresO() {return heuresO;
    }

    public void setHeuresO(String heuresO) {
        this.heuresO = heuresO;
    }

    public String getHeuresF() {
        return heuresF;
    }

    public void setHeuresF(String heuresF) {
        this.heuresF = heuresF;
    }

    @Override
    public String toString() {
        return "Nom succursale : " + nomSuc +
                "\nAdresseSuc : " + adresseSuc +
                "\nJours d'ouvertures : " +(joursOuvrables == null ? "" : joursOuvrables.toString())+
                "\nheures ouvertures : " + heuresO +
                "\nheures fermetures : " + heuresF;
    }
}

