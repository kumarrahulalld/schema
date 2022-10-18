package com.example.schema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;

@Entity
public class ModuleExam extends BaseModel {
    @ManyToOne
    private Module module;
    @ManyToOne
    private Exam exam;
    private Date examDate;
}
