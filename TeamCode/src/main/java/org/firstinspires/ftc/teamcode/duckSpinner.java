package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class duckSpinner {

    private DcMotor duck;
        boolean yHeld;

    public duckSpinner(HardwareMap map) {
        duck = map.get(DcMotor.class, "duck");
        duck.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void spin(double power){
        duck.setPower(power);
    }

    public void right (){
        duck.setPower(-0.2);
    }

    public void left () {
        duck.setPower(0.2);
    }

}
