package com.demo.service;

import com.demo.entity.User;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(final Integer id) {
        return userRepository.findById(id);
    }

    public Optional<User> findByCpfCnpj(final String cpfCnpj) {
        return userRepository.findByCpfCnpj(cpfCnpj);
    }

    public User save(final User user) {
        return userRepository.save(user);
    }

    public void deleteById(final Integer id) {
        userRepository.deleteById(id);
    }
}
