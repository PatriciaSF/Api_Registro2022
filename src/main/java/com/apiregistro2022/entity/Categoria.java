package com.apiregistro2022.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

//definiendo la entidad en spring
@Entity(name="Categoria")

//deifiniendo la tabla de la base de datos
@Table(name="t_categoria")

//Para que sea una clase de spring se tiene que serializar
@Builder
public class Categoria implements Serializable{
    
    //Agregamos el id de la serializacion
    private static final long serialVersion=1L;
    //definiendo clave primaria
    @Id
    //definiendo columna
    @Column(name="codcat")
    private long codigo;
    @Column(name="nomcat")
    private String nombre;
    @Column(name="estcat")
    private boolean estado;

    public Categoria() {
    }

    public Categoria(long codigo, String nombre, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
