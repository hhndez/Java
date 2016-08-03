package com.samples;

/**
 * Created by Optiplex on 25/07/16.
 */
public class SynchronizedSample {

    Integer i = 0;
    Integer j = 0;

    //Solucion 1
    /*
    public double divide() {
        synchronized (i,j) {
            return (i/j);

        }
    }
    public void set(int i, int j) {
        synchronized (i,j) { this.i = 0; this.j = j;
    }*/

    //So9lucion 2
    /*
    public double divide() {
        synchronized (i) {
            return (i/j);
        }
    }
    public void set(int i, int j) {
        synchronized (j) {
            this.i = i;
            this.j = j;
        }
    }*/

    public double divide(){
        synchronized(this) {
            return (i/j);
        }
    }

    public void set(int i, int j) {
        synchronized (this){
            this.i = i;
            this.j = j;
        }
    }
}
