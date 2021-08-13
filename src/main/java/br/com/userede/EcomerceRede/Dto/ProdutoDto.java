package br.com.userede.EcomerceRede.Dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDto {
    @NotEmpty(message = "Nome não pode estar vazio")
    @NotNull(message = "Nome do produto não pode ser nulo")
    @Size(min = 3, message = "Minimo 3 caracteres para o produto")
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoDto() {
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
