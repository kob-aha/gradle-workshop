# Exercise 6 - Multi-project

Multi-project builds allows you to split a large project into smaller parts helping you to concentrate on one area of work in a larger project.
It's very similar to what we have in Maven, however it adds more functionality which is not supported in Maven.

## Reference Documentation

- [Multi Project Builds](https://guides.gradle.org/creating-multi-project-builds/)
- [Settings](https://docs.gradle.org/current/dsl/org.gradle.api.initialization.Settings.html)

## Exercise Overview

This exercise contains multi project build skeleton for building 2 java modules:
* server
* client

Your task will be to extend the skeleton to a full build which provides a way to build both modules. 

## Exercise Steps

- Add both client and server to exercise-6 multi module build. This should be done by editing settings.gradle file located near tihs file (inside the exercise folder).
Once finished, make sure it is working by running the following command from the root project, making sure the output matches the bellow:

    ```
    gradlew -b exercises/exercise-6/build.gradle projects


    > Task :projects

    ------------------------------------------------------------
    Root project
    ------------------------------------------------------------

    Root project 'exercise-6-multiproject'
    +--- Project ':client'
    \--- Project ':server'
    ```

- Add java plugin to both modules. Make sure to achieve this by editing build.gradle located next to this file and **NOT** by editing build.gradle inside every module.

    >**_Hint:_** Take a look at [Project.subprojects](https://docs.gradle.org/current/javadoc/org/gradle/api/Project.html#subprojects-groovy.lang.Closure-).

    >**IMPORTANT:** plugins block is not supported when using subprojects, so you will need to use the Project's apply method as shown [here](https://docs.gradle.org/current/userguide/plugins.html#sec:subprojects_plugins_dsl).

- Make sure you are able to build both modules by running the following command:

    ``` gradlew -b exercises/exercise-6/build.gradle build ```

    You will need to add a dependency between client and server modules which should be added in the client module build.gradle file.

- Add Application plugin to client module (by editing the module's build.gradle file) and configure "edu.gradle.GreetingClient" as the main class. 

    Once finished run the client main class using the following command and verify the output match the expected bellow:

    ```
    ./gradlew -b exercises/exercise-6/build.gradle -q run
    Hello From HelloGreeting
    ``` 
    
