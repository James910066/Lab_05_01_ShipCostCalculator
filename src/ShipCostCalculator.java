public class ShipCostCalculator
{
    public static void main(String[] args) {
        {
            //num itemPrice
            //num SHIPPING_RATE = .02
            //num FREE_SHIP_VAL = 100
            //num totalCost
            //output "Enter the price of the item"
            //input itemPrice
            //If itemPrice >= PRICE_THRESHOLD then
            //shippingCost = itemPrice * PRICE_THRESHOLD
            //totalCost = shippingCost + itemPrice
            //output "The cost of shipping is “ + shippingCost + “ and the total cost is “ +  totalCost"
            //Else
            //output "The total cost is " + totalCost + " and " your shipping      is free"
            //endIF

            double itemPrice = 102.00; //Variable assignment and declaration using simulated input
            final double SHIPPING_RATE = .02; //Constant Variable assignment and declaration
            final double FREE_SHIP_VALUE = 100.00; //Constant Variable assignment and declaration
            double totalCost = 0; //Variable assignment and declaration
            double shippingCost; //Variable declaration

            if (itemPrice >= FREE_SHIP_VALUE) //Decision for item cost 100 or greater
            {
                System.out.println("The total cost is $" + itemPrice + " and " + "your shipping is free"); //Output statement
            } else //Decision for item cost less than 100
            {
                shippingCost = itemPrice * SHIPPING_RATE; //Calculation of shipping cost
                totalCost = shippingCost + itemPrice; //Calculation of the total cost with shipping cost
                System.out.println("The cost of shipping is $" + shippingCost + " and total cost of your purchase is $" + totalCost); //Output statement
            }


        }
    }
}