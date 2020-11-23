package com.behavioral.command;

import com.behavioral.command.operation.OpenTextFileOperation;
import com.behavioral.command.operation.SaveTextFileOperation;

/**
 * The command pattern encapsulates a request/action as a separate object, thereby letting us parameterize
 * other objects with different requests, queue or log requests, and support undoable operations.
 *
 * Invoker (TextFileOperationExecutor): knows how to execute a given command but doesn't know how the command has been implemented. It only knows the command's interface.
 *
 * Command classes (TextFileOperation): store all the information required for executing an action,
 * including the method to call, the method arguments, and the object (known as the receiver) that implements the method.
 *
 * Receiver (TextFile): performs a set of cohesive actions. It's the component that performs the actual action when the command's execute() method is called
 *
 * - Makes our code extensible as we can add new commands without changing existing code.
 * - Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
 * - Use the Command pattern when you want to implement reversible operations.
 */
public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        TextFile file = new TextFile("file1.txt");

        OpenTextFileOperation op1 = new OpenTextFileOperation(file);
        SaveTextFileOperation op2 = new SaveTextFileOperation(file);

        textFileOperationExecutor.executeOperation(op1);
        textFileOperationExecutor.executeOperation(op2);
    }
}
