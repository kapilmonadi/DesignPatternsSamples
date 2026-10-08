package com.kta.template;

public sealed interface Teacher permits AbstractTeacher {
    void teach();
}
