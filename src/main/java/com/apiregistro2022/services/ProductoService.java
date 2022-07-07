package com.apiregistro2022.services;

import com.apiregistro2022.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> findALL();

    List<Producto> findAllCustom();

    List<Producto> findbyName();

    Optional<Producto> findbyId(Long id);

    Producto add(Producto p);

    Producto update(Producto p);

    Producto delete(Producto p);
}
