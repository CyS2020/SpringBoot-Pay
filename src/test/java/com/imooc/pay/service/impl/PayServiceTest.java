package com.imooc.pay.service.impl;

import com.imooc.pay.PayApplicationTest;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author: CyS2020
 * @date: 2020/12/8
 */
public class PayServiceTest extends PayApplicationTest {
    @Autowired
    private PayService payService;

    @Test
    public void create() {
        payService.create("123456789199520201", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
    }
}