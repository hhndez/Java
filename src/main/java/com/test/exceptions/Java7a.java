package com.test.exceptions;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by hhernandez on 21/09/15.
 */
public class Java7a {

    public static void main(String... args) {

        try(Conexion c = new Conexion()) {
            c.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (PoorConexion conexion = new PoorConexion()) {
            conexion.doSomethingElse();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Conexion implements java.lang.AutoCloseable {
    @Override
    public void close() {

    }

    public void doSomething() throws IOException {

    }
}

class PoorConexion implements Closeable {

    @Override
    public void close() throws IOException {

    }

    public void doSomethingElse() {

    }
}