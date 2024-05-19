package com.tf_arquiweb.dtos;

public class UsersDTO {
    private Long id;
    private String username;
    private String password;
    private Boolean enabled;

    public Long getIdUsuario() {
        return id;
    }

    public void setIdUsuario(Long idUsuario) {
        this.id = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
