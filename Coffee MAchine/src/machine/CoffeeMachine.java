package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        //values given that the machine will start out with
        int tot_water = 400;
        int tot_milk = 540;
        int tot_beans = 120;
        int tot_cups = 9;
        int tot_money = 550;

        //start the machine using the above inputs
        startMachine(tot_water, tot_milk, tot_beans, tot_cups, tot_money);
    }

    //method to print the machine stats, used primarily to avoid constantly typing it out
    //in a real coffee machine scenario, would be useful to change the machines response to users
    private static void printMachineStats(int tot_water, int tot_milk, int tot_beans, int tot_cups, int tot_money) {
        System.out.println("The coffee machine has:");
        System.out.println(tot_water + " ml of water");
        System.out.println(tot_milk + " ml of milk");
        System.out.println(tot_beans + " g of coffee beans");
        System.out.println(tot_cups + " disposable cups");
        System.out.println("$" + tot_money + " of money");
    }

    //method to check the current inventory levels of the machine
    //takes the several different amount of resources need for each type of coffee
    //if the levels are less than needed will print what resource is needed
    private static boolean checkOutOfInventory(String user_order, int tot_water, int tot_milk, int tot_beans, int tot_cups){
        boolean out_of_resource = false;
        if (user_order.equals("1")) {
            if (tot_water < 250){
                System.out.println("Sorry, not enough water!");
                out_of_resource = true;
            }

            if (tot_beans < 16){
                System.out.println("Sorry, not enough beans!");
                out_of_resource = true;
            }

            if (tot_cups < 1){
                System.out.println("Sorry, not enough cups!");
                out_of_resource = true;
            }
        } else if (user_order.equals("2")){
            if (tot_water < 350){
                System.out.println("Sorry, not enough water!");
                out_of_resource = true;
            }

            if (tot_milk < 75){
                System.out.println("Sorry, not enough milk!");
                out_of_resource = true;
            }

            if (tot_beans < 20){
                System.out.println("Sorry, not enough beans!");
                out_of_resource = true;
            }

            if (tot_cups < 1){
                System.out.println("Sorry, not enough cups!");
                out_of_resource = true;
            }

        } else if (user_order.equals("3")){
            if (tot_water < 200){
                System.out.println("Sorry, not enough water!");
                out_of_resource = true;
            }

            if (tot_milk < 100){
                System.out.println("Sorry, not enough milk!");
                out_of_resource = true;
            }

            if (tot_beans < 12){
                System.out.println("Sorry, not enough beans!");
                out_of_resource = true;
            }

            if (tot_cups < 1){
                System.out.println("Sorry, not enough cups!");
                out_of_resource = true;
            }
        } else {
            out_of_resource = false;
        }

        return out_of_resource;
    }

    //method representing the running of the coffee machine
    //use a while loop to accept inputs from the user and if they match the commands
    //then to perform the command as requested by the user
    //puts all user inputs to lower case to avoid the use of capitalization
    //tracks the number of resources input at the beginning of the program
    private static void startMachine(int tot_water, int tot_milk, int tot_beans, int tot_cups, int tot_money){
        Scanner scanner = new Scanner(System.in);
        boolean start = true;


        while(start == true){
            //printMachineStats(tot_water, tot_milk, tot_beans, tot_cups, tot_money);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String user_input = scanner.nextLine();

            if(user_input.equals("buy")){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino, back - to main menu:");
                String user_order = scanner.nextLine();
                if (user_order.equals("1")){//espresso
                    if(checkOutOfInventory(user_order, tot_water, tot_milk, tot_beans, tot_cups) == false){
                        tot_money += 4;
                        tot_water -= 250;
                        tot_beans -= 16;
                        tot_cups -= 1;
                        System.out.println("I have enough resources, making you a coffee");
                    }

                } else if (user_order.equals("2")) {//latte
                    if(checkOutOfInventory(user_order, tot_water, tot_milk, tot_beans, tot_cups) == false){
                        tot_water -= 350;
                        tot_milk -= 75;
                        tot_beans -= 20;
                        tot_cups -= 1;
                        tot_money += 7;
                        System.out.println("I have enough resources, making you a coffee");
                    }

                } else if (user_order.equals("3")){//cappuccino
                    if(checkOutOfInventory(user_order, tot_water, tot_milk, tot_beans, tot_cups) == false){
                        tot_water -= 200;
                        tot_milk -= 100;
                        tot_beans -= 12;
                        tot_cups -= 1;
                        tot_money += 6;
                        System.out.println("I have enough resources, making you a coffee");
                    }
                } else if(user_order.equals("back")) {
                    //System.out.println("Sorry we do not have that!");
                }
            } else if (user_input.toLowerCase().equals("fill")){
                System.out.println("Write how many ml of water you want to add:");
                int user_input_int = scanner.nextInt();
                tot_water += user_input_int;

                System.out.println("Write how many ml of milk you want to add:");
                user_input_int = scanner.nextInt();
                tot_milk += user_input_int;

                System.out.println("Write how many grams of coffee beans you want to add:");
                user_input_int = scanner.nextInt();
                tot_beans += user_input_int;

                System.out.println("Write how many disposable cups you want to add:");
                user_input_int = scanner.nextInt();
                tot_cups += user_input_int;

            } else if (user_input.toLowerCase().equals("take")){
                System.out.println("I gave you $" + tot_money);
                tot_money = 0;
            } else if (user_input.toLowerCase().equals("remaining")){
                printMachineStats(tot_water, tot_milk, tot_beans, tot_cups, tot_money);
            } else if (user_input.toLowerCase().equals("exit")){
                start = false;
            } else {
                System.out.println("You have entered an invalid action, please enter (buy, fill, take)");

            }
        }
    }
}
