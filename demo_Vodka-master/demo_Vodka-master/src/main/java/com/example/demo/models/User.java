package com.example.demo.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    @Column(name="username", columnDefinition = "nvarchar(30) not null",unique = true)
    private String username;
    @Column(name="password", columnDefinition = "nvarchar(50) not null",unique = true)
    private String password;
    @Column(name="name", columnDefinition = "nvarchar(50)")
    private String name;
    private LocalDate dob;
    private String email;
    private LocalDate learntime;
    @Column(name="point", columnDefinition = "int  null ")
    private int point;
    @ManyToOne(cascade = {CascadeType.ALL}) // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @JoinColumn(name = "rolds")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Role roles;

    // mappedBy trỏ tới tên biến User ở trong User.
    @ManyToMany(mappedBy = "users")
    // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<Notification> notifications;

    // mappedBy trỏ tới tên biến User ở trong User.
    @ManyToMany(mappedBy = "users")
    // LAZY để tránh việc truy xuất dữ liệu không cần thiết. Lúc nào cần thì mới query
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Collection<Word> words;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude // không sử dụng trường này trong equals và hashcode
    @ToString.Exclude // Khoonhg sử dụng trong toString()
    private Collection<TestHistory> histories;
}
