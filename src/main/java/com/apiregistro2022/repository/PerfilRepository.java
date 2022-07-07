package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author PNSF
 */
public interface PerfilRepository extends JpaRepository<Perfil, Long>{
    
    @Query("select u from Perfil u where u.estado = '1'")
    List<Perfil> findAllCustom();
}
