package com.qianfeng.controller;

import com.qianfeng.entity.CustEntity;
import com.qianfeng.service.CustService;
import com.qianfeng.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RequestMapping
public class CustController {
    @Autowired
    CustService custService;
    @RequestMapping("login")
    public ModelAndView login(String cname, String cpass, HttpServletRequest request){
            ModelAndView mv = new ModelAndView();
           if(StringUtil.isEmpty(cname)){
               mv.setViewName("login");
               mv.addObject("error","用户名不能为空");
               return mv;
           }
           if(StringUtil.isEmpty(cpass)){
               mv.setViewName("login");
               mv.addObject("error","密码不能为空");
               return mv;
           }
        CustEntity custEntity = custService.login(cname,cpass);
           if(custEntity==null){
               mv.setViewName("login");
               mv.addObject("error","账号或密码错误");
               return mv;
           }else{
               mv.setViewName("success");
           }
           return mv;
    }
    @RequestMapping("register")
    public ModelAndView register(CustEntity custEntity){
        ModelAndView mv = new ModelAndView();
        if(StringUtil.isEmpty(custEntity.getCname())){
            mv.setViewName("register");
            mv.addObject("error","注册失败，用户名不能为空");
            return mv;
        }
        if(StringUtil.isEmpty(custEntity.getCpass())){
            mv.setViewName("register");
            mv.addObject("error","注册失败，密码不能为空");
             return mv;
        }
        boolean b = custService.register(custEntity);
        if(b){
            mv.setViewName("register");
            mv.addObject("注册失败，请重新注册");
            return mv;
        }else{
            mv.setViewName("login");
        }
        return mv;
    }
}
