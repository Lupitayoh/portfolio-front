package com.yoh.WsPortfolio.services.impl;

import com.yoh.WsPortfolio.models.Customer;
import com.yoh.WsPortfolio.repositories.CustomerRepository;
import com.yoh.WsPortfolio.services.CustomerService;
import javassist.NotFoundException;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(Long id) {
        Optional<Customer> fooOptional = customerRepository.findById(id);
        if (fooOptional.isPresent()){
            Customer foo = fooOptional.get();
            return  foo;
        }
        else{
            return null;
        }
    }
}
