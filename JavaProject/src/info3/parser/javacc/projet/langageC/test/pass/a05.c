ALGORITHM(a05){
  int x;
  int y;
  x=y+1;
  while(x>0){
    if (x!=y){
      return x;
    } else { 
      y++;
    }
    x+=y;
  }
  return x;
}