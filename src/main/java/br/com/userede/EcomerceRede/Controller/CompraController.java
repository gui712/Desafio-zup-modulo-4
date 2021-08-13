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
    public void cadastrarCompra(@RequestBody CompraDto compraDto)throws Exception{
        compraService.dadosCompra(compraDto);
        compraService.dadosProduto(compraDto);
        compraService.cadastrarCompraClientes(compraDto);

    }

    @GetMapping
    public List<CompraDto> mostrarCompras(){
        return compraService.mostrarCompra();
    }


}
