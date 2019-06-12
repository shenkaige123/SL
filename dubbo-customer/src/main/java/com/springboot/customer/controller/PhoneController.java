package com.springboot.customer.controller;

import com.springboot.api.service.IPhoneService;
import com.springboot.domain.phone;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    @Resource
    private IPhoneService phoneService;

    /**
     * @return
     */
    @RequestMapping("/findById")
    public phone.Phone findById (Long id) {
        return phoneService.findById(id);
    }

}
