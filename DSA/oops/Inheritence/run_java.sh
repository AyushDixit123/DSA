#!/bin/bash
if [ "$#" -ne 2 ]; then
    echo "Usage: $0 <JavaFile.java> <ClassName>"
    exit 1
fi
# Define the Java source file
JAVA_FILE=$1
# Define the class name (should match the public class name in the Java file)
CLASS_NAME=$2

# Compile the Java source file
javac $JAVA_FILE

# Check if the compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful, running the program..."
    # Run the compiled Java class
    java $CLASS_NAME
else
    echo "Compilation failed."
fi

