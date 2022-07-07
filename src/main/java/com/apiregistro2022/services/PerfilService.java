package com.apiregistro2022.services;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author PNSF
 */
public interface PerfilService {
    
    List<Perfil> findALL();
    
    List<Perfil> findAllCustom();
    
    List<Perfil> findByName();
    
    Optional<Perfil> findById(Long id);
    
    Perfil add(Perfil u);
    
    Perfil update(Perfil u);
    
    Perfil delete(Perfil u);
    
}
