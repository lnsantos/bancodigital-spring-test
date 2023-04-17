package com.zupedu.bancodigital.model.input;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class
UserInterestInput {

    @NotBlank
    @NotNull
    private String name;

    @NotBlank
    @NotNull
    @CPF
    private String document;

    @NotBlank
    @NotNull
    @Email
    private String email;

    @NotBlank
    @NotNull
    private String cep;

    @NotBlank
    @NotNull
    @NonNull
    private String street;

    @NotBlank
    @NotNull
    private String number;

    private String reference;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public UserInterestInput(
            String name,
            String document,
            String email,
            String cep,
            String street,
            String number,
            String reference
    ) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.cep = cep;
        this.street = street;
        this.number = number;
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
