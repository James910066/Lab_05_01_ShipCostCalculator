public class ShipCostCalculator
{
    public static void main(String[] args)
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
        //output "The total cost is " + totalCost + " and " your shipping is free"
        //endIF

        double itemPrice = 90.00;
        final double SHIPPING_RATE = .02;
        final double FREE_SHIP_VALUE = 100.00;
        double totalCost = 0;
        double shippingCost;

        if (itemPrice >= FREE_SHIP_VALUE)
        {
            System.out.println("The total cost is " + itemPrice + " and "  + "your shipping is free");
        }
        else
       {
            shippingCost = itemPrice * SHIPPING_RATE;
            totalCost = shippingCost + itemPrice;
            System.out.println("The cost of shipping is " + shippingCost + " and total cost of your purchase is " + totalCost);
       }


    }

}