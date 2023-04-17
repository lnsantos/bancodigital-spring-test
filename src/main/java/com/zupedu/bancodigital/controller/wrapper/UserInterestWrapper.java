package com.zupedu.bancodigital.controller.wrapper;

import com.zupedu.bancodigital.model.input.UserInterestInput;
import com.zupedu.bancodigital.model.internal.UserInterestModel;
import org.springframework.stereotype.Component;

@Component
public class UserInterestWrapper {

    public UserInterestModel map(UserInterestInput input) {
        UserInterestModel model = new UserInterestModel();

        model.setCep(input.getCep());
        model.setDocument(input.getDocument());
        model.setEmail(input.getEmail());
        model.setName(input.getName());

        return model;
    }
}
