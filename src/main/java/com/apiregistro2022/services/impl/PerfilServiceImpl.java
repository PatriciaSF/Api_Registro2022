package com.apiregistro2022.services.impl;

import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.repository.PerfilRepository;
import com.apiregistro2022.services.PerfilService;
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
public class PerfilServiceImpl implements PerfilService{
    
    @Autowired
    private PerfilRepository perfilReposity;

    @Override
    public List<Perfil> findALL() {
        return perfilReposity.findAll();
    }

    @Override
    public List<Perfil> findAllCustom() {
        return perfilReposity.findAllCustom();
    }

    @Override
    public List<Perfil> findByName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Perfil> findById(Long id) {
        return perfilReposity.findById(id);
    }

    @Override
    public Perfil add(Perfil u) {
        return perfilReposity.save(u);
    }

    @Override
    public Perfil update(Perfil u) {
        Perfil objPerfil = perfilReposity.getById(u.getCodigo());
        BeanUtils.copyProperties(u, objPerfil);
        return perfilReposity.save(objPerfil);
    }

    @Override
    public Perfil delete(Perfil u) {
        Perfil objPerfil = perfilReposity.getById(u.getCodigo());
        objPerfil.setEstado(false);
        return perfilReposity.save(objPerfil);
    }
    
    
}
