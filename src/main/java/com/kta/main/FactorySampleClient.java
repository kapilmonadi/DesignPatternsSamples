package com.kta.main;

import com.kta.enums.TeacherType;
import com.kta.factory.TeacherFactory;
import com.kta.template.Teacher;

public class FactorySampleClient {
    public static void main(String[] args) {
        Teacher permanentTeacher = TeacherFactory.of(TeacherType.PERMANENT);
        Teacher temporaryTeacher = TeacherFactory.of(TeacherType.TEMPORARY);

        permanentTeacher.teach();
        temporaryTeacher.teach();
    }
}
