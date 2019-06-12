package com.springboot.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class phone {

    public static class Phone implements Serializable {

        // 主键id
        private Long       id;
        // 手机名称
        private String     name;
        // 价格
        private BigDecimal price;

        public Long getId () {
            return id;
        }

        public void setId (Long id) {
            this.id = id;
        }

        public String getName () {
            return name;
        }

        public void setName (String name) {
            this.name = name;
        }

        public BigDecimal getPrice () {
            return price;
        }

        public void setPrice (BigDecimal price) {
            this.price = price;
        }

    }
}

