package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerService implements ICustomerService{

    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "hứa thu sương", "huathusuong@gmail.com", "lạng sơn"));
        customers.put(2, new Customer(2, "lê thị sương", "lethusuong@gmail.com", "bình phước"));
        customers.put(3, new Customer(3, "trần thị ngọc anh", "tranthingocanh@gmail.com", "hà nội "));
        customers.put(4, new Customer(4, "lâm thị thủy", "lamthithuy@gmail.com", "japan"));
        customers.put(5, new Customer(5, "ali quốc thiên", "aliquocthien@gmail.com", "hồ chí minh"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }
}
