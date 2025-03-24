// create class HeartPatternExample1 that will print Heart pattern  
public class wish
{  
    // main() method start  
    public static void main(String[] args)  
    {  
        // declare and initialize variable for output size  
        final int size = 5;  
        final String msg = " Happy birthday to u ";  
          
        // nested for loop to print the upper part of Heart  
        for (int m = 0; m < size; m++) {  
            for (int n = 0; n <= 5 * size; n++) {  
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 4 * size, 2));  
   
                if (pos1 < size + 1|| pos2 < size + 1) {  
                    System.out.print('*');  
                } else {  
                    System.out.print(' ');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
          
        // for loop to print the lower part of Heart  
        for (int m = 1; m <= 3* size; m++) {  
            for (int n = 0; n < m; n++) {  
                System.out.print(' ');  
            }  
   
            for (int n = 0; n < 5 * size + 1 - 2 * m; n++) {  
                if (m >= 2 && m <= 5) {  
                    int position = n - (5 * size - 2 * m - msg.length()) / 2;  
                    if (position < msg.length() && position >= 0) {  
                        if (m == 3) {  
                            System.out.print(msg.charAt(position));  
                        } else {  
                            System.out.print(' ');  
                        }  
                    }  
                    else {  
                        System.out.print('*');  
                    }  
                }  
                else {  
                    System.out.print('*');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
    }  
}