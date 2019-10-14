package com.siuuu.converter;

import com.siuuu.domain.User;
import com.siuuu.model.ModelUser;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public ModelUser convertUser(User user){
        ModelUser modelUser = new ModelUser(user.getcUser(),user.getuPhoto(),user.getuFirstNames(),user.getuLastNames(),user.getuUsername(),
                user.getuPassword(),user.getuBirthday(),user.getuGender(),user.getuCountry(),user.getuInstitution(), user.getuDegree(),
                user.getuCareer(),user.getuType());
        return modelUser;
    }
}
