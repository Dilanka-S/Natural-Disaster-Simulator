package edu.curtin.app.model.states;

import edu.curtin.app.datacontroller.EmergencyController;

public class EndState implements EmergencyState{
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

    }

    @Override
    public void cleaned_Up(EmergencyController emergencyController) {

    }
}
