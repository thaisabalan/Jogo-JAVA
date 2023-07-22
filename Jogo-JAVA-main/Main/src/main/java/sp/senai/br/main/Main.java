/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

import java.util.Scanner;
/**
 *
 * @author aluno
 */

public class Main {
    
    public Scanner lerTeclado = new Scanner(System.in);
    
    public static void main(String[] args){
        
        Personagens personagemUm = new Personagens();
        Personagens personagemDois = new Personagens();
        
        Batalha ultimateBattle = new Batalha();
        
        Ataque ataqueUm = new Ataque();
        Ataque ataqueDois = new Ataque();
        
        ataqueUm.setAtributos(5.00, 1.00, 5.00, 0.00);
        ataqueDois.setAtributos(5.00, 1.00, 3.00, 0.00);
        
        ultimateBattle.setPersonagemUm(personagemUm);
        ultimateBattle.setPersonagemDois(personagemDois);
        
        ultimateBattle.setNomes();
        ultimateBattle.setClasses();
        
        ultimateBattle.setAtaqueUm(ataqueUm);
        ultimateBattle.setAtaqueDois(ataqueDois);
        
        while(ultimateBattle.emAndamento == true){
            
            ultimateBattle.ataquePersonagemUm();
            
            if(ultimateBattle.getPersonagemDois().getPv() == 0.00 || ultimateBattle.getPersonagemUm().getPv() == 0.00){
                ultimateBattle.emAndamento = false;
            }
            
            ultimateBattle.ataquePersonagemDois();
            
            if(ultimateBattle.getPersonagemDois().getPv() == 0.00 || ultimateBattle.getPersonagemUm().getPv() == 0.00){
                ultimateBattle.emAndamento = false;
            }
        }
        
        System.out.printf("Vida P1: %f", ultimateBattle.getPersonagemUm().getPv());
        System.out.printf("Vida P2: %f", ultimateBattle.getPersonagemDois().getPv());
    }
    
}
