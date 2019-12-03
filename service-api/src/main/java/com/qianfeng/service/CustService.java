package com.qianfeng.service;

import com.qianfeng.entity.CustEntity;

public interface CustService {

    public CustEntity login(String cname,String cpass);

    public boolean register(CustEntity custEntity);
}
