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
    
    public Scanner lerTeclado = new Scanner(System.in);

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
        
        System.out.printf("%s atacou > %s \n", this.personagemUm.getNome(), this.personagemDois.getNome());
    }
    
    public void ataquePersonagemDois(){
        this.personagemDois.consumirMana(ataqueUm.getRm());
        this.personagemDois.consumirStamina(ataqueUm.getRs());
        
        this.personagemUm.sofrerDanoFisico(ataqueUm.getDf());
        this.personagemUm.sofrerDanoMagico(ataqueUm.getDm());
        
        System.out.printf("%s atacou > %s \n", this.personagemDois.getNome(), this.personagemUm.getNome());

    }

    public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }
    
    public void setNomes(){
        
        System.out.println("Digite o nome do personagem 1:");
        
        String nome = lerTeclado.next();
        
        this.personagemUm.setNome(nome);
        
        System.out.println("Digite o nome dp personagem 2:");
        
        nome = lerTeclado.next();
        
        this.personagemDois.setNome(nome);
        
    }
    
    public void setClasses(){
        System.out.println("Por favor selecione a classe do personagem 1:");
        System.out.println("[1] Mago | [2] Duelista | [3] Iron | [4] Faker");
        
        int classe = lerTeclado.nextInt();
        
        if(classe == 1){
            this.personagemUm.setClasse(Classe.Mago());
        }
         if(classe == 2){
            this.personagemUm.setClasse(Classe.Duelista());
        }
          if(classe == 3){
            this.personagemUm.setClasse(Classe.Iron());
        }
           if(classe == 4){
            this.personagemUm.setClasse(Classe.Faker());
        }
        System.out.printf("Classe: %s Vida: %f", this.personagemUm.getClasse().nome, this.personagemUm.getClasse().pv);
        
        lerTeclado.nextLine();
                
        System.out.println("Por favor selecione a classe do personagem 2:");
        System.out.println("[1] Mago | [2] Duelista | [3] Iron | [4] Faker");
        
        classe = lerTeclado.nextInt();
        
        if(classe == 1){
            this.personagemDois.setClasse(Classe.Mago());
        }
         if(classe == 2){
            this.personagemDois.setClasse(Classe.Duelista());
        }
          if(classe == 3){
            this.personagemDois.setClasse(Classe.Iron());
        }
           if(classe == 4){
            this.personagemDois.setClasse(Classe.Faker());
        }
        System.out.printf("Classe: %s Vida: %f", this.personagemDois.getClasse().nome, this.personagemDois.getClasse().pv);
        
    }
    
    
    
}
