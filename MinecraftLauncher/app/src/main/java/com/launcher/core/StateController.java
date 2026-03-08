package com.launcher.core;

public class StateController {
    public enum State { IDLE, DOWNLOADING, EXTRACTING, READY, RUNNING }
    private State currentState = State.IDLE;

    public void setState(State state) {
        this.currentState = state;
        // Update UI based on state
    }

    public boolean canLaunch() {
        return currentState == State.READY;
    }
}
