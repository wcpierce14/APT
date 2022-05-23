/*
You want to determine the most popular person in a social network. To do this, you will 
count the number of "2-friends" that each person has. Person A is called a 2-friend of another 
person B if they are friends with each other or if there exists some person C who is a friend 
of both A and B. The most popular person is the person with the highest number of 2-friends. 
(There might be more than one if multiple people all have the maximal number of 2-friends.)
You are given a String[] friends, where the j-th character of the i-th element is 'Y' if person 
i and person j are friends, and 'N' otherwise. Return the number of 2-friends of the most popular 
person in this social network.
*/

import java.util.*;

public class FriendScore {
    Map<Integer, Set<Integer>> myGraph = new HashMap<>();
    Map<Integer, Set<Integer>> tempMyGraph = new HashMap<>();
    

    private Set<Integer> twoFriends(int index) {
        Set<Integer> set = new TreeSet<>();
        Set<Integer> friends = tempMyGraph.get(index);
        set.addAll(friends);
        for(int friend : friends) {
            set.addAll(tempMyGraph.get(friend));
        }
        set.remove(index);
        return set;
    }

    public int highestScore(String[] friends) {

        for(int i = 0; i < friends.length; i++) {
            tempMyGraph.put(i, new HashSet<Integer>());
            for(int k = 0; k < friends.length; k++) {
                if(friends[i].charAt(k) == 'Y') {
                    tempMyGraph.get(i).add(k);
                }
            }
        }


        for(int h = 0; h < friends.length; h++) {
            myGraph.put(h, twoFriends(h));
        }

       int[] finalArr = new int[friends.length];
       for(Integer i : myGraph.keySet()) {
            finalArr[i] = myGraph.get(i).size();
       }

       int max = 0;
       for(int i = 0; i < friends.length; i++) {
           if(finalArr[i] > max) {
               max = finalArr[i];
           }
       } 
       return max;
    }
 }