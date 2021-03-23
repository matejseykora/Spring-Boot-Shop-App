package cz.matejseykora.shop.db.service.impl;

import cz.matejseykora.shop.db.repository.CustomerRepository;
import cz.matejseykora.shop.db.service.api.CustomerService;
import cz.matejseykora.shop.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.getAll();
    }

    @Override
    public Customer get(int id) {
        return customerRepository.get(id);
    }

    @Override
    public Integer addCustomer(Customer customer) {
        return customerRepository.add(customer);
    }
}
