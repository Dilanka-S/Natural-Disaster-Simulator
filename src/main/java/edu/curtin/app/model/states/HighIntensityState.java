package edu.curtin.app.model.states;

import edu.curtin.app.datacontroller.EmergencyController;
import edu.curtin.app.datacontroller.emergencies.EmergencySimulator;

public class HighIntensityState implements EmergencyState{
    //current state
    //set current state to below methods
    private EmergencySimulator emergencySimulator;

    public HighIntensityState(EmergencySimulator emergencySimulator) {
        this.emergencySimulator = emergencySimulator;
    }


    @Override
    public void idle(EmergencyController emergencyController) {

    }

    @Override
    public void running(EmergencyController emergencyController) {

    }

    @Override
    public void high_Intensity(EmergencyController emergencyController) {
    }

    @Override
    public void low_Intensity(EmergencyController emergencyController) {
        emergencySimulator.setState(new LowIntensityState(emergencySimulator));
    }

    @Override
    public void cleaned_Up(EmergencyController emergencyController) {

    }

}
