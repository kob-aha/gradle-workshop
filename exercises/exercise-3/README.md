# Exercise 3 - Ordering Tasks

In this exercise we will learn about ordering tasks.

## Exercise Description

This exercise contains a task called "helloFromGradle" which can be used to print "Hello From Gradle !!!".

The purpose of this task is to configure the order of the tasks and make sure we get the desired output.

## Reference Documentation

- [Ordering tasks](https://docs.gradle.org/current/userguide/more_about_tasks.html#sec:ordering_tasks)

## Exercise Steps

- Open [solution.gradle](solution.gradle) located in this folder
- Update the file and make sure to properly configure the order between "hello" and "fromGradle" tasks.

  **Hint:** as shown in the reference documentation, consider using "mustRunAfter" in one of the tasks.
- Once ready, go to the root of the project and run the following:

    `gradlew :exercise-3:run -q`

    (Make sure the output matches the expected output below) 

## Exepcted output

```
 gradlew :exercise-3:run -q
 Hello From Gradle !!!
 ```