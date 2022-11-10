public class Simulation {
    public void runSim(){
        System.out.println("Running simulation");
        Account myAccount = new Account(1000);

        myAccount.withdraw(200);
    }
}
