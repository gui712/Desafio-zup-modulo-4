package br.com.userede.EcomerceRede.Controller;

import br.com.userede.EcomerceRede.Dto.ProdutoDto;
import br.com.userede.EcomerceRede.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @PostMapping
    public void cadastrarProduto(@RequestBody ProdutoDto produtoDto){
        produtoService.adicionarProtudoNaLista(produtoDto);
    }
    @GetMapping
    public List<ProdutoDto> mostrarProduto(){
    return produtoService.mostrarProdutos();
    }
}
