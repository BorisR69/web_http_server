package ru.netology;

import java.io.BufferedOutputStream;

@FunctionalInterface
public interface Handler<Request> {

    void handle(Request request, BufferedOutputStream responseStream);
}
