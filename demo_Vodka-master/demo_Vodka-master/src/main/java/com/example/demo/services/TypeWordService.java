package com.example.demo.services;

import com.example.demo.models.TypeWord;
import com.example.demo.repositories.TypeWordReposity;

import java.util.List;

public interface TypeWordService {
    List<TypeWord> getAllTypeWord();
    void saveTypeWord(TypeWord typeWord);
    TypeWord getTypeWordById(long id);
    void deleteTypeWordById(long id);
}
