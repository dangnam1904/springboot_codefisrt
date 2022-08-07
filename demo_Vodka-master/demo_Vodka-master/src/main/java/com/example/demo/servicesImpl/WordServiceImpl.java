package com.example.demo.servicesImpl;



import com.example.demo.models.Word;
import com.example.demo.repositories.WordRepository;
import com.example.demo.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordRepository wordRepository;

    public WordServiceImpl(WordRepository wordRepository) {
        super();
        this.wordRepository = wordRepository;
    }
    @Override
    public List<Word> getAllWord() {
        return wordRepository.findAll();
    }

    @Override
    public void saveWord(Word word) {
        this.wordRepository.save(word);
    }

    @Override
    public Word getWordById(long id) {
        Optional<Word> optional = wordRepository.findById(id);
        Word word = null;
        if( optional.isPresent()) {
            word = optional.get();
        } else {
            throw new RuntimeException("word not found for id: " + id);
        }
        return word;
    }

    @Override
    public void deleteWordById(long id) {
        this.wordRepository.deleteById(id);
    }

    @Override
    public Page<Word> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending():
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo-1, pageSize);

        return this.wordRepository.findAll(pageable);
    }
}
