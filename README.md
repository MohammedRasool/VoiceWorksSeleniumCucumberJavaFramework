Candidate Name: Mohammed Rasool Abdul Azeez
Email: razuldt@gmail.com


Assignment Artifacts
==============
1. Part 1 Answers to the assignment can be found on my personal Google Docs shared location. Link below:
        - https://docs.google.com/document/d/1_MaTC8s1ojZUvwkcqxkSbO9AVT2OALyA3Ck5NFs2uBA/edit?usp=sharing
2. Part 2 Test Case document can also be found on my personal Google Sheets shared location. Link below:
        - https://docs.google.com/spreadsheets/d/11U-fQcuh2_HQso47OvWmcZAfOLHalFm9yDbgZx_gAmg/edit?usp=sharing
3. Cucumber Reports for Pass and Fail scenarios can be found within the "Cucumber Reports" folder.<br />
        - These are actual reports of the application that I was able to generate after the test execution.<br />
        - Pass report: VoiceworksSeleniumCucumberJavaFramework\Cucumber Reports\CucumberReport- Passed.zip <br />
        - Fail report (Simulated) with screenshot and stackTrace message on error step: VoiceworksSeleniumCucumberJavaFramework\Cucumber Reports\CucumberReport- Failed.zip
        
Automation Tools used:
==============
1.	Integrated Development Environment (IDE): IntelliJ IDEA v2020.2 (Community Edition)
2.	Programming language: JAVA v1.8
3.	Web Automation tool: Selenium WebDriver v1.141.59
4.	Behaviour Driven Development tool: Cucumber Java v1.2.5
5.	Dependency Injection: Cucumber Picocontainer v1.2.4
6.	Unit Testing Framework: Cucumber Junit v1.2.5, TestNG v6.10 & Maven Surefire plugin v2.19.1
7.	Compiler: Maven Compiler v3.3
8.	Build Tool: Maven
9.	Reporting: Maven Cucumber Reporting plugin v2.8.0
10.	Version Control: Github

Environment Setup:
==============
1.	Download and Install IntelliJ IDEA
2.	Download JAVA v1.8 and set environment variables
3.	Clone my project using below Github link:
        - https://github.com/MohammedRasool/VoiceWorksSeleniumCucumberJavaFramework.git
4.	Open up IntelliJ IDEA
5.	Open my project
6.	Install Maven dependencies (Maven should request this after import, then click on “Import Changes”)
7.  Run the 'TestRunner.class' (VoiceworksSeleniumCucumberJavaFramework\src\test\java\StepDefinition\TestRunner.java)
8.  This will execute all Test scenarios and report can be viewed on the IDEs console.
9.  For better Cucumber reporting, execute Maven goal 'verify' (this can be done either by IntelliJ IDEA's build-in Maven plugin OR through CMD if you have Maven installed on your PC). I have set the Maven goal verify to invoke the “Maven Cucumber Reporting” plugin to generate a detailed report after the test have completed running.
10. After the tests have run, go to "VoiceworksSeleniumCucumberJavaFramework\target\cucumber-report-html\cucumber-html-reports\ComputerDatabaseScenarios-feature.html" to view a detailed report of the run.

Automated Scenarios:
==============
I automated 3 Functional test cases from the test case document:
1. TC_F_03: Add a new computer
2. TC_F_05: Filter by computer name (No additional test for this. It is already covered by other tests.)
3. TC_F_09: Delete a computer