package com.kapil.factory;


import com.kapil.enums.TeacherType;
import com.kapil.template.PermanentTeacher;
import com.kapil.template.Teacher;
import com.kapil.template.TemporaryTeacher;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

import static com.kapil.enums.TeacherType.PERMANENT;
import static com.kapil.enums.TeacherType.TEMPORARY;

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
