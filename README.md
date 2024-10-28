# Ejecutar proyecto:
```
mvn clean install exec:java
```

NOTA: Revisa el path del ejecutable java en el pom antes de ejecutarlo.
```XML
 <plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>exec-maven-plugin</artifactId>
    <version>3.0.0</version>
    <executions>
        <execution>
            <goals>
                <goal>java</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <mainClass>com.example.Main</mainClass>
        <!-- Aquí especificas el ejecutable de java de tu JDK -->
        <executable>C:/Program Files/Java/jdk-1.8/bin/java</executable>
    </configuration>
</plugin>
```
