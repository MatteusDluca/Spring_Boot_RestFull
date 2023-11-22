package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.database.RepositorioContato;
import com.crud.entidade.Contato;
@RestController //Determina que esse é um controller REST
@RequestMapping("/src/main/java/com/crud/entidade/Contato")//Para vincular a uma URL
public class ContatoREST {
    @Autowired
    private RepositorioContato rep;
    

    @GetMapping//Determina que é um protocolo Get
    public List<Contato>listar(){
        return rep.findAll();
    };
    @PostMapping //Dando a rota de post
    public void salvar(@RequestBody/*Vai converter o objeto JSON em java*/ Contato contato){
        rep.save(contato);
    };
    public void alterar(@RequestBody Contato contato){
        if(contato.getId() != null)
            rep.save(contato);
    };

    @DeleteMapping //Mapear o delete
    public void del(Contato contato){
        rep.delete(contato);
    }
}