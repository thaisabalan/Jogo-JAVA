/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args){
        
        Personagens personagemUm = new Personagens();
        Personagens personagemDois = new Personagens();
        
        Batalha ultimateBattle = new Batalha();
        
        Ataque ataqueUm = new Ataque();
        Ataque ataqueDois = new Ataque();
        
        personagemUm.setNome("P1");
        personagemUm.setAtributos(150.00, 150.00, 200.00, 150.00, 300.00, 80.00, 250.00);
        personagemDois.setNome("P2");
        personagemDois.setAtributos(100.00, 100.00, 95.00, 100.00, 400.00, 350.00, 250.00);
        
        ataqueUm.setAtributos(20.00, 1.00, 5.00, 0.00);
        ataqueDois.setAtributos(25.00, 5.00, 5.00, 0.00);
        
        ultimateBattle.setPersonagemUm(personagemUm);
        ultimateBattle.setPersonagemDois(personagemDois);
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
