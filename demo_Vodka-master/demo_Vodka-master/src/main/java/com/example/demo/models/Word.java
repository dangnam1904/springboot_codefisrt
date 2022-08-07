package com.example.demo.models;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="words")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long wordID;
    @Column(name="text", columnDefinition = "nvarchar(40)  null")
    private String text;
    @Column(name="meaning", columnDefinition = "nvarchar(40)  null")
    private String meaning;
    @Column(name="pronunciation", columnDefinition = "nvarchar(50)  null")
    private String pronunciation;
    @Column(name="tpye", columnDefinition = "int  null")
    private String type;
    @Column(name="img", columnDefinition = "nvarchar(100)  null")
    private String img;
    @Column(name="sound", columnDefinition = "nvarchar(100)  null")
    private String sound;

    @ManyToOne // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @JoinColumn(name = "type_id") // thông qua khóa ngoại
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private TypeWord typeWord;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Topic topic;


//    @ManyToOne
//    @JoinColumn(name = "question_id")
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    private Questions questions;

    @OneToMany(mappedBy = "word", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<Questions> questions;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()

    @JoinTable(name = "studied_word",

            joinColumns = @JoinColumn(name = "word_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Collection<User> users;

}

