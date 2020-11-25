package com.patterns.behavioral.command;

import com.patterns.behavioral.command.operation.TextFileOperation;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
    // Invoker class can also store and queue commands
    // useful for macro recording or undo and redo functionality
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
