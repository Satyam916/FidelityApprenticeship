import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insurance Number:");
        String insuranceNo=sc.nextLine();
        System.out.println("Insurance Name:");
        String insuranceName=sc.nextLine();
        System.out.println("Amount Covered:");
        double amountCovered=sc.nextDouble();

        System.out.println("Select Insurance Type:");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int choice=sc.nextInt();

        insurance ins=null;

        if(choice==1){
            System.out.println("Policy Term:");
            int policyTerm=sc.nextInt();
            System.out.println("Benefit Percent:");
            float benefitPercent=sc.nextFloat();

            lifeInsurance lifeI=new lifeInsurance();
            lifeI.setInsuranceNo(insuranceNo);
            lifeI.setInsuranceName(insuranceName);
            lifeI.setAmountCovered(amountCovered);
            lifeI.setPolicyTerm(policyTerm);
            lifeI.setBenefitPercent(benefitPercent);
            ins=lifeI;

        } else if(choice==2){
            System.out.println("Depreciation Percent:");
            float depPercent=sc.nextFloat();

            motorInsurance motorI=new motorInsurance();
            motorI.setInsuranceNo(insuranceNo);
            motorI.setInsuranceName(insuranceName);
            motorI.setAmountCovered(amountCovered);
            motorI.setDepPercent(depPercent);
            ins=motorI;
        }else{
            System.out.println("Invalid options.");
        }

        double premium=addPolicy(ins);
        System.out.println("Calculated Premium:"+premium);



    }
    public static double addPolicy(insurance ins){
        return ins.calculatePremium();
    }
}
