package com.kapil.template;

public sealed interface Teacher permits AbstractTeacher {
    void teach();
}
