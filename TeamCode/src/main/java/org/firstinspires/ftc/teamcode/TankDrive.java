package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.Hardware.duckSpinner;
//import com.qualcomm.ftcrobotcontroller;

@TeleOp(name="gcOp", group="")
public class TankDrive extends OpMode {

    DcMotor motorFrontLeft, motorFrontRight, motorBackLeft, motorBackRight;
    private duckSpinner spinner;

    @Override
    public void init() {
        motorFrontLeft = hardwareMap.dcMotor.get("FL");
        motorBackLeft = hardwareMap.dcMotor.get("BL");
        motorFrontRight = hardwareMap.dcMotor.get("FR");
        motorBackRight = hardwareMap.dcMotor.get("BR");
        //declaring

        spinner = new duckSpinner(hardwareMap);

        motorFrontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackRight.setDirection(DcMotorSimple.Direction.REVERSE);
        //setting right motors to be negative (so both sides run same direction)
    }

    @Override
    public void loop() {
        motorFrontLeft.setPower(gamepad1.left_stick_y);
        motorBackLeft.setPower(gamepad1.left_stick_y);
        motorFrontRight.setPower(gamepad1.right_stick_y);
        motorBackRight.setPower(gamepad1.right_stick_y);


            motorFrontLeft.setPower(gamepad1.left_trigger);
            motorBackLeft.setPower(-gamepad1.left_trigger);
            motorFrontRight.setPower(-gamepad1.left_trigger);
            motorBackRight.setPower(gamepad1.left_trigger);


            motorFrontLeft.setPower(-gamepad1.right_trigger);
            motorBackLeft.setPower(gamepad1.right_trigger);
            motorFrontRight.setPower(gamepad1.right_trigger);
            motorBackRight.setPower(-gamepad1.right_trigger);

            spinner.spin(gamepad2.left_stick_y * 0.5);

    }

}

