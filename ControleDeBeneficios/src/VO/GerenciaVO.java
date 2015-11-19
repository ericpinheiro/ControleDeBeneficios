package VO;

import RN.GerenciaRN;

/**
 * @author Eric
 * @authorAndressa
 * @author Jean_H_xD
 */
public class GerenciaVO {

    private GerenciaRN gerenciaRN;
    private int cod;
    private String nome;
    private double salario;

    public GerenciaVO(int cod, String nome, double salario) {
        this.cod = cod;
        this.nome = nome;
        this.salario = salario;
    }

    public GerenciaVO() {
        this.cod = -1;
        this.nome = null;
        this.salario = 0.0;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
