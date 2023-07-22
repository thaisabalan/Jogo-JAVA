/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

/**
 *
 * @author aluno
 */
public class Classe {
    
    public String nome;
    public double pv;
    public double pm;
    public double ps;
    public double força;
    public double energia;
    public double agilidade;
    public double vitalidade;
    
    public static Classe Mago(){
        
        Classe classePersonagem = new Classe();
        
        classePersonagem.nome = "Mago";
        classePersonagem.pv = 100.00;
        classePersonagem.pm = 350.00;
        classePersonagem.ps = 50.00;
        classePersonagem.força = 10.00;
        classePersonagem.energia = 250.00;
        classePersonagem.agilidade = 30.00;
        classePersonagem.vitalidade = 20.00;
        
        return classePersonagem;
    }
    
    public static Classe Duelista(){
        
        Classe classeDuelista = new Classe();
        
        classeDuelista.nome = "Duelista";
        classeDuelista.pv = 100.00;
        classeDuelista.pm = 350.00;
        classeDuelista.ps = 50.00;
        classeDuelista.força = 10.00;
        classeDuelista.energia = 250.00;
        classeDuelista.agilidade = 30.00;
        classeDuelista.vitalidade = 20.00;
        
        return classeDuelista;
    }
    
     public static Classe Iron(){
        
        Classe classeIron = new Classe();
        
        classeIron.nome = "Iron";
        classeIron.pv = 100.00;
        classeIron.pm = 350.00;
        classeIron.ps = 50.00;
        classeIron.força = 10.00;
        classeIron.energia = 250.00;
        classeIron.agilidade = 30.00;
        classeIron.vitalidade = 20.00;
        
        return classeIron;
    }
     
      public static Classe Faker(){
        
        Classe classeFaker = new Classe();
        
        classeFaker.nome = "Faker";
        classeFaker.pv = 100.00;
        classeFaker.pm = 350.00;
        classeFaker.ps = 50.00;
        classeFaker.força = 10.00;
        classeFaker.energia = 250.00;
        classeFaker.agilidade = 30.00;
        classeFaker.vitalidade = 20.00;
        
        return classeFaker;
    }
}
