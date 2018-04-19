package org.sgi.mastering.dataskils.repository;

import org.sgi.mastering.dataskils.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface   CustomerRepository  extends  JpaRepository<Customer, Long>{

}
