package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "config")
public class MessageProperties {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    private String keyVaultMessage;

public String getKeyVaultMessage() {
    return keyVaultMessage;
}

public void setKeyVaultMessage(String keyVaultMessage) {
    this.keyVaultMessage = keyVaultMessage;
}
}