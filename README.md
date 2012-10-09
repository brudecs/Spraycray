## Contents

* **Manager**
	- All managers extend this class (screen manager, background manager, etc.


* **InfoBar**
	- Contains score (Uses ScoreManager to get score)
	- How many lives (?) <---- address -------
	- How many points


* **SprayScreen**
	- Displays the tag


* **SprayPath (David added this - feel free to edit) - works with ScoreManager   <---- address ------**
	- Handles the path the user makes with finger
	- Checks to see if path user made is correct within threshold
	- Creates point value based on how well the user did


* **Sprite**
	- Loads character and handles its animation
 	- Keeps track of its own position on screen <----- address --------


* **ScoreManager**
	- Keeps track of score
	- Adds/Subtracts points from score when necessary 


* **WindowRenderer**
	- WindowRenderer starts when the game starts <------ address what we mean by "game -----
	- Renders non-static images


* **Tag (is Tag ok or should it be something like TagInfo? ) <--- address what the "Tag" is. Is it the users path, the image? both? --**
	- Holds information about the Tag


* **Menu (Maybe MenuManager?)**
	- Class that represents GUI of main menu
	- Allows user to "start the game"
	- Any settings/handicap would go here


* **Background (Maybe BackgroundManager)**
	- Handles scrolling of background images
	- Keeps track of position of background images


* **GameInitializer**
	- Instantiate Objects
	- Load resources
	- Loads menu