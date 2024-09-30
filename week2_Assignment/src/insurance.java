import java.util.Scanner;

public class insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

  /* public insurance(String insuranceNo, String insuranceName, double amountCovered) {
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.amountCovered = amountCovered;
    }*/

    public String getInsuranceNo() {
        return insuranceNo;
    }
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public double getAmountCovered() {
        return amountCovered;
    }
    public void setAmountCovered(double amountCovered) {
        this.amountCovered = amountCovered;
    }

    public double calculatePremium(){
        return 0;
    }
}
 class motorInsurance extends insurance{

     private double idv;
     private float depPercent;

     /*public motorInsurance(String insuranceNo, String insuranceName, double amountCovered,float depPercent) {
         super(insuranceNo, insuranceName, amountCovered);
         this.depPercent = depPercent;
         this.idv = idv;
     }*/
     public float getDepPercent(){
         return depPercent;
     }
     public void setDepPercent(float depPercent){
         this.depPercent = depPercent;
     }
     public double getIdv(){
         return idv;
     }

     @Override
     public double calculatePremium(){
         idv=getAmountCovered()-((getAmountCovered()*depPercent)/100);
         return (0.03)*idv;
     }
 }
 class lifeInsurance extends insurance{
     private int policyTerm;
     private float benefitPercent;

    /*public lifeInsurance(String insuranceNo, String insuranceName, double amountCovered,int policyTerm, float benefitPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }*/

     public int getPolicyTerm() {
         return policyTerm;
     }
     public void setPolicyTerm(int policyTerm) {
         this.policyTerm = policyTerm;
     }
     public float getBenefitPercent() {
         return benefitPercent;
     }
     public void setBenefitPercent(float benefitPercent) {
         this.benefitPercent = benefitPercent;
     }

     @Override
     public double calculatePremium(){
         double reducedAmount=getAmountCovered()-((getAmountCovered()*benefitPercent)/100);
         return reducedAmount/policyTerm;
     }
 }
