package com.kta.template;

public sealed interface Education permits OfflineEducation, OnlineEducation {
    void conductClass();
}
