 int a = 90;
 int b = 90; 
void setup() {
  
for(int i = 0; i < 10; i++) {
  
 
a = a - 10;
b = b - 10;
if((i % 2 ) == 0) {
  fill(255,0,0);
} else {
  fill(0,0,0);
}
  ellipse(50, 50, a, b );

}}