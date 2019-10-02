Defintions
Analog - Variable that changes constantly and has many values
Digital - Variable that changes less and has certain values
Identifier - The upper level variable, usually refers to controllers but can also be telemetry, etc.
Encoders - Motors have a built in algorithm to be able to track distance, allowing one to specify the distance a motor should travel
Debugging - To encounter a problem within your program, identify where in the code is it flawed, and figuring out how to fix the code

General Variables
int // a whole number 
can be 0, 1, -3, 27, -49
float // a whole or decimal number
can be 0, 1, -3, 27, -49, 33.2, 0.2, -4.7
boolean // 2 values, 1 or 0, true or false
can be true, false, 0, 1


____
AUTON

waitForStart() // used for Auton, program does not read past these point unless you press start on the phone
telemetry.addData("name", x) // used to set data on phone, x is a variable, can be a controller value, a number, a phrase
telemetry.update() // used to read data on phone, can't see changes to data otherwise even if you use addData
motorName.setMode(DcMotor.RunMode.RUN_USING_ENCODER); // tells program that encoders should be active
motorName.setMode(DcMotor.RUnMode.STOP_AND_RESET_ENCODER); // encoders current position becomes the neutral position to base off of
motorName.setDirection(DcMotor.Direction.REVERSE); // Rotations are reversed, where 1 is clockwise
motorName.setDirection(DcMotor.Direction.FORWARD); // Rotations are normal, where 1 is counterclockwise

Examples:
telemetry.addData("Stage", "forward1") // in the name "Stage", the value held is "forward1"
telemetry.update() // its good to know what code the program is reading at the moment, and whether it was even read at all in the chance that an expected telemetry update did not happen
telemtry.addData("Stage", "forward1DONE") // in the name "Stage, the value held is now "forward1DONE"
telemtry.update() // now i know that all the code where i put my telemtry.addData line has been read. or if it was not read, it would help me with debugging


____
TELEOP

Variables (usually values from the controller)

How to format:
Identifier.Value // define the identifier and the value within that identifier

Identifier (I think that's that name?)
gamepad1 // looks for the value in controller 1
gamepad2 // looks for the value in controller 2

Values:
Analog
right_stick_x // an int between 0 and 1
right_stick_y // an int between 0 and 1
left_stick_x // an int between 0 and 1
left_stick_y // an int between 0 and 1

Digital/Static
right_bumper // an int, 0 or 1 (can be between 0 and 1 if our controllers are analog)
left_bumper // an int, 0 or 1
x // a boolean, either you press it (true) or not (false)
y // a boolean, true or false
a // a boolean, true or false
b // a boolean, true or false
start // a boolean, true or false
back // a boolean, true or false
dpad_up // a boolean, true or false
dpad_right // a boolean, true or false
dpad_down // a boolean, true or false
dpad_left // a boolearn, true or false

Examples:
gamepad1.right_stick_x // looks in controller 1, looks at right stick's horizontal state
if (Math.abs(gamepad1.right_stick_x) > .1) // checks if the absolute value of gamepad1.right_stick_x is greater than .1. in other words, the statement becomes true if you move the stick left or right
gamepad2.a // looks in controller 2, looks at button a's state
if (gamepad2.a) // checks if the value of gamepad2.a is 1, or true. in other words, the statement becomes true if you press a


___
GENERAL

sleep(ms) // ms is an int
motorName.setPower(p) // p is a float number between -1 and 1, as speed, 1 is counterclockwise
servoName.setPosition(p) // p is an int between 0 and 180, as degrees
