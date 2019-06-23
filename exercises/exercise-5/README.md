# Exercise 5 - Plugins

Plugin extends the project's capabilities and provides a way to reuse functionality instead of re-implement it over and over again.

Applying a plugin to a project can do things such as:

- Extend the Gradle model (e.g. add new DSL elements that can be configured)

- Configure the project according to conventions (e.g. add new tasks or configure sensible defaults)

- Apply specific configuration (e.g. add organizational repositories or enforce standards) 

## Reference Documentation

- [Gradle Plugins](https://docs.gradle.org/current/userguide/plugins.html)
- [Standard Plugins](https://docs.gradle.org/current/userguide/standard_plugins.html)
- [plugins.gradle.org](https://plugins.gradle.org/)
- [ksoichiro/awesome-gradle](https://github.com/ksoichiro/awesome-gradle)

## Exercise Steps

#### Standard Plugin

- Open [build.gradle](build.gradle) located in this folder
- Apply "java" plugin to the file
- Once ready, go to the root of the project and run the following:

    `gradlew :exercise-5:build`
    
    The build still fails. Can you think why? (Hint: [Dependency Management](https://docs.gradle.org/current/userguide/java_plugin.html#sec:java_plugin_and_dependency_management)).
    
    Fix all issues and make sure build finish successfully. 

#### 3rd-Party Plugin

