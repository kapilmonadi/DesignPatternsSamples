package com.kapil.template;

public sealed interface Education permits OfflineEducation, OnlineEducation {
    void conductClass();
}
