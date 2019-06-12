package com.springboot.api.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.domain.phone;

import java.math.BigDecimal;

@Service(version = "1.0.0")
public class PhoneServiceImpl implements IPhoneService {

    /**
     * 根据id查找手机
     *
     * @param id
     * @return
     */
    @Override
    public  phone.Phone findById (Long id) {
        phone.Phone phone = new phone.Phone();
        phone.setId(id);
        phone.setName("iphonex");
        phone.setPrice(BigDecimal.valueOf(8848.88));
        return phone;
    }
}