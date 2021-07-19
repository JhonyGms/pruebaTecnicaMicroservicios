package com.test.claro.restapi.controller;

import com.test.claro.restapi.caseuse.Cliente.createCliente;
import com.test.claro.restapi.caseuse.Cliente.deleteCliente;
import com.test.claro.restapi.caseuse.Cliente.getCliente;
import com.test.claro.restapi.caseuse.Cliente.upadateCliente;
import com.test.claro.restapi.entity.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/cliente")
public class restControllerCliente{

    private createCliente createCliente;
    private getCliente getCliente;
    private deleteCliente deleteCliente;
    private upadateCliente upadateCliente;

    public restControllerCliente(
            createCliente createCliente,
            getCliente getCliente,
            deleteCliente deleteCliente,
            upadateCliente upadateCliente){
        this.createCliente = createCliente;
        this.getCliente = getCliente;
        this.deleteCliente = deleteCliente;
        this.upadateCliente = upadateCliente;
    }

    @GetMapping("/")
    List<Cliente> get(){ return getCliente.getAll();}

    @PostMapping("/")
    ResponseEntity<Cliente> newCliente(@RequestBody Cliente newCliente){
        return new ResponseEntity<>(createCliente.insert(newCliente), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity deleteCliente(@PathVariable Long id){
        deleteCliente.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    ResponseEntity<Cliente> remplaceCliente(@RequestBody Cliente cliente,@PathVariable Long id){
        return new ResponseEntity<>(upadateCliente.update(cliente, id), HttpStatus.OK);
    }
}
