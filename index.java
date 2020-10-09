int xPostion = 75;
int yPostion = 75;
int diameter = 50;

int xPostion2 = 350;
int yPostion2 = 75;
int diameter2 = 50;

int xPostion3 = 75;
int yPostion3 = 250;
int diameter3 = 50;

int xPostion4 = 350;
int yPostion4 = 250;
int diameter4 = 50;




void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

  background(255);
  stroke(0);
  fill(175);

ellipse(xPostion,yPostion,diameter,diameter);
  
ellipse(xPostion2,yPostion2,diameter2,diameter2);
 
ellipse(xPostion3,yPostion3,diameter3,diameter3);

ellipse(xPostion4,yPostion4,diameter4,diameter4);

}


