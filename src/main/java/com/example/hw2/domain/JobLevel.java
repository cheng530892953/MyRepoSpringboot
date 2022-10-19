package com.example.hw2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobLevel {

    @Id
    private String jobLevelId;
    private String jobLevelName;
    private String basicPay;
}
