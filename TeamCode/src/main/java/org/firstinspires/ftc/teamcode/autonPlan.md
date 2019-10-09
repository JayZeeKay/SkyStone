## Auton plan for the FTC 2019 SkyStone challenge:

Format:
* The autonomous program is named by the closest corner; 
placing the robot near the foundation on the red bridge side means that the program name is "Red Triangle". (or some other name if there are better subsitutes.
* Before start of autonomous; what needs to be done before autonomous is run to make sure it works properly
* Autonomous: Action, robot coordinates (by the foam tiles) after action, robot facing what direction, robot state after action
  * for coordinates, bottom left corner on official field overhead view is (1, 1) to show what tile it's on 

## Blue Square:

Before start of Autonomous:
* Place Robot on seam / Place robot parallel to last stone block, on right side. 
* Make sure the slides are upright; change this manually beforehand
* Intake is set to open position (maybe can be done during autonomous, does not hamper movement)

Autonomous:
* Move forward 35 inches
  * approaching block
  * (5, 1) west
* Grab the block; close intake
  * block is held
* Move backwards 25 inches
  * align with alliance bridge
  * (5.5, 1)
* Pivot turn right approx 90 degrees right 
  * now facing alliance bridge
  * north
* Lower pivot slides 
  * robot is lowered to fit under bridge
* Move forward 53 inches
  * at other side of bridge
  * (5.5, 5.5)
* Raise pivot slides
  * prepare to drop element
* Raise lift 
  * element raised above foundation
* Let go of block; open intake
  * drop element into foundation
* Lower pivot slides
  * prepare to go under bridge
* Go backwards 24 inches
  * under bridge to score points
  * (5.5, 3.5)
  
End state:
* Robot is facing north at (5.5, 3.5)

## Red Square:

Before start of autonomous:
* Place robot on seam / Place robot parallel to last stone block on the left side.
* Make sure the slides are upright; change this manually beforehand
* Intake is set to open position

Autonomous:
* Move forward 35 inches
  * approaching block
  * At: (2, 2) east
* Grab the block; close intake
  * block is held
* Move backwards 25 inches
  * allign with alliance bridge
  * (2, 1.5)
* Pivot turn approx 90 degrees left
  * now facing alliance bridge
  * north
* Lower pivot slides
  * robot is lowered to fit under bridge
* Move forward 53 inches 
  * at other side of bridge
  * (1.5, 5.5)
* Raise pivot slides
  * prepare to drop element
* Raise lift
  * element raised above foundation
* Let go of block; open intake 
  * drop element into foundation
* Lower lift
  * prepare to go under bridge 
* Lower pivot slides
  * prepare to go under bridge



