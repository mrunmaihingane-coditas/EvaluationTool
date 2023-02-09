import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public class Q3 {
    public static void main(String args[]){
        LocalDate currentData = LocalDate.now();
        DayOfWeek dow = currentData.getDayOfWeek();
            String day = String.valueOf(dow).toLowerCase();

            String arr[] = {"monday", "tuesday","wednesday", "thursday", "friday", "saturday", "sunday"};

            for (int i =0; i<= arr.length; i++){
                if(arr[i]==day){
                    continue;
                }
                System.out.println(arr[i]);
            }
    }
}
// "C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=65174:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Coditas\IdeaProjects\EvalutionTool\out\production\EvalutionTool Q3
// monday
// tuesday
// wednesday
// thursday
// friday
// saturday
// sunday

// Process finished with exit code 0
