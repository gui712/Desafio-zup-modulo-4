package br.com.userede.EcomerceRede.Service;

import br.com.userede.EcomerceRede.Dto.ClienteDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<ClienteDto> clientes = new ArrayList<>();
    public void adicionarClienteNaLista(ClienteDto clienteDto){
        verificarClienteDuplicado(clienteDto.getEmail(),clienteDto.getCpf());
        clientes.add(clienteDto);
    }

    public void verificarClienteDuplicado(String email, String cpf){
        for(ClienteDto cliente: clientes){
            if(cliente.getCpf().equals(cpf)){
                throw new RuntimeException("Cliente já cadastrado no sistema");
            }else if(cliente.getEmail().equals(email)){
                throw new RuntimeException("Cliente já cadastrado no sistema");
            }
        }
    }
    public List<ClienteDto> mostrarCliente(){
        return clientes;

    }

    public ClienteDto pesquisarClienteCpf(String cpf){
        for(ClienteDto cliente:clientes){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        throw new RuntimeException("Cliente não encontrado");
    }

}
