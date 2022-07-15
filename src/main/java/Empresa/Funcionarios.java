/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author Ederson .A Silva
 */
public class Funcionarios {

    private final String nome;
    private final String sobrenome;
    private final double salario;
    private final double aumento = 0.10;
    private double aumentoDezPorCento;
    private double novoSalario;
    double resultadoAno;
    double aumentoPorcentagem;
    private int anoAtual;
    int ano;
    private double aumentoNosAnos;
  

    public Funcionarios(String nome, String sobrenome, double salario, int anoAtual) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.anoAtual = anoAtual;
    }
  
   public Funcionarios(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
   
   public void PorcentagemAnual(double salarioAtual){
       this.aumentoDezPorCento = salario;
       if(ano <= 2022){
       System.out.println(nome + " " + sobrenome +  "Seu Salario Atual é: " + salario);
       } else if(ano >= 2023){
           resultadoAno = ano - anoAtual;
           aumentoPorcentagem = resultadoAno * aumento;
           aumentoNosAnos = aumentoPorcentagem * salario;
           novoSalario = salario + aumentoNosAnos;
           
           
           System.out.println(nome + " Seu Salario no Ano de " + ano + "vai ser de : " + novoSalario);
       }
   }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public double getAumento() {
        return aumento;
    }

    public double getAumentoDezPorCento() {
        return aumentoDezPorCento;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

   
    public int getAno() {
        return ano;
    }
  public int getAnoAtual() {
        return anoAtual;
    }

  public void setAumentoDezPorCento(double aumentoDezPorCento) {
        this.aumentoDezPorCento = aumentoDezPorCento;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
     public void setAno(int ano) {
        this.ano = ano;
    }
     
  public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

   
}
    

