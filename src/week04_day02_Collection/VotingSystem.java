package week04_day02_Collection;

import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> votes = new HashMap<>();
        votes.put("Alice", 120);
        votes.put("Bob", 90);
        votes.put("Charlie", 150);
        LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
        voteOrder.put("Alice", 120);
        voteOrder.put("Bob", 90);
        voteOrder.put("Charlie", 150);
        TreeMap<String, Integer> sortedVotes = new TreeMap<>(votes);

        System.out.println("Voting Results (Insertion Order):");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue() + " votes");
        }

        System.out.println("\nVoting Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue() + " votes");
        }
    }
}
