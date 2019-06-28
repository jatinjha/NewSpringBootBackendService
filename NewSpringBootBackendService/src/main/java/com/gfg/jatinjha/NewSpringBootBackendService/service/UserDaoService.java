package com.gfg.jatinjha.NewSpringBootBackendService.service;

import com.gfg.jatinjha.NewSpringBootBackendService.modelUnit.Model;
import com.gfg.jatinjha.NewSpringBootBackendService.repositoryUnit.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserDaoService {

      @Autowired
      UserRepository userRepository;


       public List<Model> findAllUsers(){
           return userRepository.findAll();
       }


       public Model getUserById(Long id){

           Optional<Model> userOptional = userRepository.findById(id);

           if(userOptional.isPresent()){
               log.debug("user found for id {} , is {} ",id,userOptional.get());
           }else{
               throw new IllegalIdentifierException("id : "+id);
           }

           return userOptional.get();
       }

       public Model createUser(Model model){
            userRepository.save(model);
            return model;
       }

       public Model updateUser(Model model){
           userRepository.save(model);
           return model;
       }

       public Model deleteUser(Long id){
           Model user = getUserById(id);
           userRepository.delete(user);
           return user;
       }

}
