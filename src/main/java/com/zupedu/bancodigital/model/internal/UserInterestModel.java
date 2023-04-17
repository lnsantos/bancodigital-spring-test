package com.zupedu.bancodigital.model.internal;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "account_holder")
public class AccountHolderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Past
    private LocalDate dateBirth;

    @NotBlank
    @CPF
    private String document;

    @Positive
    private BigDecimal patrimonyRegistered;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public BigDecimal getPatrimonyRegistered() {
        return patrimonyRegistered;
    }

    public void setPatrimonyRegistered(BigDecimal patrimonyRegistered) {
        this.patrimonyRegistered = patrimonyRegistered;
    }
}
