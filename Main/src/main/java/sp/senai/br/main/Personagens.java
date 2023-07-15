/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

/**
 *
 * @author aluno
 */
public class Personagens {
    
    private String nome;
    private double pv;
    private double pm;
    private double ps;
    private double força;
    private double energia;
    private double agilidade;
    private double vitalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAtributos(double vida, double mana, double força, double stamina, double energia, double agilidade, double vitalidade){
        this.pv = vida;
        this.pm = mana;
        this.força = força;
        this.ps = stamina;
        this.energia = energia;
        this.agilidade = agilidade;
        this.vitalidade = vitalidade; 
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }

    public double getPm() {
        return pm;
    }

    public void setPm(double pm) {
        this.pm = pm;
    }

    public double getPs() {
        return ps;
    }

    public void setPs(double ps) {
        this.ps = ps;
    }

    public double getForça() {
        return força;
    }

    public void setForça(double força) {
        this.força = força;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(double agilidade) {
        this.agilidade = agilidade;
    }

    public double getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(double vitalidade) {
        this.vitalidade = vitalidade;
    }
    
    public void consumirMana(double mana){
        this.pm -= mana;
    }
    
    public void consumirStamina(double stamina){
        this.ps -= stamina;
    }
    
    public void sofrerDanoFisico(double dano){
        this.pv -= dano;
    }
    
    public void sofrerDanoMagico(double dano){
        this.pv -= dano;
    }
    
}
