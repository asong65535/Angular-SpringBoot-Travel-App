# Grading Guide

## Task A

- Run GitLab pipeline to fork
- Clone GitLab repo to local
- Setup local with
  - JDK, Maven, Spring
  - Node, Angular
  - Docker

## Task B1

1. Create welcome messages
    - Found in `src/main/resources`
    - `translation_en_US.properties`
    - `translation_fr_CA.properties`
   

2. Create `WelcomeMessage.java`
    - Found in `src/main/java/edu.wgu.d387_sample_code/welcome`
    - Handles MT message retrieval


3. Create `WelcomeMessageController.java`
    - Found in `src/main/java/edu.wgu.d387_sample_code/welcome`
    - Rest Controller to handle `WelcomeMessage.java` requests


4. Modify Angular component `src/main/UI/src/app/app.component.ts`
    - `lines 121-123` - New welcome message interface
    - `lines 23-26` - Welcome message getter
    - `lines 57-61` - Welcome message driver


5. Modify HTML template `src/main/UI/src/app/app.component.html`
    - `lines 26-31` - Welcome message div

## Task B2

1. Modify HTML template `src/main/UI/src/app/app.component.html`
    - `lines 84-86` - Display price in USD, CAD, and EUR

## Task B3

1. Create `TimeZoneConverter.java`
    - Found in `src/main/java/edu.wgu.d387_sample_code/timezone`
    - Gets current time in Eastern Time, converts to MT and UTC


2. Create `TimeZoneConverterController.java`
    - Found in `src/main/java/edu.wgu.d387_sample_code/timezone`
    - Rest controller to handle `TimeZoneConverter.java` requests


3. Modify Angular component `src/main/UI/src/app/app.component.ts`
    - `lines 29-33` - Timezone converter getter
    - `lines 70-74` - Timezone converter driver


4. Modify HTML template `src/main/UI/src/app/app.component.html`
    - `lines 33-37` - Timezone div

## Task C1

1. Create Dockerfile

## Task C2

1. Test Docker image


2. Build container named D387_[studentID]
   - `D387_011436084` - Container Name


3. Take screenshots of webapp running in container
   - I used the built-in Docker Dashboard in IntelliJ since I don't like Docker Desktop
   - Found in `screenshots.7z`
   - `containerBuildLog.png` - shows container build log
   - `containerLog.png` - shows container current shell log
   - `containerDashboard.png` - shows env and ports

## Task C3

1. `Task C3.doc` describes how to deploy the container to Azure


<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D387 – ADVANCED JAVA
Welcome to Advanced Java! This is an opportunity for students to write multithreaded object-oriented code using Java frameworks and determine how to deploy software applications using cloud services.

FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this assessment, you will modify a Spring application with a Java back end and an Angular front end to include multithreaded language translation, a message at different time zones, and currency exchange. Then, build a Docker image of the current multithreaded Spring application and containerize it using the supporting documents provided in this task.


## SUPPLEMENTAL RESOURCES 
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

