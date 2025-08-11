package com.kapil.factory;

import com.kapil.TeacherType;
import com.kapil.template.PermanentTeacher;
import com.kapil.template.Teacher;
import com.kapil.template.TemporaryTeacher;

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
