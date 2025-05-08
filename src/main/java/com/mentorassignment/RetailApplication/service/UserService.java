package com.mentorassignment.RetailApplication.service;

import com.mentorassignment.RetailApplication.exception.UserNotFoundException;
import com.mentorassignment.RetailApplication.model.User;
import com.mentorassignment.RetailApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserService {
    private static final Logger logger = Logger.getLogger(UserService.class.getName());
    @Autowired
    private UserRepository userRepository;
    public String userLogin(String mail, String password)
    {
       User user = userRepository.findByEmailAndPassword(mail, password);
        if(user!=null)
        {
            return user.getUserName();
        }

        logger.warning("User email or password invalid");
        throw new UserNotFoundException("User email or password invalid");
    }


    public String userRegister(User user) {

        if(userRepository.findByEmail(user.getMail())!=null)
        {
            logger.warning("User Already exist");
           throw new UserNotFoundException("User Already exist");
        }

        userRepository.save(user);
        return "home";

    }


}
