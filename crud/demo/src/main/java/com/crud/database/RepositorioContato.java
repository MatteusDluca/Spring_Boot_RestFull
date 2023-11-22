package com.crud.database;
import com.crud.entidade.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
    

}
