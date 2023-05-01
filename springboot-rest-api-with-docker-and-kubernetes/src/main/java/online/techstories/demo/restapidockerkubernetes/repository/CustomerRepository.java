package online.techstories.demo.restapidockerkubernetes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.techstories.demo.restapidockerkubernetes.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}