/** TODO 8 Solution to : Prevent objects of this class from being created by making
 *         this class abstract.
 *         is implemented by adding "abstract" before "public class Robot" below.
 **/
abstract public class Robot {

    /** TODO 1 Solution Start: Cut the of "modeOfOperation" property declaration from
     *          SideKick.java and paste it here. From now on we will use
     *          the term "move" for cut and paste from one class to
     *          another. Cut out the comments for the property too
     *          and put it here.
     **/

    /** mode of operation  **/
    private int modeOfOperation;
    /** TODO 1 Solution End **/


    /** TODO 2 Solution Start: Move the declaration of "batteryCharge" to this class
     *          from SideKick.java to here
     **/
    /** charge of battery  **/
    private int batteryCharge;
    /** TODO 2 Solution End **/


   /** TODO 3 Start: Create a default constructor and move the initialization
    *          of the property "modeOfOperation" and "batteryCharge"
    *          from the constructor of SideKick.java to here.
    **/
    public Robot() {
        // initial charge of battery is 0
        batteryCharge = 0 ;

        // set default to cleaning or 1
        modeOfOperation = 1;
    }
    /** TODO 3 Solution End **/


    /** TODO 4 Start: Move the setters and getters for property "modeOfOperation"
     *          from SideKick.java to here.
     **/
    // accessor/getter method  for modeOfOperation
    public int getModeOfOperation() {
        return modeOfOperation;
    }

    // mutator/setter method for modeOfOperation
    public void setModeOfOperation(int modeOfOperation) {
        if(modeOfOperation>=1 && modeOfOperation<=3) {
            this.modeOfOperation = modeOfOperation;
        } else {
            this.modeOfOperation = 1;
        }
    }

    /** TODO 4 Solution End **/


    /** TODO 5 Solution: Move the setters and getters for property "batterCharge"
     *          from SideKick.java to here.
     **/
    /* Getter method */
    public int getBatteryCharge() {
        return batteryCharge;
    }

    /* Setter method */
    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    /** TODO 5 Solution End **/



    /** TODO 6 Solution: Move the method "rechargeBattery()" for recharging battery
     *          from SideKick.java to here.
     **/

    public void rechargeBattery() {
        System.out.println("Plug into socket.....");
        System.out.print("Charging ..");
        for (int i = 0; i <= 100; i += 10) {
            System.out.print(".");
            batteryCharge = i;

        }
        System.out.println("\nUnplug from socket.....");
        System.out.println("Fully charged.....");

    }
    /** TODO 6 Solution End **/



    /** TODO 7 Solution: Move the method "displayBatteryLevel()" for displaying battery
     *          charge level from SideKick.java to here.
     **/

    public void displayBatteryLevel() {
        System.out.println("The battery charge is at :" + batteryCharge + " %.");
    }

    /** TODO 7 Solution End **/



    /** TODO 16: Declare two abstract methods "setChoice" and "takeAction"
     *           with the return type "void"
     **/
    abstract public void setChoice();

    // method to take action
    abstract public void takeAction();

    /** TODO 16 Solution End **/

}


