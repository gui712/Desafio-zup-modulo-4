package br.com.userede.EcomerceRede.Service;

import br.com.userede.EcomerceRede.Dto.ClienteDto;
import br.com.userede.EcomerceRede.Dto.ProdutoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<ProdutoDto> produtos = new ArrayList<>();

    public void adicionarProtudoNaLista(ProdutoDto produtoDto){
        verficarProdutoDuplicado(produtoDto.getNome());
        produtos.add(produtoDto);
    }

    public void verficarProdutoDuplicado (String nome){
        for(ProdutoDto produto:produtos){
            if(produto.getNome().equals(nome)){
                throw new RuntimeException ("Produto já cadastrado, por favor cadastre um novo produto");
            }
        }

    }

    public List<ProdutoDto> mostrarProdutos() {
        return produtos;
    }

    public ProdutoDto pesquisarProduto(String nome){
        for(ProdutoDto produto: produtos){
            if(produto.getNome().equals(nome)){
                return produto;
            }
        }
        throw new RuntimeException("Produto Não encontrado");
    }
}
