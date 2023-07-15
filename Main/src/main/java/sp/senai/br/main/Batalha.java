/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

/**
 *
 * @author aluno
 */
public class Batalha {
    
    private int qtdTL;
    private int qtdTA;
    
    private Personagens personagemUm;
    private Personagens personagemDois;
    
    private int personagemUmV;
    private int personagemDoisV;
    private Ataque ataqueUm;
    private Ataque ataqueDois;
    
    public boolean emAndamento = true;

    public int getQtdTL() {
        return qtdTL;
    }

    public void setQtdTL(int qtdTL) {
        this.qtdTL = qtdTL;
    }

    public int getQtdTA() {
        return qtdTA;
    }

    public void setQtdTA(int qtdTA) {
        this.qtdTA = qtdTA;
    }

    public Personagens getPersonagemUm() {
        return personagemUm;
    }

    public void setPersonagemUm(Personagens personagemUm) {
        this.personagemUm = personagemUm;
    }

    public Personagens getPersonagemDois() {
        return personagemDois;
    }

    public void setPersonagemDois(Personagens personagemDois) {
        this.personagemDois = personagemDois;
    }

    public int getPersonagemUmV() {
        return personagemUmV;
    }

    public void setPersonagemUmV(int personagemUmV) {
        this.personagemUmV = personagemUmV;
    }

    public int getPersonagemDoisV() {
        return personagemDoisV;
    }

    public void setPersonagemDoisV(int personagemDoisV) {
        this.personagemDoisV = personagemDoisV;
    }
    
    public void ataquePersonagemUm(){
        this.personagemUm.consumirMana(ataqueUm.getRm());
        this.personagemUm.consumirStamina(ataqueUm.getRs());
        
        this.personagemDois.sofrerDanoFisico(ataqueUm.getDf());
        this.personagemDois.sofrerDanoMagico(ataqueUm.getDm());
        
        System.out.println("Personagem 1 atacou > personagem 2");
    }
    
    public void ataquePersonagemDois(){
        this.personagemDois.consumirMana(ataqueUm.getRm());
        this.personagemDois.consumirStamina(ataqueUm.getRs());
        
        this.personagemUm.sofrerDanoFisico(ataqueUm.getDf());
        this.personagemUm.sofrerDanoMagico(ataqueUm.getDm());
        
        System.out.println("Personagem 2 atacou > personagem 1");

    }

    public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }
    
    
    
}
