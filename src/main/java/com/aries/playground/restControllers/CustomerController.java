package com.aries.playground.restControllers;

import com.aries.playground.entities.Customer;
import com.aries.playground.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "")
    public @ResponseBody List<Customer> getCustomer(){
        return customerRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody Customer getCustomerById(@PathVariable long id, HttpServletResponse response){
        Customer result = customerRepository.findOne(id);
        if(result != null)
            return result;
        else
        {
            response.setStatus(204);
            return null;
        }
    }
}

