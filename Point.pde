class Point
{
  float y;
  float x;
  
  
  void show(Point p1, color c)
  {
    fill(c);
    ellipse(p1.x, p1.y, 2, 2);
  }
}