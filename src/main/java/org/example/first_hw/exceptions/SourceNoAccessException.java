package org.example.first_hw.exceptions;

import java.nio.file.AccessDeniedException;

public class SourceNoAccessException extends AccessDeniedException {

    public SourceNoAccessException(String file) {
        super(file);
    }
}
