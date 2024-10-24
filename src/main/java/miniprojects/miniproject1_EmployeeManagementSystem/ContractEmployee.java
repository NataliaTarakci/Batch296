package miniprojects.miniproject1_EmployeeManagementSystem;

public class ContractEmployee extends Employee{

    /*
        HW
        Specific salary rules:
            Contract Employees: Salary is calculated as contract rate * contract length.
        Discounts and Additional Conditions:
            Contract Length: Contract employees can have contracts of up to 24 months.
                             If the contract length exceeds 24 months,
                             display a warning: "Invalid contract length!".
     */

    private double contractRate;
    private int contractLength;

    public ContractEmployee(String name, String id, double contractRate, int contractLength){
        super(name, id);
        this.contractRate = contractRate;
        this.contractLength = contractLength;
    }

    @Override
    public double calculateSalary() {
        if (contractLength<0 || contractLength>24){
            System.out.println("Invalid contract length!");
            return 0;
        }
        return contractRate*contractLength;
    }

    @Override
    public String getDetails() {
        return "Contract Employee name is: "+getName()+". ID is: "+getId()+". Total salary is: "+calculateSalary();
    }
}
