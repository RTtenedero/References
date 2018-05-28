color S = color(37, 37, 206);
float x = 0;
float y = 100;
float speed = 1;

void setup(){
  size(400, 400);
}
void draw() {
  background(#8D1C1C);
  move();
  display();
}

void move() {
  x= x + speed;
  if (x > width) {
    x = 0;
  }
}

void display() {
  noStroke();
  fill(S);
  ellipse(x,y,50,50);
}
