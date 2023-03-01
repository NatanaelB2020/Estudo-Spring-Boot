package com.natanestudo.EstudoSpringBoot.Entity;

public class Greenting {

    private final long id;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    private final String content;


    public Greenting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
