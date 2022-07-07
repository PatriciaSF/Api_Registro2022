package com.apiregistro2022.services.impl;

import com.apiregistro2022.entity.Empleado;
import com.apiregistro2022.repository.EmpleadoRepository;
import com.apiregistro2022.services.EmpleadoService;
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
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Autowired
    private EmpleadoRepository empleadorepository;

    @Override
    public List<Empleado> findALL() {
        return empleadorepository.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return empleadorepository.findAllCustom();
    }

    @Override
    public List<Empleado> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Empleado> findbyId(Long id) {
        return empleadorepository.findById(id);
    }

    @Override
    public Empleado add(Empleado e) {
        return empleadorepository.save(e);
    }

    @Override
    public Empleado update(Empleado e) {
        Empleado objEmpleado = empleadorepository.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objEmpleado);
        return empleadorepository.save(objEmpleado);
    }

    @Override
    public Empleado delete(Empleado e) {
        Empleado objEmpleado = empleadorepository.getById(e.getCodigo());
        objEmpleado.setEstado(false);
        return empleadorepository.save(objEmpleado);
    }
    
    
}
