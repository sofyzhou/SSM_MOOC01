package com.third.service;

import com.third.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface OperationService {
    public UserInfo getUserInfoByUsername(String username)throws Exception;
}
