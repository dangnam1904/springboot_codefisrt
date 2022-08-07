package com.example.demo.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestHistory {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long testHistoryId;
    private LocalDate testDate;
    @Column(name="score", columnDefinition = "int  null")
    private  int score;

    @ManyToOne(cascade = {CascadeType.ALL}) // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @JoinColumn(name = "id_user")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private User user;

    @ManyToMany(mappedBy = "testhistorys")
    // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<Questions> questions;

    @ManyToOne(cascade = {CascadeType.ALL}) // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @JoinColumn(name = "test_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Test test;

}
