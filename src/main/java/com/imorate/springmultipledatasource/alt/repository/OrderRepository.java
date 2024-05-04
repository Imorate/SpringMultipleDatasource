package com.imorate.springmultipledatasource.alt.repository;

import com.imorate.springmultipledatasource.alt.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
