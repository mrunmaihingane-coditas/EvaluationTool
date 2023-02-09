class Student{
    public void ShowResult(int id, String Fname, String Lname, String educatio, String pune , int marks){

        if(marks>=70) System.out.println("Distention");

        else if (marks <70 && marks>=60)  System.out.println("First Class");


        else if (marks <60 && marks>=55)  System.out.println("Higher second Class");

        else if (marks <55 && marks>=50)  System.out.println("Second Class");

        else if (marks <50 && marks>=35)  System.out.println("Pass Class");

        else System.out.println("fail");

    }
}



public class Q1 {
    public static void main(String[] args){
        Student student = new Student();
        student.ShowResult(1, "Mrunmai", "Hingane","E&TC", "Pune", 56);
    }

}
//"C:\Program Files\Java\jdk-19\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=57562:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Coditas\IdeaProjects\EvalutionTool\out\production\EvalutionTool Q1
// Higher second Class

// Process finished with exit code 0
