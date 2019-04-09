import std.stdio, std.math;
void main()
{
  int N = 0;
  readf("%d", &N);
  real pi = 0;
  real denom = 1.0;
  for(int i = 0; i < N; i++)
  {
    if(i%2 == 0)
    {
      pi = pi - (1.0/denom);
      denom = denom + 2.0;
    }
    else
    {
      pi = pi + (1.0/denom);
      denom = denom + 2.0;
    }
  }
  pi = pi*4.0;
  writeln(abs(pi));
}
