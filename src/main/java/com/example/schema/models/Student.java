package com.example.schema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Student extends BaseModel{
    private String name;
    private String email;
    private String address;
    @ManyToMany
    private List<Module> enrolledModules;
}
