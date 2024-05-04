package com.imorate.springmultipledatasource;

import com.imorate.springmultipledatasource.alt.entity.Order;
import com.imorate.springmultipledatasource.alt.repository.OrderRepository;
import com.imorate.springmultipledatasource.main.entity.Product;
import com.imorate.springmultipledatasource.main.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMultipleDatasourceApplication implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public SpringMultipleDatasourceApplication(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMultipleDatasourceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(20);

        Order order = new Order();
        order.setDescription("desc");

        productRepository.save(product);
        orderRepository.save(order);
    }
}
