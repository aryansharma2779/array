package faltu;

import java.util.Date;

public class array {



    public static void main(String[] args) {
        Date[] d=new Date[10];

        for(int i=0;i<10;i++)
        {
        d[i]=new Date(2005-1900,12-1,i+1);

        }

        for (Date date : d) {

            System.out.println(date);
        }
    }


}
