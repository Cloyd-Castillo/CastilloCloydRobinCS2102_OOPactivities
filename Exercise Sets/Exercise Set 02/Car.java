public class Car 
{
    private String color;
    private double price;
    private char size;

    public Car(String carColor, double carPrice, char carSize) 
    {
        color = carColor;
        price = carPrice;
        size = Character.toUpperCase(carSize); 
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String carColor) 
    {
        color = carColor;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double carPrice) 
    {
        price = carPrice;
    }

    public char getSize() 
    {
        return size;
    }

    public void setSize(char carSize) 
    {
        size = Character.toUpperCase(carSize);
    }

    public String toString() 
    {

        String sizeDescriptor = "";
        if (size == 'S') 
        {
            sizeDescriptor = "small";
        } else if (size == 'M') 
        {
            sizeDescriptor = "medium";
        } else if (size == 'L') 
        {
            sizeDescriptor = "large";
        }

        return String.format("Car (%s) - P(%.2f) - (%s)", color, price, sizeDescriptor);
    }

    //If an output is needed, then use this
    /*
    public static void main(String[] args) 
    {
        Car car1 = new Car("white", 19999.85, 'M');
        System.out.println(car1);
        Car car2 = new Car("black", 50000.00, 'L');
        System.out.println(car2);
    }
    */
}