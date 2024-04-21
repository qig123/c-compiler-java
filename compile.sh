#!/bin/sh
PROJECT_PATH=/home/guo/javaplay/w1
JAR_PATH=$PROJECT_PATH/app/libs
BIN_PATH=$PROJECT_PATH/app/bin
SRC_PATH=$PROJECT_PATH
rm -f $SRC_PATH/sources.list
find $SRC_PATH/ -name *.java > $SRC_PATH/sources.list
javac -classpath :$JAR_PATH/* @$SRC_PATH/sources.list -d $BIN_PATH
java -classpath $BIN_PATH:$JAR_PATH/* core.App
