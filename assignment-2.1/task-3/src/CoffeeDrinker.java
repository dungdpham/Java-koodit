public class CoffeeDrinker {
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        myCoffeeMaker.pressOnOff();

        myCoffeeMaker.setType();
        myCoffeeMaker.setAmount(50);

        System.out.println(myCoffeeMaker.isOn());
        System.out.println(myCoffeeMaker.getType());
        System.out.println(myCoffeeMaker.getAmount());

        myCoffeeMaker.pressOnOff();
    }
}
