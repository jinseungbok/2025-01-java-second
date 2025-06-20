package ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Driver driver = new Driver();
        driver.drive(bus); // 버스가 달린다.
        driver.drive(taxi); // 택시가 달린다.

        // Vehicle interface > implements 한 객체
        // 주소값이 vehicle 변수에 들어감
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {

            }

            @Override
            public void stop() {

            }
        };
    }
}
