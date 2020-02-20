#!/bin/sh
cd src/java
javac -cp lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar *.java
cd ../../test/java
java -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar
org.junit.runner.JUnitCore EdgeConnectorTest
cd ../../src/java
java RunEdgeConvert
mv *.class ../../build/

