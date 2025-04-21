//package com.healthinsurance.policyapp.model;
//
//public class Product {
//}

package com.healthinsurance.policyapp.model;

import jakarta.persistence.*;
        import java.util.List;

@Entity
public class Product {

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

