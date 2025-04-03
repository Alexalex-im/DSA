package GreedyAlgorithm.ActivitySelectionProblem;

import java.util.*;


public class ActivitySelection {
    
    static void activitySelection (ArrayList <Activity> activityList) {
        Comparator <Activity> finishTimeComparator = new Comparator <Activity> () {     // O(1)
            @Override 
            public int compare (Activity o1, Activity o2) {
                return o1.getFinishTime() - o2.getFinishTime();     // O(1)
            }
        };

        Collections.sort(activityList, finishTimeComparator);     // O(NLogn) 
        Activity previousActivity = activityList.get(0);    // O(1)

        System.out.println("\n \n Recommended Schedule: \n" + activityList.get(0)); // O(1)

        for (int i=1; i<activityList.size(); i++) {             // O(N)
            Activity activity = activityList.get(i);            // O(1)
            if (activity.getStartTime() >= previousActivity.getFinishTime()) {  
                System.out.println(activity);       // O(1)
                previousActivity = activity;        // O(1)

            }
        }

        // Time Complexity : O(Logn)
        // Space Complexity : O(1)
    }
}
