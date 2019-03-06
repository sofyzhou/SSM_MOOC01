package com.third.serviceImpl;

import com.third.domain.UserInfo;
import com.third.mapper.OperationDao;
import com.third.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private OperationDao operationDao;


    @Override
    public UserInfo getUserInfoByUsername(String username) throws Exception {
        return operationDao.selectOperationsByUsername(username);
    }
}
