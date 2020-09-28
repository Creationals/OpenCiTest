package com.joost.testing.opencitest.demo;

public interface PropulsionSource {
    void start();
    void stop();
    void setThrottle(int percentage);
    int getRpm();
}
