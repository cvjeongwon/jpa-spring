# jpa-spring Boot build.gradle
'''
plugins {
    id 'java'<br>
    id 'org.springframework.boot' version '3.2.4'<br>
    id 'io.spring.dependency-management' version '1.1.4'<br>
}

group = 'hello'
version = '0.0.1-SNAPSHOT'

java {
    sourceCompatibility = '17'
}

configurations {
    compileOnly {<br>
        extendsFrom annotationProcessor<br>
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa' <br>
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'<br>
    implementation 'org.springframework.boot:spring-boot-starter-web'<br>
    compileOnly 'org.projectlombok:lombok'<br>
    developmentOnly 'org.springframework.boot:spring-boot-devtools'<br>
    runtimeOnly 'com.mysql:mysql-connector-j'<br>
    annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor'<br>
    annotationProcessor 'org.projectlombok:lombok'<br>
    testImplementation 'org.springframework.boot:spring-boot-starter-test'<br>
}

tasks.named('test') { ****
    useJUnitPlatform()
}

'''
