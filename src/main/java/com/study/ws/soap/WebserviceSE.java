package com.study.ws.soap;

import com.study.ws.model.Goods;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebserviceSE {

    @WebMethod
    String testService();

    @WebMethod
    String sayHello(String text);

    @WebMethod
    Goods getGoods();
}
