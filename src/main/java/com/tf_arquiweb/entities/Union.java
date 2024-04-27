package com.tf_arquiweb.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Union implements Serializable {
    private int caso_id;
    private int policia_id;

    public Union() {
    }

    public Union(int caso_id, int policia_id) {
        this.caso_id = caso_id;
        this.policia_id = policia_id;
    }

    public int getCaso_id() {
        return caso_id;
    }

    public void setCaso_id(int caso_id) {
        this.caso_id = caso_id;
    }

    public int getPolicia_id() {
        return policia_id;
    }

    public void setPolicia_id(int policia_id) {
        this.policia_id = policia_id;
    }
}
