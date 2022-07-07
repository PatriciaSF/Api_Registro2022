package com.apiregistro2022.services;

import com.apiregistro2022.entity.Empleado;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author PNSF
 */
public interface EmpleadoService {
    
    List<Empleado> findALL();

    List<Empleado> findAllCustom();

    List<Empleado> findbyName();

    Optional<Empleado> findbyId(Long id);

    Empleado add(Empleado e);

    Empleado update(Empleado e);

    Empleado delete(Empleado e);
}
