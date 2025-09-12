package Week1_day1;

import java.time.LocalDate;
import java.time.Period;

class Member {
    private String name;
    private String memberId;
    private LocalDate membershipDate;

  public Member(String name, String memberId, LocalDate membershipDate) {
        this.name = name;
        this.memberId = memberId;
        this.membershipDate = membershipDate;
    }
    public boolean isMembershipValid() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(membershipDate, today);
        return period.getYears() < 1; // valid if less than 1 year
    }
   public void displayInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
        System.out.println("Membership Date: " + membershipDate);
        System.out.println("Membership Valid: " + (isMembershipValid() ? "Yes" : "No"));
    }
}

public class LibraryMembershipTracker {
    public static void main(String[] args) {
        Member m1 = new Member("Alice", "M101", LocalDate.of(2025, 1, 15));
        Member m2 = new Member("Bob", "M102", LocalDate.of(2023, 9, 10));

        m1.displayInfo();
        System.out.println();
        m2.displayInfo();
    }
}
