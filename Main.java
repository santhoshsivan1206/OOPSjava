import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Main{

  public static void main(String[] args){

    Map<String,Integer> hscMarks = new HashMap<>();
    hscMarks.put("Maths",90);
    hscMarks.put("Physics",90);
    hscMarks.put("Chemistry",90);

    Candidate candidate1 = new Candidate("Santhosh Sivan","12/06/2002",hscMarks,8.1,9.1,6,86,"Indian");
    Candidate candidate2 = new Candidate("Santhosh","12/06/2002",hscMarks,8.1,6.1,5,86,"Indian");
    Candidate candidate3 = new Candidate("Santa","12/06/1998",hscMarks,8.1,9.1,5,86,"Indian");
    Candidate candidate4 = new Candidate("Santa Sivan","12/06/2002",hscMarks,8.1,9.1,5,86,"Indian");

    List<Candidate> candidates = List.of(candidate1,candidate2,candidate3,candidate4);

    HRTeam hrTeam = new HRTeam();
    List<Candidate> eligibleCandidates = hrTeam.getEligibleCandidates(candidates);

    System.out.println("\n\n");
    hrTeam.informCandidates(candidates);
    System.out.println("\n\nDetails of the selected candidate: \n");
    hrTeam.printEligibleCandidatesDetails(eligibleCandidates);
  }
}
