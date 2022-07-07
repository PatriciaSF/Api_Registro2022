package com.apiregistro2022.services;

import com.apiregistro2022.entity.Distrito;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author PNSF
 */
public interface DistritoService {
    
    List<Distrito> findALL();
    
    List<Distrito> findAllCustom();
    
    List<Distrito> findByName();
    
    Optional<Distrito> findById(Long id);
    
    Distrito add(Distrito d);
    
    Distrito update(Distrito d);
    
    Distrito delete(Distrito d);
    
}
