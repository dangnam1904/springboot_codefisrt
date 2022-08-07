package com.example.demo.models;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="typeword")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long typeWord;
    @Column(name="nametype", columnDefinition = "nvarchar(40)  null")
    private String nameType;
    @OneToMany(mappedBy = "typeWord", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<Word> word;
}
