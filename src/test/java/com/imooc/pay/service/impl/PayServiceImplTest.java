package com.imooc.pay.service.impl;

import com.imooc.pay.PayApplicationTest;
import com.imooc.pay.service.IPayService;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author: CyS2020
 * @date: 2020/12/8
 */
public class PayServiceImplTest extends PayApplicationTest {
    @Autowired
    private IPayService payService;

    @Test
    public void create() {
        payService.create("123459199520201", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
    }
}