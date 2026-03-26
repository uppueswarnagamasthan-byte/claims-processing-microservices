package com.eswar.claims.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "claims")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberId;
    private String patientName;
    private String providerName;
    private Double claimAmount;
    private String status;

    public Claim() {}

    public Claim(String memberId, String patientName, String providerName, Double claimAmount, String status) {
        this.memberId = memberId;
        this.patientName = patientName;
        this.providerName = providerName;
        this.claimAmount = claimAmount;
        this.status = status;
    }

    public Long getId() { return id; }
    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }
    public Double getClaimAmount() { return claimAmount; }
    public void setClaimAmount(Double claimAmount) { this.claimAmount = claimAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
