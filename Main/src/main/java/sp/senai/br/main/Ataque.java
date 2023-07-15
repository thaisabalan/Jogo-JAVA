/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

/**
 *
 * @author aluno
 */
public class Ataque {
    
    private String nome;
    private double dm;
    private double df;
    private double rm;
    private double rs;
    
    public void setAtributos(double requisitoMana, double requisitoStamina, double danoMagico, double danoFisico){
        this.rm = requisitoMana;
        this.rs = requisitoStamina;
        this.dm = danoMagico;
        this.df = danoFisico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDm() {
        return dm;
    }

    public void setDm(double dm) {
        this.dm = dm;
    }

    public double getDf() {
        return df;
    }

    public void setDf(double df) {
        this.df = df;
    }

    public double getRm() {
        return rm;
    }

    public void setRm(double rm) {
        this.rm = rm;
    }

    public double getRs() {
        return rs;
    }

    public void setRs(double rs) {
        this.rs = rs;
    }
    
}
