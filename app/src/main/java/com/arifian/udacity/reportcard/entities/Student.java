package com.arifian.udacity.reportcard.entities;

import java.io.Serializable;

/**
 * Created by faqih on 14/04/17.
 */

public class Student implements Serializable {
    // nim is unique identifier for student
    private String nim, name;

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public Student(String nim, String name) {

        this.nim = nim;
        this.name = name;
    }
}
