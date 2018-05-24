
int x, y, left, right, top, bottom, w, h;


void setup() {
  size(600,600);
  rectMode(CENTER);
  x = width/2;
  y = height/2;
  w = 200;
  h = 75;
  left = x - (w/2);
  right = x + (w/2);
  top = y - (h/2);
  bottom = y + (h/2);
  
  
}

void draw() {
  background(255);
  fill(233, 43, 125);
  if (mouseX > left && mouseX < right) {
    // if (y value of point > top and y-point < bottom)collision;
    if (mouseY > top && mouseY <bottom){
    fill(198, 200, 32);
    }
  }
  
  rect(x, y, w, h);
}
