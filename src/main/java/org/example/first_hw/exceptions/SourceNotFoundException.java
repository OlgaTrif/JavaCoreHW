package org.example.first_hw.exceptions;

import java.nio.file.FileSystemException;

public class SourceNotFoundException extends FileSystemException {

    public SourceNotFoundException(String file) {
        super(file);
    }
}