package com.apiregistro2022.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//utilizamos Loombok
@Builder //construccion
@NoArgsConstructor //constructor sin parametros
@AllArgsConstructor //constructor con parametros
@Data //metodos get y set

//definiendo la entidad en spring
@Entity(name="Producto")

//deifiniendo la tabla de la base de datos
@Table(name="t_producto")

//Para que sea una clase de spring se tiene que serializar
public class Producto implements Serializable{
    
    //Agregamos el id de la serializacion
    private static final long serialVersion=1L;
    
    //definiendo clave primaria
    @Id
    
    //definiendo columna
    @Column(name="codpro")
    private long codigo;
    @Column(name="nompro")
    private String nombre;
    @Column(name="precpro")
    private double preciocompra;
    @Column(name="prevpro")
    private double precioventa;
    @Column(name="canpro")
    private int cantidad;
    @Column(name="estpro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="codcat", nullable = false)
    private Categoria categoria;
    
    
}  
