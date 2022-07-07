package com.apiregistro2022.services.impl;

import com.apiregistro2022.entity.Cliente;
import com.apiregistro2022.repository.ClienteRepository;
import com.apiregistro2022.services.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PNSF
 */

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findALL() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public List<Cliente> findByName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente add(Cliente m) {
        return clienteRepository.save(m);
    }

    @Override
    public Cliente update(Cliente m) {
        Cliente objCliente = clienteRepository.getById(m.getCodigo());
        BeanUtils.copyProperties(m, objCliente);
        return clienteRepository.save(objCliente);
    }

    @Override
    public Cliente delete(Cliente m) {
        Cliente objCliente = clienteRepository.getById(m.getCodigo());
        objCliente.setEstado(false);
        return clienteRepository.save(objCliente);
    }
    
    
}
