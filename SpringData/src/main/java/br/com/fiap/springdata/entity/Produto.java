package br.com.fiap.springdata.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "produto", sequenceName = "SQ_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(generator = "produto", strategy = GenerationType.SEQUENCE)
    private int codigo;

    private String nome;

    private double preco;

    private boolean novo;

    private LocalDate dataFabricacao;

    public Produto() {
    }

    public Produto(int codigo, String nome, double preco, boolean novo, LocalDate dataFabricacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.novo = novo;
        this.dataFabricacao = dataFabricacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
