package com.third.mapper;

import com.third.domain.UserInfo;
import org.springframework.stereotype.Repository;


@Repository
public interface OperationDao {

    public UserInfo selectOperationsByUsername(String username) throws Exception;
}
