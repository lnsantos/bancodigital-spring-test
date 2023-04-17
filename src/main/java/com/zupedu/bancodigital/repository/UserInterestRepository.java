package com.zupedu.bancodigital.repository;

import com.zupedu.bancodigital.model.internal.UserInterestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterestRepository extends JpaRepository<UserInterestModel, Long> {

    @Query(value = "SELECT * FROM ACCOUNT_INTEREST as u WHERE u.document = ?1", nativeQuery = true)
    UserInterestModel findByCPF(String cpf);
}
