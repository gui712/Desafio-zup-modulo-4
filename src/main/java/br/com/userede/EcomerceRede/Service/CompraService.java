package br.com.userede.EcomerceRede.Service;

import br.com.userede.EcomerceRede.Dto.ClienteDto;
import br.com.userede.EcomerceRede.Dto.CompraDto;
import br.com.userede.EcomerceRede.Dto.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {
    private List<CompraDto> compras = new ArrayList<>();
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ProdutoService produtoService;

    public List<CompraDto> cadastrarCompraClientes(CompraDto compraDto){
        this.compras.add(compraDto);
        return compras;
    }

    public CompraDto dadosCompra(CompraDto compraDto){
        ClienteDto clienteCarregado;
        clienteCarregado = clienteService.pesquisarClienteCpf(compraDto.getCliente().getCpf());
        compraDto.setCliente(clienteCarregado);
        return compraDto;
    }

    public CompraDto dadosProduto(CompraDto compraDto){
        List<ProdutoDto>produtos = new ArrayList<>();
        ProdutoDto produtoCarregado;
        for(ProdutoDto produto: compraDto.getProdutosDocliente()){
            produtoCarregado = produtoService.pesquisarProduto(produto.getNome());
            produtos.add(produtoCarregado);
        }
        compraDto.setProdutosDocliente(produtos);
        return compraDto;
    }

    public List<CompraDto> mostrarCompra(){
        return compras;
    }

}