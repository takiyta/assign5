package com.company.controllers;
import com.company.entities.precious;
import com.company.entities.semi_precious;
import com.company.repositories.interfaces.IStoneRepository;
import java.util.List; //It declares a Java class to use in the code below the import statement

public class StoneController {
    private final IStoneRepository repo;

    public StoneController(IStoneRepository repo) {
        this.repo = repo;
    }


    public String getAllPrecious() {
        List<precious>precious = repo.getAllPrecious();
    //public String SelectStoneForNecklace(){};

        return precious.toString();
    }
}
