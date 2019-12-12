package MyMa;

public abstract class carLease {

    public abstract String totalCalculator();

    private String name , whichModel;
    private int age ,salary , totalCost , downPayment  , leaseFee , depractionAmount;
    int termofLease;
    private double taxRate , moneyFactor , interestAmount;

    public carLease(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, double taxRate, double moneyFactor) {
        this.name = name;
        this.whichModel = whichModel;
        this.age = age;
        this.salary = salary;
        this.totalCost = totalCost;
        this.downPayment = downPayment;
        this.termofLease = termofLease;
        this.leaseFee = leaseFee;
        this.taxRate = taxRate;
        this.moneyFactor = moneyFactor;
        depractionAmount = calculateDepreciation();
        interestAmount = calculateInterest();
    }

    int calculateDepreciation(){
        return  (totalCost - downPayment) / termofLease;
    }

    double calculateInterest(){
        return (totalCost + downPayment) * moneyFactor;  //TODO: check this
    }
    double taxes(){
        return  depractionAmount + interestAmount * taxRate;
    }
    public int getSalary() {
        return salary;
    }

    /*
        Create 2 string   (name , whichModel)

        7 int (age ,salary , totalCost , downPayment , termofLease , leaseFee , depractionAmount )

        3  double (taxRate , moneyFactor , interestAmount)

     */


    /*

        Create a constructor

        All the variables are should be as a parameter except (depractionAmount and interestAmount)

        depractionAmount = calculateDepreciation method (you will create this in this class)

        interestAmount = calculateInterest method (you will create this in this class)

     */


/*
 Create a method

        calculateDepreciation

        return type should be int

        calculation is :

        total cost minus down payment divide by term of lease

 */

    /*
       calculateInterest

                return type should  be double

                calculation is : total cost plus down payment multiply by money factor

     */

    /*

        taxes
           return type should be double

            calculation is :
            depractionAmount + interestAmount * taxRate

     */

    /*
     getter for the (getSalary)
     */

    }
