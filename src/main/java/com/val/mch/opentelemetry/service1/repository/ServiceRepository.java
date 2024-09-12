package com.val.mch.opentelemetry.service1.repository;

import com.val.mch.opentelemetry.service1.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServiceRepository extends JpaRepository<ServiceEntity, UUID> {
}
