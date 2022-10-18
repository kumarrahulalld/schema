package com.example.schema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Student_Module_Exam extends BaseModel{
    @ManyToOne
    private Student student;
    @ManyToOne
    private ModuleExam moduleExam;
    private int score;
}
