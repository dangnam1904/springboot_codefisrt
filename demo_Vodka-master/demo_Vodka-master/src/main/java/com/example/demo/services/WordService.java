package com.example.demo.services;


import com.example.demo.models.Word;
import org.springframework.data.domain.Page;

import java.util.List;

public interface WordService {
    List<Word> getAllWord();
    void saveWord(Word word);
    Word getWordById(long id);
    void deleteWordById(long id);
    Page<Word> findPaginated(int pageNo, int PageSize, String sortField, String sortDirection);
}
