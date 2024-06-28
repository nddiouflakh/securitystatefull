package com.groupeisi.securitystatefull.config;

import com.groupeisi.securitystatefull.dao.IAccountUser;
import com.groupeisi.securitystatefull.entity.AccountUserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private IAccountUser repository;
    public UserDetailsServiceImpl(IAccountUser repository) {
        this.repository = repository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountUserEntity userEntity = repository.findByEmail(username).orElseThrow();
        return org.springframework.security.core.userdetails.User.builder()
                .username(userEntity.getEmail())
                .password(userEntity.getPassword())
                .build();
    }
}
