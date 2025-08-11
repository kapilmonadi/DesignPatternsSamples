package com.kapil.main;

import com.kapil.TeacherType;
import com.kapil.factory.TeacherFactory;
import com.kapil.template.Teacher;

public class TemplateSampleClient {
    public static void main(String[] args) {
        Teacher permanentTeacher = TeacherFactory.of(TeacherType.PERMANENT);
        Teacher temporaryTeacher = TeacherFactory.of(TeacherType.TEMPORARY);

        permanentTeacher.teach();
        temporaryTeacher.teach();
    }
}
