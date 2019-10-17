package com.siuuu.converter;

import com.siuuu.domain.User;
import com.siuuu.model.UserModel;
import org.springframework.stereotype.Component;

@Component("userConverter")
public class UserConverter {
    public UserModel convertUser(User user){
        UserModel userModel = new UserModel(user.getcUser(),user.getuPhoto(),user.getuFirstNames(),user.getuLastNames(),user.getuUsername(),
                user.getuPassword(),user.getuBirthday(),user.getuGender(),user.getuCountry(),user.getuInstitution(), user.getuDegree(),
                user.getuCareer(),user.getuType());
        return userModel;
    }
}
