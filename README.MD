# Java Lab 1: File Hashing
***
# Description
This program has an opportunity to hash contents of selected files by md5 or sha256. It works in interactive and manual modes.
1. Interactive mode
    In this mode user can do several times hashing files by md5 or sha256.
2. Manual mode
    In manual mode user choose the type of hash and put in the filename.
***
# How to compile
You can do in in terminal:
```
cd /Users/fedorg/IdeaProjects/WebLab1/src
javac -classpath lib/commons-codec-1.13.jar *.java
jar cfm test.jar MANIFEST.MD *.class
```
You can run: ``` ./Compile.sh ``` if your system allows scripts.
***
# How to use
Write in terminal, if you want to run interactive mode:
```
java -jar test.jar -i
```
And this command, if you want to run manual mode (instead flag ```-md5``` user can use ```-sha256```)
```
java -jar test.jar -md5 -f /Users/fedorg/Downloads/images.jpeg
```
