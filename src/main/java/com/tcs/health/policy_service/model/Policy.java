//package com.healthinsurance.policyapp.model;
//
//public class Product {
//}

package com.tcs.health.policy_service.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Data
@Table(name = "table_2")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String insurer;
    private double premium;
    private double coverageAmount;

    @ElementCollection
    private List<String> benefits;

    private String termsAndConditions;
    private int waitingPeriod;

    // Getters and setters (or use Lombok: @Getter @Setter)
}

