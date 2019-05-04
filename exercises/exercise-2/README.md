# Exercise 2 - Task dependencies

In this exercise we will learn about task dependencies and how to add a dependecy between two tasks

## Reference Documentation

- [Task.dependsOn](https://docs.gradle.org/current/dsl/org.gradle.api.Task.html#org.gradle.api.Task:dependsOn(java.lang.Object[]))

- [Authoring Tasks](https://docs.gradle.org/current/userguide/more_about_tasks.html#sec:adding_dependencies_to_tasks)

## Exercise Steps

- Open [solution.gradle](solution.gradle) located in this folder
- Edit the file and add a dependecy between task 'world' and 'hello' (Make sure you add the dependency in the right task). 
- Once ready, go to the root of the project and run the following:

    `gradlew :exercise-2:run -q`

    (Make sure the output matches the expected output below) 

## Exepcted output

```
 gradlew :exercise-2:run -q
 Hello World !!!
 ```
