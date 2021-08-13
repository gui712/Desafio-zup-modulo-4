package br.com.userede.EcomerceRede.Controller;

import br.com.userede.EcomerceRede.Dto.ClienteDto;
import br.com.userede.EcomerceRede.Dto.CompraDto;
import br.com.userede.EcomerceRede.Dto.ProdutoDto;
import br.com.userede.EcomerceRede.Service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @PostMapping
    public ClienteDto compra(@RequestBody String cpf, ProdutoDto produtoDto)throws RuntimeException{
        return compraService.novaCompra(cpf, produtoDto);
    }

    @GetMapping
    public List<CompraDto> buscarCompra(){
        return compraService.mostrarCompras() ;
    }

}
