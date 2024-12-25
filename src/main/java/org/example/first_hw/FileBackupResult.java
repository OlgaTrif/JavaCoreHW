package org.example.first_hw;

public record FileBackupResult(String filePath, CopyStatus copyStatus, String details) {
}
