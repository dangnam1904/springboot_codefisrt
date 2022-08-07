package com.example.demo.servicesImpl;

import com.example.demo.models.TypeWord;
import com.example.demo.repositories.TypeWordReposity;
import com.example.demo.services.TypeWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeWordImpl implements TypeWordService {
    @Autowired
    private TypeWordReposity typeWordReposity;

    @Override
    public List<TypeWord> getAllTypeWord() {
        return typeWordReposity.findAll();
    }

    @Override
    public void saveTypeWord(TypeWord typeWord) {

    }

    @Override
    public TypeWord getTypeWordById(long id) {
        return null;
    }

    @Override
    public void deleteTypeWordById(long id) {

    }
}
