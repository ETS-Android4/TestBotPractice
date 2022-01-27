package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.ftcrobotcontroller;

@TeleOp
public class TankDrive extends OpMode {

    DcMotor motorFrontLeft, motorFrontRight, motorBackLeft, motorBackRight;

    @Override
    public void init() {
        motorFrontLeft = hardwareMap.dcMotor.get("FL");
        motorBackLeft = hardwareMap.dcMotor.get("BL");
        motorFrontRight = hardwareMap.dcMotor.get("FR");
        motorBackRight = hardwareMap.dcMotor.get("BR");
        //declaring

        motorFrontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackRight.setDirection(DcMotorSimple.Direction.REVERSE);
        //setting right motors to be negative (so both sides run same direction)
    }

    @Override
    public void loop() {
    motorFrontLeft.setPower(-gamepad1.left_stick_y);
    motorBackLeft.setPower(-gamepad1.left_stick_y);
    motorFrontRight.setPower(-gamepad1.right_stick_y);
    motorBackRight.setPower(-gamepad1.right_stick_y);
    }
}

