package com.zupedu.bancodigital.repository;

import com.zupedu.bancodigital.model.internal.AccountHolderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountHolderRepository extends JpaRepository<AccountHolderModel, Long> {}
