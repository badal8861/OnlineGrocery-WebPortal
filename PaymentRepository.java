package com.onlinegrocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinegrocery.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {

}
