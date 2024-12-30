package com.hangmanspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NamesService {

    @Autowired
     NamesInterface namesInterface;


    public void addNames(Names name){
       namesInterface.save(name);
    }

    public List<Names> getNames(){
        return namesInterface.findAll();
    }

    public void putMethod(String question,long id){
        Optional<Names> table =  namesInterface.findById(id);
        if(table.isPresent()){
            table.get().setName(question);
            namesInterface.save(table.get());
        }
    }

}
