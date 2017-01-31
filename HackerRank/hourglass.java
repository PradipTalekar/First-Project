import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int start_col=0, end_col=2, start_row=0, end_row=2, sum=0, temp=0, count=1;
        
        while(start_row<4){
        
            int i=start_row;
            for(int j=start_col; j <= end_col ; j++){
                temp += arr[i][j];
                temp += arr[i+2][j];
                if(count==2)
                temp += arr[i+1][j];
                count++;
            }
            if(temp>sum) sum=temp;
           count=1; temp=0;
           start_col++;
           end_col++;
           if(start_col>3){ start_col = 0;end_col=2;start_row++;}
        
        
        
         if(start_row>3){break;}
        }
        
        System.out.println(sum);
    }
}
