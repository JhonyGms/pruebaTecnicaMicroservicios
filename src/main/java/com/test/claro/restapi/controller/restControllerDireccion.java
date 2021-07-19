package com.test.claro.restapi.controller;

import com.test.claro.restapi.caseuse.Cliente.getCliente;
import com.test.claro.restapi.caseuse.Direcciones.createDireccion;
import com.test.claro.restapi.caseuse.Direcciones.deleteDireccion;
import com.test.claro.restapi.caseuse.Direcciones.getDireccion;
import com.test.claro.restapi.caseuse.Direcciones.updateDireccion;
import com.test.claro.restapi.entity.Direccion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/direccion")
public class restControllerDireccion {

    private createDireccion createDireccion;
    private deleteDireccion deleteDireccion;
    private updateDireccion updateDireccion;
    private getDireccion getDireccion;
    private getCliente getCliente;

    public restControllerDireccion(
            createDireccion createDireccion,
            deleteDireccion deleteDireccion,
            updateDireccion updateDireccion,
            getDireccion getDireccion,
            getCliente getCliente) {
        this.createDireccion = createDireccion;
        this.deleteDireccion = deleteDireccion;
        this.updateDireccion = updateDireccion;
        this.getDireccion = getDireccion;
        this.getCliente = getCliente;
    }

    @GetMapping("/")
    List<Direccion> get(){ return getDireccion.getAll();}

    @PostMapping("/")
    ResponseEntity<Direccion> newCliente(@RequestBody Direccion newDireccion){
        if (getCliente.getIdExiste(newDireccion.getId_Cliente())){
            return new ResponseEntity<>(createDireccion.insert(newDireccion), HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteCliente(@PathVariable Long id){
        deleteDireccion.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    ResponseEntity<Direccion> remplaceCliente(@RequestBody Direccion direccion,@PathVariable Long id){
        return new ResponseEntity<>(updateDireccion.update(direccion, id), HttpStatus.OK);
    }
}
