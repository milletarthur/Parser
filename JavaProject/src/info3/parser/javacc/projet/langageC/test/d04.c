ALGORITHM(d04){
int X;
int d;
int f;
int T[N];
boolean present;
present = false;
d := 0;
f := N;
while(d<f){
  {}
  m := (d+f)/2;
  {}
  {}
  if(X==T[m]){ present:=true; return present; }
  else
    { if (X<T[m]){ f:=m-1; }
      else{
	if (X>T[m]){ d:=m+1; }
	else {}
      }
    }
 }
return present;
}
