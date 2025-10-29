package tasks.StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );

        Map<String, Double> totalByProduct = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::product,
                        Collectors.summingDouble(Order::cost)
                ));

        List<Map.Entry<String, Double>> sortedByTotal = totalByProduct.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .toList();

        List<Order> top3Orders = orders.stream()
                .sorted(Comparator.comparingDouble(Order::cost).reversed())
                .limit(3)
                .toList();

        System.out.println("Три самых дорогих товара:");
        top3Orders.forEach(order ->
                System.out.println(order.product() + " → " + order.cost())
        );

        double total = top3Orders.stream()
                .mapToDouble(Order::cost)
                .sum();

        System.out.println("Суммарная стоимость: " + total);
    }
}
