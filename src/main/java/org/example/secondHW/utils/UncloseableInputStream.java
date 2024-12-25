package org.example.secondHW.utils;

import java.io.FilterInputStream;
import java.io.InputStream;

public class UncloseableInputStream extends FilterInputStream {
    private UncloseableInputStream(InputStream in) {
        super(in);
    }
    @Override
    public void close() {
        // do nothing
    }
    public static InputStream wrap(InputStream inputStream) {
        return new UncloseableInputStream(inputStream);
    }
}
