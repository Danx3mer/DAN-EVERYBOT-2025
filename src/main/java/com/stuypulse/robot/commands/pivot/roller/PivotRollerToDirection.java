package com.stuypulse.robot.commands.pivot.roller;

import com.stuypulse.robot.subsystems.pivot.Pivot;

import edu.wpi.first.wpilibj2.command.Command;

public class PivotRollerToDirection extends Command{
    private Pivot pivot;
    private double pivotRollerSpeed;

    public PivotRollerToDirection(double pivotRollerSpeed) {
        pivot = Pivot.getInstance();
        this.pivotRollerSpeed = pivotRollerSpeed;

        addRequirements(pivot);
    }

    public void initialize() {
        pivot.setRollerMotor(pivotRollerSpeed);
    }
}
