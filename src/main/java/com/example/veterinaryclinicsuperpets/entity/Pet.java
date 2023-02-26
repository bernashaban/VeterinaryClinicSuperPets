package com.example.veterinaryclinicsuperpets.entity;

import com.example.veterinaryclinicsuperpets.entity.enums.PetType;

import java.util.Set;

public class Pet {
    private String name;
    private String age;
    private PetType type;
    private Set<Appointment> appointments;

}
