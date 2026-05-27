package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Program {
    void main() {
        Scanner sc = new Scanner(System.in);

        Order order = new Order(1971, new Date(), OrderStatus.PENDING_PAYMENT);
        IO.println(order);

        String os = "undelivered";
        while (!os.equals("DELIVERED")) {
            IO.print("Update status: ");
            os = sc.next();
            order = new Order(1971, new Date(), OrderStatus.valueOf(os));
            IO.println(order);
        }

        sc.close();
    }
}
