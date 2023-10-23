package edu.d1000so.domain.service;

import edu.d1000so.domain.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

    ;
}
