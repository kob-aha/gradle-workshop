# Exercise 4 - Built-in Task Types

In this exercise we will learn how to use Gradle's built-in task types. 
Using Gradle's build-in task types ease build file development as we inherit the properties and actions of the type.  

## Reference Documentation

- [Working With Files](https://docs.gradle.org/current/userguide/working_with_files.html)
- [Zip Task](https://docs.gradle.org/current/dsl/org.gradle.api.tasks.bundling.Zip.html)
- [Copy Task](https://docs.gradle.org/current/dsl/org.gradle.api.tasks.Copy.html)
- [Delete Task](https://docs.gradle.org/current/dsl/org.gradle.api.tasks.Delete.html)

## Exercise Steps

#### Zip

- Open [solution.gradle](solution.gradle) located in this folder
- Create a new task called "zipTask" which creates a zip file of all *.txt files under "files" folder

    **Bonus:** Try to use Project's support in order to access "files" dir. More can be found [here](https://docs.gradle.org/current/userguide/working_with_files.html)       
- Once ready, go to the root of the project and run the following:

    `gradlew :exercise-4:runZip`

#### Copy

- Open [solution.gradle](solution.gradle) located in this folder
- Create a new task called "copyTask" which copies the created zip file from above to a new folder "dist" located 
near solution.gradle file

    **Bonus:** Use "zipTask" in order to implement this task instead of accessing the file path directly
    
- Once ready, go to the root of the project and run the following:
    
    `gradlew :exercise-4:runCopy`
    
#### Delete            

- Open [solution.gradle](solution.gradle) located in this folder
- Create a new task called "deleteTask" which deletes the zip file copied by the copy task above

    **Bonus:** Use "copyTask" in order to implement this task instead of accessing the file path directly
    
- Once ready, go to the root of the project and run the following:
    
    `gradlew :exercise-4:runDelete`