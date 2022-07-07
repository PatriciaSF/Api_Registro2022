package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    //creamos una funcion para mostrar todas las categorias habilitadas
    //Categoria --> Entidad --> Tabla
    //estado --> atributo de entidad --> escat de la tabla --> es un bit --> por lo tanto el 1 es para las habilitadas y 
    //el 0 para laas deshabilitadas 
    @Query("select c from Categoria c where c.estado = '1'")
    List<Categoria> findAllCustom();
    
    @Query("select c from Categoria c where upper(c.nombre) like upper(:nombre) and c.estado='1'")
    List<Categoria> findbyName(@Param("nombre") String nombre);
}
