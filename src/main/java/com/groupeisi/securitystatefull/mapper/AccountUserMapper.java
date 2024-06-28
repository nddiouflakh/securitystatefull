package com.groupeisi.securitystatefull.mapper;

import com.groupeisi.securitystatefull.dto.AccountUserDto;
import com.groupeisi.securitystatefull.entity.AccountUserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AccountUserMapper {
    AccountUserEntity toAccountUserEntity(AccountUserDto accountUserDto);
    AccountUserDto toAccountUserDto(AccountUserEntity accountUserEntity);
}
