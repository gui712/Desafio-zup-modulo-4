package br.com.userede.EcomerceRede.Service;

import br.com.userede.EcomerceRede.Dto.ClienteDto;
import br.com.userede.EcomerceRede.Dto.CompraDto;
import br.com.userede.EcomerceRede.Dto.ProdutoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {
    private List<CompraDto> compras = new ArrayList<>();
    private List<ProdutoDto> produtos = new ArrayList<>();
    private List<ClienteDto> clientes = new ArrayList<>();

    public  ClienteDto novaCompra(String cpf, ProdutoDto produtos){
        for (ClienteDto cliente: clientes){
            if(cliente.getCpf().equals(cpf)){
                cliente.getListaProdutos().add(produtos);
                return cliente;

            }
        }
        throw new RuntimeException("Cliente não encontrado");

    }

   /* public CompraDto compra (String cpf, List<ProdutoDto> produtos) {
        for (CompraDto compra : compras) {
            if (compra.getClienteDto().getCpf().equals(cpf)) {
                compra.getProdutosComprados().add((ProdutoDto) produtos);
            }
        }
        throw new RuntimeException("Cliente não encontrado");
    }*/

    public List<CompraDto> mostrarCompras(){
        return compras;
    }
}