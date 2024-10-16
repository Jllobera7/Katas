public class Kata {
    public static int snail(int column, int day, int night) {
      int height = 0;
      int days = 0;
      while (height < column){
        days = days +1;
        height = height + day;
        
        if ( height >= column){
          return (days);
          }
      height = height - night;
      }
        return (days);
      
        
    }
}
