ArrayList balls;
int ballWidth = 48;


void setup() {
  size(500, 500);
  smooth();
  noStroke();
  
  
  
  // Create an empty ArrayList
  balls = new ArrayList();
  
  // Start by adding one element
  balls.add(new Ball(width/2, 0, ballWidth));
}

void draw() {
  background(255);

  // With an array, we say balls.length, with an ArrayList, we say balls.size()
  // The length of an ArrayList is dynamic
  // Notice how we are looping through the ArrayList backwards
  // This is because we are deleting elements from the list  
  for (int i = balls.size()-1; i >= 0; i--) { 
    // An ArrayList doesn't know what it is storing so we have to cast the object coming out
    Ball ball = (Ball) balls.get(i);
    
    
    
    ball.display();
    
    /*
    if (ball.finished()) {
      // Items can be deleted with remove()
      balls.remove(i);
    }
    */
    
  }  
  
  
  
  
  addsource();
  
}



void addsource () {
  
  
  
   
  if(keyPressed==true){
    
     if (key == 'b' || key == 'n') {
       
     
      balls.add(new Ball(mouseX, mouseY, ballWidth));
      
    } else {
      
    }
    
    if(key == 'r'){
     if(balls.size()>0){ 
     
      balls.remove(0);
     } else {
       

       println("Nothing to delete!");
      
    }
  
  

}
  
  }
}
  
  
  
  
  
  



void mousePressed() {
  // A new ball object is added to the ArrayList (by default to the end)
  balls.add(new Ball(mouseX, mouseY, ballWidth));
}





//Class down here, not all of it is used. 


class Ball {
  
  float x;
  float y;
  float speed;
  float gravity;
  float w;
  float life = 255;
  
  Ball(float tempX, float tempY, float tempW) {
    x = tempX;
    y = tempY;
    w = tempW;
    speed = 0;
    gravity = 0.1;
  }
  
    void move() {
    // Add gravity to speed
    speed = speed + gravity;
    // Add speed to y location
    y = y + speed;
    // If square reaches the bottom
    // Reverse speed
    if (y > height) {
      // Dampening
      speed = speed * -0.8;
      y = height;
    }
  }
  
  boolean finished() {
    // Balls fade out
    life--;
    if (life < 0) {
      return true;
    } else {
      return false;
    }
  }
  
  void display() {
    // Display the circle
    fill(0,life);
    //stroke(0,life);
    ellipse(x,y,w,w);
  }
  
  
  
  
 
 
 
 
 
}  

