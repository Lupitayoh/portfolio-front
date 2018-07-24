package com.yoh.WsPortfolio.services.impl;

import com.yoh.WsPortfolio.models.Customer;
import com.yoh.WsPortfolio.repositories.CustomerRepository;
import com.yoh.WsPortfolio.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.getOne(id);
    }
}
