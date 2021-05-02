package homework17april2021;

class DowhileOddEven {
        public static void main (String args[]){
            int num=10;
            int i=0;

            System.out.print("Even numbers are:");
            do{
                System.out.print(i+" ");
                i+=2;
            }while(i<=num);

            System.out.print("\n\nOdd numbers are:");
            i=1;
            do{
                System.out.print(i+" ");
                i+=2;
            }while(i<=num);
        }
    }

