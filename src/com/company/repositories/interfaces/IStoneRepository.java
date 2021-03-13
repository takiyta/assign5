package com.company.repositories.interfaces;

import com.company.entities.precious;
import com.company.entities.semi_precious;
import java.util.List;


public interface IStoneRepository {
    List<precious> getAllPrecious();
    List<semi_precious> getAllSemi_precious();
    Boolean SelectStoneForNecklace (semi_precious necklace,precious necklace1);


}
