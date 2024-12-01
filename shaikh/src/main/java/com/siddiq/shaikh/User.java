package com.siddiq.shaikh;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("user_name") // JSON property name: user_name
 String userName;

    String email;

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
