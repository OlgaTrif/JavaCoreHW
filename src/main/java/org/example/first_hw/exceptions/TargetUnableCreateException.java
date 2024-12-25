package org.example.first_hw.exceptions;

import java.nio.file.FileSystemException;

public class TargetUnableCreateException extends FileSystemException {

    public TargetUnableCreateException(String file) {
        super(file);
    }

    public TargetUnableCreateException(String file, Throwable cause) {
        super(file);
        this.initCause(cause);
    }
}