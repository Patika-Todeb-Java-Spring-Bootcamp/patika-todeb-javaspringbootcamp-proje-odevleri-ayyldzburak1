package com.proje.odevi.repository;

import com.proje.odevi.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long> {

    Optional<Customer> findCustomerByName(String name);

}
