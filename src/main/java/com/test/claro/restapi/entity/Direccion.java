package com.test.claro.restapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("direccion")
public class Direccion {

    @Id
    private long id;

    private Long id_Cliente;

    private String departamento;

    private String ciudad;

    private String direccionCompleta;

    public Direccion() {
    }

    public Direccion(long id, Long id_Cliente, String departamento, String ciudad, String direccionCompleta) {
        this.id = id;
        this.id_Cliente = id_Cliente;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccionCompleta = direccionCompleta;
    }

    public Direccion(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Long getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(Long id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccionCompleta() {
        return direccionCompleta;
    }

    public void setDireccionCompleta(String direccionCompleta) {
        this.direccionCompleta = direccionCompleta;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", id_Cliente=" + id_Cliente +
                ", departamento='" + departamento + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", direccionCompleta='" + direccionCompleta + '\'' +
                '}';
    }
}
