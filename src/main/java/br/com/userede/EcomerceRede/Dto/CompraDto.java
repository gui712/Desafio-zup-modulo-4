package br.com.userede.EcomerceRede.Dto;

import java.util.ArrayList;
import java.util.List;

public class CompraDto {
    private ClienteDto cliente ;
    private List<ProdutoDto> produtosDocliente = new ArrayList<>();

    public CompraDto() {
    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoDto> getProdutosDocliente() {
        return produtosDocliente;
    }

    public void setProdutosDocliente(List<ProdutoDto> produtosDocliente) {
        this.produtosDocliente = produtosDocliente;
    }
}
