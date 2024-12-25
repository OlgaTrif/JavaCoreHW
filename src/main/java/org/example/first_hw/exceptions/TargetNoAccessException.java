package org.example.first_hw.exceptions;

import java.nio.file.AccessDeniedException;

public class TargetNoAccessException extends AccessDeniedException {

    public TargetNoAccessException(String file) {
        super(file);
    }
}
