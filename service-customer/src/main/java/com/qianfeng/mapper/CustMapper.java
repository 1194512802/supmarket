package com.qianfeng.mapper;

import com.qianfeng.entity.CustEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustMapper {
    /**
     * 登录
     * @param cname
     * @param cpass
     * @return
     */
    public CustEntity login(@Param("cname") String cname,@Param("cpass") String cpass);

    /**
     * 注册
     */
    public boolean register(CustEntity custEntity);
}
