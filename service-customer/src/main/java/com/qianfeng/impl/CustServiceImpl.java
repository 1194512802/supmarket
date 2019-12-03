package com.qianfeng.impl;

import com.qianfeng.entity.CustEntity;
import com.qianfeng.mapper.CustMapper;
import com.qianfeng.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class CustServiceImpl implements CustService {
   @Autowired
    CustMapper custMapper;
   public CustEntity login(String cname,String cpass){
       return custMapper.login(cname,cpass);
   }

    @Override
    public boolean register(CustEntity custEntity) {
        return custMapper.register(custEntity);
    }
}
