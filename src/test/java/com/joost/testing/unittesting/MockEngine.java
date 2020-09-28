package com.joost.testing.unittesting;

import com.joost.testing.opencitest.demo.PropulsionSource;

public class MockEngine implements PropulsionSource {


    public int setThrottle_param = -1;
    public int getRpm_return = -1;

    public int start_calls = 0;
    public int stop_calls = 0;
    public int setThrottle_calls = 0;
    public int getRpm_calls = 0;

    @Override
    public void start() {
        start_calls++;
    }

    @Override
    public void stop() {
        stop_calls++;
    }

    @Override
    public void setThrottle(int percentage) {
        setThrottle_param = percentage;
        setThrottle_calls++;
    }

    @Override
    public int getRpm() {
        getRpm_calls++;
        return getRpm_return;
    }



}
