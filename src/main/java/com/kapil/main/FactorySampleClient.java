package com.kapil.main;

import com.kapil.TeacherType;
import com.kapil.factory.TeacherFactory;
import com.kapil.factory.TeacherFactorySpring;
import com.kapil.template.Teacher;

public class FactorySampleClient {
    public static void main(String[] args) {
        Teacher permanentTeacher = TeacherFactory.of(TeacherType.PERMANENT);
        Teacher temporaryTeacher = TeacherFactory.of(TeacherType.TEMPORARY);

        permanentTeacher.teach();
        temporaryTeacher.teach();

        Teacher permanentTeacher2 = TeacherFactorySpring.of(TeacherType.PERMANENT);
        Teacher temporaryTeacher2 = TeacherFactorySpring.of(TeacherType.TEMPORARY);

        permanentTeacher2.teach();
        temporaryTeacher2.teach();
    }
}
