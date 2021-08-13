package br.com.userede.EcomerceRede.Dto;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class ClienteDto {
    @NotEmpty(message = "Nome não pode estar vazio")
    @NotNull(message = "Nome não pode ser nulo")
    @Size(min = 2, message = "Quantidade minima de caracteres")
    private String nome;
    @CPF(message = "CPF cadastrado invalido")
    private String cpf;
    @Email(message = "E-mail invalido")
    private String email;
    private List<ProdutoDto> listaProdutos = new ArrayList<>();

    public ClienteDto() {
    }

    public List<ProdutoDto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<ProdutoDto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
