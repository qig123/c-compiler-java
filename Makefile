CFLAGS=-std=c11 -g -static
PROJECT_PATH=/home/guo/javaplay/w1
JAR_PATH=$(PROJECT_PATH)/app/libs
BIN_PATH=$(PROJECT_PATH)/app/bin
SRC_PATH=$(PROJECT_PATH)

9cc:
	rm -f $(SRC_PATH)/sources.list
	find $(SRC_PATH)/ -name *.java > $(SRC_PATH)/sources.list
	javac -classpath :$(JAR_PATH)/* @$(SRC_PATH)/sources.list -d $(BIN_PATH)

test: 9cc
	./test.sh

clean:
	rm -f 9cc *.o *~ tmp*

.PHONY: test clean