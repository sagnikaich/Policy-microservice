package com.tcs.health.policy_service.repo;

import com.tcs.health.policy_service.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PolicyRepo extends JpaRepository<Policy,Long> {
    List<Policy> findByNameContainingIgnoreCase(String keyword);
    List<Policy> findByPremiumLessThanEqual(double maxPremium);
}
