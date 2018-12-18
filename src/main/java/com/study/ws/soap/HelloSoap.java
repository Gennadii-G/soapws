package com.study.ws.soap;

import com.study.ws.model.Goods;

import javax.jws.WebService;

@WebService(endpointInterface="com.study.ws.soap.WebserviceSE",
        serviceName="HelloSoap")
public class HelloSoap implements WebserviceSE {

    @Override
    public String testService() {
        return "Hello from SOAP ws";
    }

    @Override
    public String sayHello(String text) {
        return "Hello " + text;
    }

    @Override
    public Goods getGoods() {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("Some goods test name");
        return goods;
    }
}
