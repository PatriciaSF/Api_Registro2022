package com.apiregistro2022.services;

import com.apiregistro2022.entity.Cliente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author PNSF
 */
public interface ClienteService {
    
    List<Cliente> findALL();
    
    List<Cliente> findAllCustom();
    
    List<Cliente> findByName();
    
    Optional<Cliente> findById(Long id);
    
    Cliente add(Cliente m);
    
    Cliente update(Cliente m);
    
    Cliente delete(Cliente m);
    
}
