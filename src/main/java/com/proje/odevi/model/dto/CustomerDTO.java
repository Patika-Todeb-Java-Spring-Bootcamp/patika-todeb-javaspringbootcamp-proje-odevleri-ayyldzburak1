package com.proje.odevi.model.dto;

import com.proje.odevi.model.entity.Order;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerDTO {

    private String name;
    private List<Order> orders;
}
