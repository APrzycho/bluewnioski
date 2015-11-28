package com.artur.blue.applications.services;

/**
 * Created by Artur on 2015-11-28.
 */
public class ApplicationContext {
    private ApplicationState state;

    public ApplicationContext(){
        state = new CreateState();
    }

    public void setState(ApplicationState newState){
        // log change state and save it in history
        this.state = newState;
    }

    public void process(){
        this.state.process(this);
    }
}
