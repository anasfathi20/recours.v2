package com.example.recours.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Entity
@Table(name="D_CHEF_MENAGE_AID")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long IDCS;

    private String Identifiant;

    private String MDP;

}