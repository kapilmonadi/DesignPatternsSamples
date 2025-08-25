package com.kapil.main;

import com.kapil.enums.TeacherType;
import com.kapil.factory.TeacherFactory;
import com.kapil.template.Teacher;

public class FactorySampleClient {
    public static void main(String[] args) {
        Teacher permanentTeacher = TeacherFactory.of(TeacherType.PERMANENT);
        Teacher temporaryTeacher = TeacherFactory.of(TeacherType.TEMPORARY);

        permanentTeacher.teach();
        temporaryTeacher.teach();
    }
}
