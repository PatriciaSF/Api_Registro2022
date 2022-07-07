package com.apiregistro2022.restcontroller;

import com.apiregistro2022.entity.Cliente;
import com.apiregistro2022.services.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PNSF
 */

@RestController

@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findALL();
    }
    
    @GetMapping("/custom")
    public List<Cliente> findAllCustom(){
        return clienteService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id){
        return clienteService.findById(id);
    }
    
    @PostMapping
    public Cliente add(@RequestBody Cliente m){
        return clienteService.add(m);
    }
    
    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente m){
        m.setCodigo(id);
        return clienteService.update(m);
    }
    
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable Long id){
        Cliente objCliente = new Cliente();
        objCliente.setCodigo(id);
        return clienteService.delete(Cliente.builder().codigo(id).build());
    }
}
