## Auton plan for the FTC 2019 SkyStone challenge:

Format:
* The autonomous program is named by the closest corner; 
placing the robot near the foundation on the red bridge side means that the program name is "Red Triangle". (or some other name if there are better subsitutes.
* Before start of autonomous; what needs to be done before autonomous is run to make sure it works properly
* Autonomous: Action, robot coordinates (by the foam tiles) after action, robot state after action

## Blue Square:

Before start of Autonomous:
* Place Robot on seam / Place robot parallel to last stone block, on right side. 
* Make sure the slides are upright; change this manually beforehand
* Intake is set to neutral position (maybe can be done during autonomous, does not hamper movement)

Autonomous:
* Move forward 35 inches
  * approaching block
  * At: (5, 1)
* Grab the block; close intake
  * block is held
* Move backwards 25 inches
  * align with alliance bridge
  * At: (5.5, 1)
* Pivot turn right approx 90 degrees right 
  * now facing alliance bridge
* Lower pivot slides 
  * robot is lowered to fit under bridge
* Move forward 53 inches
  * at other side of bridge
  * At: (5.5, 5.5)
* Raise pivot slides
  * prepare to drop element
* Let go of block; open intake
  * drop element into foundation
* Lower pivot slides
  * prepare to go under bridge
* Go backwards 24 inches
  * under bridge to score points
  * At: (5.5, 3.5)
  
End state:
* Robot is facing north at (5.5, 3.5)

