package number_shapes.com;

public class Number {

  private int number;


    public Number(int number) {
        this.number = number;
    }

    public boolean isTriangular(){
         int x =1;
         int triangularNumber =1;
         while(triangularNumber < number){
             x++;
             triangularNumber += x;

         }
         if(triangularNumber == number){
             return true;
         }else{
             return false;
         }
   }


    public boolean isSquare(){
        double squareNumber = Math.sqrt(number);
        if(squareNumber == Math.floor(squareNumber)){
            return true;
        }else{
            return false;
        }
    }



    public int getNumber() {
        return number;
    }


}
