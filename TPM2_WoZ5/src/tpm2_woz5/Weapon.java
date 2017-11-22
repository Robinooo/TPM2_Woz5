/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm2_woz5;

/**
 *
 * @author Clara
 */
public class Weapon {
    public String nom;
    public int degats;

    public Weapon(String nom, int degats) {
        this.nom = nom;
        this.degats = degats;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

}
