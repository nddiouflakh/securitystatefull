package com.groupeisi.securitystatefull.dao;

import com.groupeisi.securitystatefull.entity.AccountUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAccountUser extends JpaRepository <AccountUserEntity,Long> {
    Optional<AccountUserEntity> findByEmail(String email);
}
