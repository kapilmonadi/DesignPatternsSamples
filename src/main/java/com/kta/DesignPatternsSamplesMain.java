package com.kta;

import com.kta.enums.TeacherType;
import com.kta.factory.TeacherFactorySpring;
import com.kta.template.Teacher;
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
