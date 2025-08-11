package com.kapil.template;

public abstract sealed class AbstractTeacher implements Teacher permits PermanentTeacher, TemporaryTeacher {
    public final void teach(){

        // 1. Teacher should first take attendance
        takeAttendance();

        // 2. Teacher should then teach the subject
        teachSubject();

        // 3. Teacher should then give classwork
        giveClassWork();

        // 4. Teacher should then give homework (Optional)
        giveHomeWork();
    }

    protected abstract void giveHomeWork();

    protected abstract void giveClassWork();

    protected abstract void teachSubject();

    protected abstract void takeAttendance();
}
