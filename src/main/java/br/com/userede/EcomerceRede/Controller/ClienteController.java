package br.com.userede.EcomerceRede.Controller;

import br.com.userede.EcomerceRede.Dto.ClienteDto;
import br.com.userede.EcomerceRede.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @PostMapping
    public void cadastrarCliente(@RequestBody ClienteDto cliente){
        clienteService.adicionarClienteNaLista(cliente);
    }
    @GetMapping
    public List<ClienteDto> mostrarClientes(){
        return clienteService.mostrarCliente();
    }
    @GetMapping("/buscacpf")
    public ClienteDto buscaClientePorCpf(@RequestParam String cpf){
        return clienteService.pesquisarClienteCpf(cpf);
    }

}
