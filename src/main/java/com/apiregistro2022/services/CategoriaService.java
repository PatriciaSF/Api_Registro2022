package com.apiregistro2022.services;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    
    //mostrar todo
   List<Categoria> findALL(); 
   
   //no viene por defecto en spring
   //mostrar todos los habilitados
   List<Categoria> findAllCustom();
   
   //no viene por defecto en spring
   //buscar por nombre
   List<Categoria> findbyName();
   
   //buscar por codigo
   Optional<Categoria> findbyId(Long id);
   
   //agregar
   Categoria add(Categoria c);
   
   //actualizar
   Categoria update(Categoria c);
   
   //eliminar
   Categoria delete(Categoria c);
}
