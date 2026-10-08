package com.kta.factory;


import com.kta.enums.TeacherType;
import com.kta.template.PermanentTeacher;
import com.kta.template.Teacher;
import com.kta.template.TemporaryTeacher;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

import static com.kta.enums.TeacherType.PERMANENT;
import static com.kta.enums.TeacherType.TEMPORARY;

@Component
public class TeacherFactorySpring {

    private static final Map<TeacherType, Teacher> teacherTypeMap = new EnumMap<>(TeacherType.class);

    private TeacherFactorySpring(PermanentTeacher permanentTeacher,
                                        TemporaryTeacher temporaryTeacher) {
        teacherTypeMap.put(PERMANENT, permanentTeacher);
        teacherTypeMap.put(TEMPORARY, permanentTeacher);
    }

    public static Teacher of(TeacherType teacherType) {
        Teacher teacher = teacherTypeMap.get(teacherType);
        if(teacher == null) {
            throw new IllegalArgumentException("Incorrect value provided for TeacherType");
        }
        return teacher;
    }
}
