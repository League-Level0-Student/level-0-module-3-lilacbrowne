int a = 250;
int b = 250;

void setup(){
  size(700,300);
}
  void draw (){
    int a = 250;
    int b = 250;
for(int i = 0; i < 26; i++){  
 noFill();
  a = a - 10;
  b = b - 10;

  ellipse(150,150,a,b); 
} 
 a = 250;
 b = 250;
  for(int i = 0; i < 26; i++){  
 noFill();
  a = a - 10;
  b = b - 10;
 
  ellipse(550,150,a,b); 
}
  
  }