int a = 255;
boolean theMouseWasPressed = false;

void setup() {
  size(800,800);
}
void draw() {  
  if(theMouseWasPressed)
  a -= 3;
  background(123, 198, 0);
  noStroke();

fill(17, 52, 192, a); 
rect(50, 70, 100, 90);

}
void mousePressed() {
   theMouseWasPressed = true; 
}