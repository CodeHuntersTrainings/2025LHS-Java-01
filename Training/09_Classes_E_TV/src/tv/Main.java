package tv;

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.onOff();
        tv1.onOff();
        tv1.onOff();
        tv1.onOff();
        tv1.onOff();
        tv1.onOff();
        tv1.onOff();

        System.out.println();

        TV tv2 = new TV(true);
        tv2.onOff();
        tv2.onOff();
        tv2.onOff();
        tv2.onOff();
        tv2.onOff();
        tv2.onOff();
        tv2.onOff();

        System.out.println(TV.counterOfSwitchedOn);
    }
}