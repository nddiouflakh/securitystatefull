package com.groupeisi.securitystatefull.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountUserDto {
    private Long id;
    private String email;
    private String password;
    private boolean state;
}
