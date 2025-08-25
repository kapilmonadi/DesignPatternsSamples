module com.kapil.designpatterns {
    requires spring.context;
    // Export the main package that contains your sealed classes
    exports com.kapil.template;
    exports com.kapil.factory;
    exports com.kapil;
    
    // If you have any other packages that need to be exported, add them here
    // exports com.kapil.constants;
    // exports com.kapil.controller;
    // exports com.kapil.entity;
    // exports com.kapil.helper;
    // exports com.kapil.utils;
    
    // If you're using any external dependencies, declare them here
    // requires java.base; // This is implicit and not needed
    // requires spring.boot; // If using Spring Boot
    // requires spring.context; // If using Spring Context
}
