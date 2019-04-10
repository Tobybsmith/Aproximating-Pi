int radius = 100;
double inside = 0;
double outside = 0;
double total = 0;
double pi = 0;

Point origin = new Point();


void setup()
{
  origin.x = width/2;
  origin.y = height/2;
  size(200, 200);
  background(255);
}

void draw()
{
  for (int i = 0; i < 100; i++)
  {
    Point p2 = new Point();
    p2.x = random(0, width);
    p2.y = random(0, height);
    noStroke();
    if (distToPoint(origin, p2) >= 100)
    {
      p2.show(p2, #FF0000);
      outside++;
      total++;
    } else
    {
      p2.show(p2, #00FF00);
      inside++;
      total++;
    }

    if (inside > 1 && outside > 1)
    {
      pi = 4*(inside/total);
    }
    if (total%100 == 0)
    {
      println(pi);
    }
  }
}
double distToPoint(Point p1, Point p2)
{
  double c = (Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2)));
  return c;
}