package com.zupedu.bancodigital.controller;

import com.zupedu.bancodigital.controller.wrapper.UserInterestWrapper;
import com.zupedu.bancodigital.model.input.UserInterestInput;
import com.zupedu.bancodigital.model.internal.UserInterestModel;
import com.zupedu.bancodigital.model.output.UserInterestOutput;
import com.zupedu.bancodigital.repository.UserInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zupedu.bancodigital.common.PostController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.ConstraintViolationException;
import java.net.URI;

@RestController
@RequestMapping(value = "/v1/interest")
public class UserInterestController implements PostController<UserInterestInput> {

    @Autowired
    private UserInterestWrapper wrapper;
    @Autowired
    private UserInterestRepository repository;

    @Override
    @PostMapping
    public ResponseEntity<?> save(
            @RequestBody UserInterestInput request,
            UriComponentsBuilder builder
    ) {
        try {

            System.out.println("Log request : " + request.getName());
            System.out.println("Log request : " + request.getCep());
            System.out.println("Log request : " + request.getDocument());
            System.out.println("Log request : " + request.getReference());
            System.out.println("Log request : " + request.getStreet());
            System.out.println("Log request : " + request.getStreet());

            UserInterestModel userInterestModel = repository.findByCPF(request.getDocument());

            if (userInterestModel != null) {

                UserInterestOutput output = new UserInterestOutput(
                        "Proposta já existente, por favor aguarde",
                        userInterestModel.getProtocol()
                );

                return ResponseEntity.status(401).body(output);
            }

            UserInterestModel model = repository.save(wrapper.map(request));

            UserInterestOutput output = new UserInterestOutput(
                    "Proposta enviada com sucesso",
                    model.getProtocol()
            );

            return ResponseEntity.status(201).body(output);
        } catch (ConstraintViolationException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
