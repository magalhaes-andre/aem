# AEM

## AEM Project Archetype

[Archetype Repository](https://github.com/adobe/aem-project-archetype)

Simple command:

:warning: *Windows Users* may need to run application on admin privelege for correct work of the command below.
```
mvn -B org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate -D frontendModule=none -D aemVersion=6.5.7 -D archetypeGroupId=com.adobe.aem -D archetypeArtifactId=aem-project-archetype -D archetypeVersion=47 -D appTitle="Component Playground" -D appId="playground" -D groupId="com.scholastic.playground" 
```