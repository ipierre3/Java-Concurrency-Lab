public class Simulation {
    public void runSim(){
        System.out.println("Running simulation");

        Account myAccount = new Account(1000);

        for (int i = 0; i < 10; i++) {
            myAccount.withdraw(100);
        }
        for (int i = 0; i < 10; i++) {
            myAccount.withdraw(100);
        }

        System.out.println("Simulation complete");
    }

}
