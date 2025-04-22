package com.tcs.health.policy_service.controller;


import com.tcs.health.policy_service.model.Policy;
import com.tcs.health.policy_service.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class ProductController {

    @Autowired
    private PolicyService policyService;

    @GetMapping
    public List<Policy> getAllPolicies() {
        return policyService.getALlPolicies();
    }

    @GetMapping("/{id}")
    public Policy getPolicyById(@PathVariable Long id) {
        return policyService.getPolicyById(id);
    }

    @PostMapping
    public Policy createPolicy(@RequestBody Policy policy){
        return policyService.createPolicy(policy);
    }

    @DeleteMapping("/{id}")
    public void deletePolicy(@PathVariable Long id) {
        policyService.deletePolicy(id);
    }

}
