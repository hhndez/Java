package com.test.exceptions;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by hhernandez on 21/09/15.
 */
public class Java7 {

    public static void main(String ...args) throws Exception {

        try {
            test();
//        } catch (IOException | SQLException e) {
//            e = new IOException();
//        }
        } catch (Exception e) {
            e = new IOException();
            throw e;
        }


        //Recurso se declara afuera para que el bloque finally lo vea.
        Connection conn = null;
        try {
        } finally {
            if (conn != null) {

            }
        }
    }

    private static void test() throws IOException, SQLException {

    }
}

