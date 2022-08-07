package com.example.demo;

import com.example.demo.models.TypeWord;
//import com.example.demo.repositories.TypeWordReposity;
//import com.example.demo.repositories.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

//    private final TypeWordReposity typeWordReposity;
//	private final WordRepository wordRepository;

//	public void run(String... args) throws Exception {
//        // Tạo ra đối tượng person
//        TypeWord typeWord = TypeWord.builder()
//                .name("loda")
//                .build();
//        // Lưu vào db
//    }
}
