package com.zupedu.bancodigital.controller;

import com.zupedu.bancodigital.model.input.UserInterestInput;
import com.zupedu.bancodigital.repository.AccountHolderRepository;
import com.zupedu.bancodigital.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zupedu.bancodigital.common.PostController
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/v1/account")
public class AccountController implements PostController<UserInterestInput> {

    @Autowired private AccountRepository accountRepository;
    @Autowired private AccountHolderRepository accountHolderRepository;

    @Override
    @PostMapping
    public ResponseEntity<?> save(UserInterestInput request, UriComponentsBuilder builder) {
        return null;
    }
}
