package com.aryan1403.Manage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public Student(String studentName, String studentPhone, String studentCity) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }   
}
