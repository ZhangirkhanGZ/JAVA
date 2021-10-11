import java.util.Scanner;

public class menu203 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi there!\n");
        System.out.println("Welcome to the menu of \"Salam Bro\" Fast Food Station.");
        System.out.println("Here you can see our menu below.");

        String basket = "";
        int price = 0;

        String menu = "\n0. Exit menu.%n1. Burgers.%n2. Hot dogs.%n3. French fries.%n4. Drinks.%n5. Sauces.%n6. Additivies.%n7. Clearbasket%n8. Check basket.\n";

        // burgers
        String C = "Chicken hamburger - 590 kzt.";
        String B = "Beef hamburger - 790 kzt.";
        String Ch = "Chicken cheesburger - 790 kzt.";
        String Bch = "Beef cheesburger - 890 kzt.";
        String Dchh = "Double chicken hamburger - 990 kzt.";
        String DChc = "Double chicken cheesburger - 1090 kzt.";
        String DBh = "Double beef hamburger - 1090 kzt.";
        String DBch = "Double beef cheesburger - 1190 kzt.";
        String Mh = "Mixed hamburger - 1090 kzt.";
        String Mch = "Mixed cheesburger - 1190 kzt.";

        // Hot dogs
        String Shd = "Spicy hot dog - 590 kzt.";
        String Hd = "Hot dog - 790 kzt.";

        // French fries
        String FF = "French fries - 390 kzt.";

        // Drinks
        String CC = "Coca-cola 0.5l - 250 kzt.";
        String F = "Fanta 0.5l - 250 kzt.";
        String S = "Sprite 0.5l - 250 kzt.";
        String Ft = "Fuse tea 0.5l - 250 kzt.";
        String Ba = "Bon aqua 0.5l - 250 kzt";
        String Rc = "Raspberry compote 0.3l - 250 kzt.";
        String Cc = "Currant compote 0.3l - 250 kzt.";
        String Pp = "Piko pulpy 0.5l - 350 kzt.";

        // Sauces
        String K = "Ketchup - 100 kzt.";
        String Che = "Cheese sauce - 100 kzt.";
        String BBQ = "Sauce BBQ - 100 kzt.";
        String Ss = "Spicy sauce - 50 kzt.";
        String M = "Mustard sauce - 100 kzt.";

        // Additives
        String J = "Jalapeno - 100 kzt.";
        String Chee = "Cheese - 150 kzt.";

        String burgers = "\n0. Exit menu.%n1. Chicken hamburger - 590 kzt.%n2. Beef hamburger - 790 kzt.%n3. Chicken cheesburger - 790 kzt.%n4. Beef cheesburger - 890 kzt.%n5. Double chicken hamburger - 990 kzt.%n6. Double chicken cheesburger - 1090 kzt.%n7. Double beef hamburger - 1090 kzt.%n8. Double beef cheesburger - 1190 kzt.%n9. Mixed hamburger - 1090 kzt.%n10. Mixed cheesburger - 1190 kzt.\n";

        String hot_dogs = "\n0. Exit menu.%n1. Spicy hot dog - 590 kzt.%n2. Hot dog - 790 kzt.\n";

        String frensh_fries = "\n0. Exit menu.%n1. French fries - 390 kzt.";

        String drinks = "\n0. Exit menu.%n1. Coca-cola 0.5l - 250 kzt.%n2. Fanta 0.5l - 250 kzt.%n3. Sprite 0.5l - 250 kzt.%n4. Fuse tea 0.5l - 250 kzt.%n5. Bon aqua 0.5l - 250 kzt.%n6. Raspberry compote 0.3l - 250 kzt.%n7. Currant compote 0.3l - 250 kzt.%n8. Piko pulpy 0.5l - 350 kzt.";

        String sauces = "\n0. Exit menu.%n1. Ketchup - 100 kzt.%n2. Cheese sauce - 100 kzt.%n3. Sauce BBQ - 100 kzt.%n4. Spicy sauce - 50 kzt.%n5. Mustard sauce - 100 kzt.";

        String additives = "\n0. Exit menu.%n1. Jalapeno - 100 kzt.%n2. Cheese - 150 kzt.";

        int number;

        do {
            System.out.printf(menu);
            System.out.print("\nChoose one: ");

            number = scan.nextInt();
            if (number == 0) {
                System.out.printf("");
                break;
            }

            else if (number == 1) {
                System.out.printf(burgers);
                System.out.print("\nChoose one: ");
                number = scan.nextInt();
                if (number == 0) {
                    System.out.printf(menu);
                }

                else if (number == 1) {
                    basket += C + " \n ";
                    price += 590;
                    System.out.println("You ordered  " + C);
                }

                else if (number == 2) {
                    basket += B + "\n";
                    price += 790;
                    System.out.println("You ordered  " + B);
                }

                else if (number == 3) {
                    basket += Ch + "\n";
                    price += 790;
                    System.out.println("You ordered  " + Ch);
                }

                else if (number == 4) {
                    basket += Bch + "\n";
                    price += 890;
                    System.out.println("You ordered  " + Bch);
                }

                else if (number == 5) {
                    basket += Dchh + "\n";
                    price += 990;
                    System.out.println("You ordered  " + Dchh);
                }

                else if (number == 6) {
                    basket += DChc + "\n";
                    price += 1090;
                    System.out.println("You ordered  " + DChc);
                }

                else if (number == 7) {
                    basket += DBh + "\n";
                    price += 1090;
                    System.out.println("You ordered  " + DBh);
                }

                else if (number == 8) {
                    basket += DBch + "\n";
                    price += 1190;
                    System.out.println("You ordered  " + DBch);
                }

                else if (number == 9) {
                    basket += Mh + "\n";
                    price += 1090;
                    System.out.println("You ordered  " + Mh);
                }

                else if (number == 10) {
                    basket += Mch + "\n";
                    price += 1190;
                    System.out.println("You ordered  " + Mch);
                }
            }

            else if (number == 2) {
                System.out.printf(hot_dogs);
                System.out.print("\nChoose one: ");
                number = scan.nextInt();
                if (number == 0) {
                    System.out.printf(menu);
                }

                else if (number == 1) {
                    basket += Shd + "\n";
                    price += 590;
                    System.out.println("You ordered  " + Shd);
                }

                else if (number == 2) {
                    basket += Hd + "\n";
                    price += 790;
                    System.out.println("You ordered  " + Hd);
                }
            }

            else if (number == 3) {
                System.out.printf(frensh_fries);
                System.out.print("\nChoose one: ");
                number = scan.nextInt();
                if (number == 0) {
                    System.out.printf(menu);
                }

                else if (number == 1) {
                    basket += FF + "\n";
                    price += 390;
                    System.out.println("You ordered  " + FF);
                }
            }

            else if (number == 4) {
                System.out.printf(drinks);
                System.out.print("\nChoose one: ");
                number = scan.nextInt();
                if (number == 0) {
                    System.out.printf(menu);
                }

                else if (number == 1) {
                    basket += CC + "\n";
                    price += 250;
                    System.out.println("You ordered  " + CC);
                }

                else if (number == 2) {
                    basket += F + "\n";
                    price += 250;
                    System.out.println("You ordered  " + F);
                }

                else if (number == 3) {
                    basket += S + "\n";
                    price += 250;
                    System.out.println("You ordered  " + S);
                }

                else if (number == 4) {
                    basket += Ft + "\n";
                    price += 250;
                    System.out.println("You ordered  " + Ft);
                }

                else if (number == 5) {
                    basket += Ba + "\n";
                    price += 250;
                    System.out.println("You ordered  " + Ba);
                }

                else if (number == 6) {
                    basket += Rc + "\n";
                    price += 250;
                    System.out.println("You ordered  " + Rc);
                }

                else if (number == 7) {
                    basket += Cc + "\n";
                    price += 250;
                    System.out.println("You ordered  " + Cc);
                }

                else if (number == 8) {
                    basket += Pp + "\n";
                    price += 350;
                    System.out.println("You ordered  " + Pp);
                }
            }

            else if (number == 5) {
                System.out.printf(sauces);
                System.out.print("\nChoose one: ");
                number = scan.nextInt();
                if (number == 0) {
                    System.out.printf(menu);
                } else if (number == 1) {
                    basket += K + "\n";
                    price += 100;
                    System.out.println("You ordered  " + K);
                }

                else if (number == 2) {
                    basket += Che + "\n";
                    price += 100;
                    System.out.println("You ordered  " + Che);
                }

                else if (number == 3) {
                    basket += BBQ + "\n";
                    price += 100;
                    System.out.println("You ordered  " + BBQ);
                }

                else if (number == 4) {
                    basket += Ss + "\n";
                    price += 50;
                    System.out.println("You ordered  " + Ss);
                }

                else if (number == 5) {
                    basket += M + "\n";
                    price += 100;
                    System.out.println("You ordered  " + M);
                }
            }

            else if (number == 6) {
                System.out.printf(additives);
                System.out.print("\nChoose one: ");
                number = scan.nextInt();
                if (number == 0) {
                    System.out.printf(menu);
                }

                else if (number == 1) {
                    basket += J + "\n";
                    price += 100;
                    System.out.println("You ordered  " + J);
                }

                else if (number == 2) {
                    basket += Chee + "\n";
                    price += 150;
                    System.out.println("You ordered  " + Chee);
                }
            }

            else if (number == 7) {
                basket = "You didn't order anything";
                price = 0;
            }

            else if (number == 8) {
                System.out.printf(basket + "\n");
                System.out.println();
                System.out.println("Total price: " + price + " kzt");
                break;
            }
        } while (true);
    }
}