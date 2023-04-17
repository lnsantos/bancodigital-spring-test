package com.zupedu.bancodigital.model.output;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UserInterestOutput {
    private String message;
    private String protocol;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public UserInterestOutput(String message, String protocol) {
        this.message = message;
        this.protocol = protocol;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}
