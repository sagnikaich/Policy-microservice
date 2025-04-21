package com.healthinsurance.policyapp.repository;

import com.healthinsurance.policyapp.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
    List<Policy> findByNameContainingIgnoreCase(String keyword);
    List<Policy> findByPremiumLessThanEqual(double maxPremium);
}
