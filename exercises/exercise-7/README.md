# Exercise 7 - Publish artifacts

In this exercise we will learn how to publish artifacts that can be consumed by others. For simplicity, The exercise will focus on publishing to a local folder, however it's very easy to extend this exercise and publish to Artifactory by changing the repository definition. 

## Reference Documentation

- [Pubishing](https://docs.gradle.org/current/userguide/publishing_overview.html)
- [Maven Publish Plugin](https://docs.gradle.org/current/userguide/publishing_maven.html#publishing_maven)

## Exercise Description

In this exercise we will use the server code from exercise 6 and pubish it's jar to a local folder using 'maven-publish' plugin.

## Exercise Steps

### Publish to local folder

- Add 'maven-publish' plugin to solution.gradle located next to this file

- Create a new maven publication called "exercise7" and configure it to publish to a local folder called "repository". The folder should be created next to this file.

 **Hint:** take a look at "Publishing" URL in reference documentation section which contains an example.

- Once ready, go to the root of the project and run the following:

    `gradlew :exercise-7:run`

    Make sure there are no failures and verify repository folder contains the generated jar file.

### Bonus - Publish to Maven local

Publish to Maven local in addition to local 'repository' folder. 

**Hint:** analyze exercise-7 tasks by running ``` gradlew tasks --all```. 
Can you see what task you should run to publish to Maven local.



