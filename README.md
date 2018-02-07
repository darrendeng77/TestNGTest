# TestNGTest
testng automation project

This guide is for set up the TestNG Maven environment on a windows laptop

Java
1.download JDK from http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Choose windows x64 if you have 64 bit machine.
Once downloaded exe file, install them
2.in environment variable, set JAVA_HOME as C:\Program Files\Java\jdk{Your JDK version}
3.in the path, add %JAVA_HOME%\bin
4.in CMD, try to type java and hit enter, see if the system recognized java.

Eclipse
Eclipse is the IDE to develop program in JAVA
1.download latest eclipse from https://www.eclipse.org/downloads/download.php?file=/oomph/epp/oxygen/R2/eclipse-inst-win64.exe
2.you have to make sure install JDK before install Eclipse 

Maven
Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.
1.down maven from here
https://maven.apache.org/download.html
2.once unzip the package, and copy the path C:\{your maven path in local}
3.in the environment variable set MAVEN_HOME and value as  C:\{your maven path in local}
4.in the path, add %MAVEN_HOME%\bin
5.in cmd, type in command mvn to make sure it works

Github
1.set up a telus digital github account
2.install git on the pc, git can be downloaded from https://git-scm.com/downloads\
3.You can also download the git gui sourcetree https://www.sourcetreeapp.com/ 
3.clone this project https://github.com/darrendeng77/TestNGTest
4.import this project in the eclipse. Once imported, eclipse will do the compile automatically.



