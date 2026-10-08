package com.kta.factory;

import com.kta.enums.TeacherType;
import com.kta.template.PermanentTeacher;
import com.kta.template.Teacher;
import com.kta.template.TemporaryTeacher;

public class TeacherFactory {
    private TeacherFactory(){

    }

    public static Teacher of(TeacherType teacherType){
        return switch (teacherType) {
            case PERMANENT -> new PermanentTeacher();
            case TEMPORARY -> new TemporaryTeacher();
        };
    }
}
