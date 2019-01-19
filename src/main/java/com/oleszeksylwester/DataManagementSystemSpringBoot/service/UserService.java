package com.oleszeksylwester.DataManagementSystemSpringBoot.service;

import com.oleszeksylwester.DataManagementSystemSpringBoot.model.User;
import com.oleszeksylwester.DataManagementSystemSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void SaveOrUpdate(User user){
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public User findById(Long id){
        return userRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public User findByLogin(String login){
        return userRepository.findByLogin(login);
    }

    @Transactional(readOnly = true)
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Transactional
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    @Transactional
    public void delete(User user){
        userRepository.delete(user);
    }
}
