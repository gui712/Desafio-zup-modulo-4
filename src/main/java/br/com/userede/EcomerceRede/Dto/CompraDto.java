package br.com.userede.EcomerceRede.Dto;

import java.util.List;

public class CompraDto {
    private ClienteDto clienteDto;
    private List<ProdutoDto> produtosComprados;


    public CompraDto (){}

    public ClienteDto getClienteDto() {
        return clienteDto;
    }

    public void setClienteDto(ClienteDto clienteDto) {
        this.clienteDto = clienteDto;
    }

    public List<ProdutoDto> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(List<ProdutoDto> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

}
