package week04_day02_Collection;

import java.time.LocalDate;
import java.util.*;

class Policy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "PolicyNumber='" + policyNumber + '\'' +
                ", Policyholder='" + policyholderName + '\'' +
                ", ExpiryDate=" + expiryDate +
                '}';
    }
}
public class InsurancePolicyManagementSystem {
    private HashMap<String, Policy> hashMap = new HashMap<>();
    private LinkedHashMap<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> treeMapByExpiry = new TreeMap<>();
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMapByExpiry.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry : treeMapByExpiry.subMap(today, true, cutoff, true).entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;
    }
    public List<Policy> getPoliciesByPolicyholder(String name) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : linkedHashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(name)) {
                result.add(policy);
            }
        }
        return result;
    }
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        NavigableMap<LocalDate, List<Policy>> expiredMap = treeMapByExpiry.headMap(today, false);
        Set<String> policiesToRemove = new HashSet<>();
        for (List<Policy> policies : expiredMap.values()) {
            for (Policy policy : policies) {
                policiesToRemove.add(policy.getPolicyNumber());
            }
        }
        for (String policyNum : policiesToRemove) {
            Policy removed = hashMap.remove(policyNum);
            linkedHashMap.remove(policyNum);
        }
        expiredMap.clear();
    }
    public void printAllPolicies() {
        System.out.println("\n--- All Policies ---");
        for (Policy policy : linkedHashMap.values()) {
            System.out.println(policy);
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();
        system.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(10)));
        system.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40)));
        system.addPolicy(new Policy("P003", "Alice", LocalDate.now().plusDays(5)));
        system.addPolicy(new Policy("P004", "David", LocalDate.now().minusDays(1))); // expired

        system.printAllPolicies();

        System.out.println("\n--- Retrieve Policy P002 ---");
        System.out.println(system.getPolicyByNumber("P002"));

        System.out.println("\n--- Policies Expiring in 30 Days ---");
        for (Policy p : system.getPoliciesExpiringSoon()) {
            System.out.println(p);
        }

        System.out.println("\n--- Policies for Policyholder 'Alice' ---");
        for (Policy p : system.getPoliciesByPolicyholder("Alice")) {
            System.out.println(p);
        }

        System.out.println("\n--- Removing Expired Policies ---");
        system.removeExpiredPolicies();
        system.printAllPolicies();
    }
}

