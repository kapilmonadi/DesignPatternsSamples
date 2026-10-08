module com.kta.designpatterns {
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    // Export the main package that contains your sealed classes
    exports com.kta.template;
    exports com.kta.factory;
    exports com.kta;
    exports com.kta.enums;

    // If you have any other packages that need to be exported, add them here
    // exports com.ktaonstants;
    // exports com.ktaontroller;
    // exports com.ktantity;
    // exports com.ktaelper;
    // exports com.ktatils;
    
    // If you're using any external dependencies, declare them here
    // requires java.base; // This is implicit and not needed
    // requires spring.boot; // If using Spring Boot
    // requires spring.context; // If using Spring Context
}

