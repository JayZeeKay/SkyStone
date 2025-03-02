package org.firstinspires.ftc.robotcontroller;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

// put encoder method before the runOpMode

@Autonomous (name= "Auto_PR")
public class Auto_PR extends LinearOpMode {
    public DcMotor frontRight;
    public DcMotor frontLeft;
    public DcMotor backRight;
    public DcMotor backLeft;
    public DcMotor liftRight;
    public DcMotor liftLeft;
    public DcMotor pivotRight;
    public DcMotor pivotLeft;
    public Servo rightT;
    public Servo leftT;
    public Servo intake;

    @Override
    public void runOpMode() throws InterruptedException {
        frontRight = hardwareMap.dcMotor.get("frontRight");
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        liftRight = hardwareMap.dcMotor.get("liftRight");
        liftLeft = hardwareMap.dcMotor.get("liftLeft");
        pivotRight = hardwareMap.dcMotor.get("pivotRight");
        pivotLeft = hardwareMap.dcMotor.get("pivotLeft");
        rightT = hardwareMap.servo.get("rightT");
        leftT = hardwareMap.servo.get("leftT");
        intake = hardwareMap.servo.get("intake");

        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        pivotLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        
        goForward(.4,.4,1000);
        goBackward(1,1,1000);
        strafeLeft(1,1,1000);
        strafeRight(1,1,1000);
    }

    public void encoders (double inches, double leftPower, double rightPower){
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        RightWheel.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        int leftTickGoal = LeftWheel.getCurrentPosition () + (int) (TICKS_PER_IN * inches);
        int rightTickGoal = RightWheel.getCurrentPosition() + (int) (TICKS_PER_IN * inches);
        LeftWheel.setTargetPosition(leftTickGoal);
        RightWheel.setTargetPosition(rightTickGoal);

        while( Math.abs(LeftWheel.getCurrentPosition()) < leftTickGoal || Math.abs(RightWheel.getCurrentPosition()) < rightTickGoal)
        {
           
            LeftWheel.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            RightWheel.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            RightWheel.setPower(rightPower);
            LeftWheel.setPower(leftPower);
            LeftWheel2.setPower(LeftWheel.getPower());
            RightWheel2.setPower(RightWheel.getPower());
            telemetry.addData("Left Enc ", LeftWheel.getCurrentPosition());
            telemetry.addData("Right Enc ", RightWheel.getCurrentPosition());
            updateTelemetry(telemetry);
            telemetry.update();
        }
        LeftWheel.setPower(0);
        RightWheel.setPower(0);
        LeftWheel2.setPower(0);
        RightWheel2.setPower(0);



    }

    public void goForward (double leftPower, double rightPower, int millisecends){
        frontRight.setPower(rightPower);
        frontLeft.setPower (leftPower);
        backRight.setPower(rightPower);
        backLeft.setPower(leftPower);
        sleep(millisecends);
    }

    public void goBackward (double leftPower, double rightPower, int milliseconds){ 
        frontRight.setPower(rightPower);
        frontLeft.setPower (leftPower);
        backRight.setPower(rightPower);
        backLeft.setPower(leftPower);
        sleep(milliseconds);
    }
     
    public void encoders (double inches, double leftPower,double rightPower){
        frontRight.setPower(rightPower);
        frontLeft.setPower (leftPower);
        backRight.setPower(rightPower);
        backLeft.setPower(leftPower);
    }
    
    public void strafeRight (double leftPower, double rightPower, int milliseconds){
        frontRight.setPower(-rightPower);
        frontLeft.setPower (leftPower);
        backRight.setPower(rightPower);
        backLeft.setPower(-leftPower);
        sleep (milliseconds)
    }
    
    public void strafeLeft (double leftPower, double rightPower, int milliseconds){
        frontRight.setPower(rightPower);
        frontLeft.setPower (-leftPower);
        backRight.setPower(-rightPower);
        backLeft.setPower(leftPower);
        sleep(milliseconds);
    }
    
}
