# COIT11134 - Sample Exam - BQ6 - Arrays, LinkedLists, Iterators

## Question 6	(5 MARKS)

Assume that the following program compiles and runs without any errors. What is the output produced by this program.

The third ‘for’ loop has to be rewritten by using an iterator.  The iterator should iterate through the teamList object, retrieve the data from teamList and display the retrieved data on screen.

```
import java.util.LinkedList;

public class MyProg
{
   public static void main(String[] args)
   {
      String[] team = {"Australia","New Zealand",
                       "India","UK","Pakistan","China"};

      LinkedList<String> teamList = new LinkedList<String>();

      for (int i=0; i<team.length; i++)
      {
         teamList.add(team[i]);
      }

      for (int i=0; i<teamList.size(); i++)
      {
         String tempTeam = teamList.get(i);
         if (tempTeam.equals("New Zealand"))
         {
            teamList.remove(i);
         }
      }

      for (int j=0; j<teamList.size(); j++)
      {
         System.out.println(teamList.get(j).toString());
      }
   }

}//end of class definition
```
