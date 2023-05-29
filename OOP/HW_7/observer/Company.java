package OOP.HW_7.observer;

import java.util.Random;

public class Company implements CreateVacancy {
    
    private Random random;
    private String nameCompany;
    private int maxSalary;
    private Publisher jobAgency;

    public Company(String nameCompany, int maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }
       public void needEmployee(){
        String vac = createVacancy();
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(vac, nameCompany, salary);
    }

}
