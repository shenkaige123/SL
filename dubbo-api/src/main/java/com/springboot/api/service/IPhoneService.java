package com.springboot.api.service;

import com.springboot.domain.phone;

public interface IPhoneService {

    /**
     * 根据id查找手机
     *
     * @param id
     * @return
     */
    phone.Phone findById (Long id);
}