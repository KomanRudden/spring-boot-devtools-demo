# Spring Boot DevTools Demo

### Try it out
Simply run 
    
    mvn spring-boot:run
    
 then edit one of the classes and save. 

### Speed up your Spring Boot development
By simply adding the following Maven dependency to your project

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
    </dependencies>
    
Spring will auto-magically reload your project whenever a change is detected on the classpath.

DevTools is only enabled when running the project directly or through your IDE. Running 'java-jar' will disabled DevTools.

Caching is disabled as well by DevTools as caching can be counter-productive when developing and testing.

This little gem caught me out: DevTools will not work in projects named

    spring-boot
    spring-boot-devtools
    spring-boot-autoconfigure
    spring-boot-actuator
    spring-boot-starter
    
 How typical is it that I chose 'spring-boot-devtools' when testing and spent a good while scratching my head.
 
 There are various settings in your IntelliJ IDE that can assist with speeding up development even further. Rather than hitting 
    
    CTRL + F9
    
every time you want to build, simply set 

    Build project automatically
     
 in IDE Settings under 

    Build, execution, Deployment > Compiler
    
LiveReload triggers a browser refresh when a the following resources change. An extension is required in your browser.

    /META-INF/maven
    /META-INF/resources
    /resources
    /static
    /public
    /templates

   