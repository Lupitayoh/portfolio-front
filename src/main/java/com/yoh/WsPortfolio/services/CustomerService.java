package com.yoh.WsPortfolio.services;

import com.yoh.WsPortfolio.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    public Customer getCustomer(Long id);
}
