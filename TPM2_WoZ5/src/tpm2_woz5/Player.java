/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm2_woz5;


import java.util.ArrayList;


/**
 *
 * @author Sylvia
 */
public class Player {
    private String pseudoPlayer;
    private ArrayList<Weapon> WeaponPlayer;
    private int strenght;

    public Player(String pseudo, ArrayList<Weapon> arme, int force) {
        this.pseudoPlayer = pseudo;
        this.WeaponPlayer = arme;
        this.strenght = force;
    }

    
    public String getPseudo() {
        return pseudoPlayer;
    }

    public void setPseudo(String pseudo) {
        this.pseudoPlayer = pseudo;
    }

    public ArrayList<Weapon> getArme() {
        return WeaponPlayer;
    }

    public void setArme(ArrayList<Weapon> arme) {
        this.WeaponPlayer = arme;
    }

    public int getForce() {
        return strenght;
    }

    public void setForce(int force) {
        this.strenght = force;
    }

    
    
     
}
