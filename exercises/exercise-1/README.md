# Exercise 1 - Task

In this exercise we will learn about a Task which is one of Gradle's basic concepts

## Reference Documentation

- [Build Script Basics](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html)
- [Manipulating existing task](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html#sec:manipulating_existing_tasks)

## Exercise Steps

#### Creating a new Task

- Open [solution.gradle](solution.gradle) located in this folder
- Edit the file and add a new hello task which print "Hello World !!!" to the screen.

#### Manipulating exists task

- Open [solution.gradle](solution.gradle) located in this folder
- Edit the file and configure an existing "example" task. 
  Make sure to add a "description" and a single action using "doFirst" which prints something to the screen.

Once you finish the above, go to the root of the project and run the following:

`gradlew :exercise-1:run -q`

(Make sure the output matches the expected output below) 

## Exepcted output

```
 gradlew :exercise-1:run -q
 Hello World !!!
 ```
