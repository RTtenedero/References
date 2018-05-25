ArrayList <Bullet> bullets;//where our bullets will be stored
 
void setup()
{
  size(800,800);
  bullets = new ArrayList();
}
void draw()
{
  background(0);
  removeToLimit(100);//some other code that removes bullets if there are too many on screen
  moveAll();//move all the bullets
  displayAll();//display all the bullets
}
class Bullet//bullet class
{
  float x;
  float y;
  float speed;
  Bullet(float tx, float ty)
  {
    x = tx;
    y = ty;
  }
  void display()
  {
    stroke(255);
    point(x,y);
  }
  void move()
  {
    y -= 0.5;
  }
}
 
void removeToLimit(int maxLength)
{
  while(bullets.size() > maxLength)
  {
    bullets.remove(0);
  }
}
void moveAll()
{
  for(Bullet temp : bullets)
  {
    temp.move();
  }
}
void displayAll()
{
  for(Bullet temp : bullets)
  {
    temp.display();
  }
}
void mousePressed()//add a new bullet if mouse is clicked
{
  Bullet temp = new Bullet(mouseX,mouseY);
  bullets.add(temp);
}
