// Practice Exam question solution by Mike OMalley.
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
