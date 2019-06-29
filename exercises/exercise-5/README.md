# Exercise 5 - Plugins

Plugin extends the project's capabilities and provides a way to reuse functionality instead of re-implement it over and over again.

Applying a plugin to a project can do things such as:

- Extend the Gradle model (e.g. add new DSL elements that can be configured)

- Configure the project according to conventions (e.g. add new tasks or configure sensible defaults)

- Apply specific configuration (e.g. add organizational repositories or enforce standards) 

## Reference Documentation

- [Gradle Plugins](https://docs.gradle.org/current/userguide/plugins.html)
- [Standard Plugins](https://docs.gradle.org/current/userguide/standard_plugins.html)
- [Gradle Plugin Portal](https://plugins.gradle.org/)
- [ksoichiro/awesome-gradle](https://github.com/ksoichiro/awesome-gradle)

## Exercise Steps

#### Standard Plugin

- Open a command line and run Gradle's tasks command from the root project to get exercise-5 tasks:

    ```gradlew :exercise-5:tasks``` 

- Open [build.gradle](build.gradle) located in this folder
- Add "java" plugin to the file
- Run the tasks command again, can you see what changed?
- Once ready, run the following command to build exercise 5 module:

    ```gradlew :exercise-5:build```
    
    The build still fails. Can you think why? (Hint: [Dependency Management](https://docs.gradle.org/current/userguide/java_plugin.html#sec:java_plugin_and_dependency_management)).
    
    Fix all issues and make sure build finish successfully. 

#### 3rd-Party Plugin

##### Overview

In this part of the exercise we will add a 3rd party plugin to our build called SpotBugs. For more info on the plugin see reference documentation section.

##### Reference Documentation

- [SpotBugs](https://spotbugs.github.io/)

##### Exercise Steps

- Open [build.gradle](build.gradle) located in this folder
- Add "SpotBugs" plugin to the file (you can consult the plugin's documentation or Gradle's plugin portal)
- Run the tasks command again, can you see what changed?
- Once ready, run the following command to analyze exercise 5 for issues:

    ```gradlew :exercise-5:check```
- The build should fail due to an issue found by SpotBugs, the problem is that SpotBugs creates an XML report file which is harder to read so we will change it to HTML.
- Go back to [build.gradle](build.gradle) file and configure SpotBugs to generate HTML reports by defining the following:

    ```
    tasks.withType(com.github.spotbugs.SpotBugsTask) {
        reports {
            xml.enabled = false
            html.enabled = true
        }
    }
    ```
- Run SpotBugs task again and take a look at the generated HTML report to see what is the issue. The report relative path is: build/reports/spotbugs/main.html (relative to this readme file).

##### Bonus Task - Configuring a plugin using extension

By default SpotBugs fails the build in case of an issue. Your task is to configure the plugin to ignore failures so the build won't fail in case SpotBugs finds an issue.
This can be done using SpotBugs extension section added automatically by the plugin. For more info see: [FindBugsExtension](http://gradle.monochromeroad.com/docs/dsl/org.gradle.api.plugins.quality.FindBugsExtension.html) (SpotBugs uses the same extension as "FindBugs", however you should replace "findbugs" with "spotbugs").

**IMPORTANT:** This bonus task is for learning purposes only. It is **NOT** recommended to ignore failures.

