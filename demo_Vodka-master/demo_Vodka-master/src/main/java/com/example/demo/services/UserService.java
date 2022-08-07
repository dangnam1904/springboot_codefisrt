package com.example.demo.services;


import com.example.demo.models.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void saveUser(User user);
    User getUserById(long id);
    void deleteUserById(long id);
    Page<User> findPaginated(int pageNo, int PageSize, String sortField, String sortDirection);
}
