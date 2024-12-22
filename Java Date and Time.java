import java.io.*;

class Result{


    public static String findDay(int month,int day,int year){
        if(month < 3){
            month += 12;
            year -= 1;
        }

        int years=year % 100;
        int cyears=year / 100;
        int h =(day +(13 *(month + 1)) / 5 + years +(years / 4) +(cyears / 4) - 2 * cyears) % 7;

        if(h < 0){
            h += 7;
        }

        String[] weekday ={"SATURDAY","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
        return weekday[h];
    }
}

public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput=bufferedReader.readLine().replaceAll("\\s+$","").split(" ");

        int month=Integer.parseInt(firstMultipleInput[0]);
        int day=Integer.parseInt(firstMultipleInput[1]);
        int year=Integer.parseInt(firstMultipleInput[2]);

        String res=Result.findDay(month,day,year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
