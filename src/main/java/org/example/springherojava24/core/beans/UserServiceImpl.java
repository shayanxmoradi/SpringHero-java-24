package org.example.springherojava24.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        System.out.println("DefaultUserService: Constructor called. UserRepository injected: " + (userRepository != null));
    }

    @Override
    public void registerUser(String username) {
        System.out.println("DefaultUserService: Registering user '" + username + "'");
        userRepository.saveUser(username);
    }
}
