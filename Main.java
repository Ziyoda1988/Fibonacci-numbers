

class Main {
  public static void main(String[] args) {
   
     // TESTS 
      printFibonacci(25); //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368
      printFibonacci(8); //0 1 1 2 3 5 8 13
      printFibonacci(5); //0 1 1 2 3 
      printFibonacci(2); //0 1 
      }
 public static void printFibonacci(int x){
      // implement here
     int a = 0;
    int b = 1;
    for ( int i = 0; i < x; i++){ 
    System.out.print( a + " ");

    int sum = a + b;
    a = b;
    b = sum;
  }
   System.out.println();
 }


  }
