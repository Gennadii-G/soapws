package com.study.ws.main;

import com.study.ws.model.Goods;
import com.study.ws.soap.WebserviceSE;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class StudyWS {

    public static void main(String[] args) {
        testSOAPasClient();
    }

    private static void testSOAPasClient() {
        String url = "http://localhost:8080/soap/webserviceSE";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(WebserviceSE.class);
        factoryBean.setAddress(url);

        WebserviceSE webserviceSE = (WebserviceSE) factoryBean.create();

        Goods res = webserviceSE.getGoods();
        System.out.println("result: " + res);
    }

}
