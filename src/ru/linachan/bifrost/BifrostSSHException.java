package ru.linachan.bifrost;

import java.io.IOException;

public class BifrostSSHException extends IOException {

    public BifrostSSHException(Throwable cause) {
        super(cause);
    }

    public BifrostSSHException(String message, Throwable cause) {
        super(message, cause);
    }

    public BifrostSSHException(String message) {
        super(message);
    }

    public BifrostSSHException() {}

}
