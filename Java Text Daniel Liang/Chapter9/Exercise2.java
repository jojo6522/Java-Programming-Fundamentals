public class Stock {

    public String symbol;
    public String name;
    public double currentPrice;
    public double previousClosingPrice = 34.5;

    public Stock(String s, String n)
    {
        symbol = s;
        name = n;
    }

    public double getChangePercent()
    {
        return currentPrice-previousClosingPrice/previousClosingPrice * 100;
    }

    public void setCurrentPrice(double c)
    {
        currentPrice = c;
    }


}

public class Exercise2{
    public static void main(String[] args)
    {
       Stock s1 = new Stock("ORCL", "Oracle Corporation");
       s1.setCurrentPrice(34.35);
       System.out.println("The change percentage is " + s1.getChangePercent()+ "%.");



    }

}
