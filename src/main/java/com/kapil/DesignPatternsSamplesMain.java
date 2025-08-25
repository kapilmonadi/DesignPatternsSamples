package com.kapil;

import com.kapil.enums.TeacherType;
import com.kapil.factory.TeacherFactorySpring;
import com.kapil.template.Teacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsSamplesMain {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsSamplesMain.class, args);

        Teacher permanentTeacher2 = TeacherFactorySpring.of(TeacherType.PERMANENT);
        Teacher temporaryTeacher2 = TeacherFactorySpring.of(TeacherType.TEMPORARY);

        permanentTeacher2.teach();
        temporaryTeacher2.teach();
    }
}
