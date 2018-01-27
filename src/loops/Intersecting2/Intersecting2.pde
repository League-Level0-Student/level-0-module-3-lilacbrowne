int a = 250;
int b = 250;
int x = 150;
int t = 550;
int s = 3;
void setup() {
  size(700, 300);
}
void draw () {

  background(153, 255, 255);
  int a = 250;
  int b = 250;
  for (int i = 0; i < 26; i++) {  
    noFill();
    a = a - 10;
    b = b - 10;

    ellipse(x + 1, 150, a, b);
  } 

  a = 250;
  b = 250;
  for (int i = 0; i < 26; i++) {  
    noFill();
    a = a - 10;
    b = b - 10;

    ellipse(t - 1, 150, a, b);
  }
  if (x > 700 || x < 0) {
   
    s = -s;
  } 
 
   t = t - s;
   x = x + s;

}