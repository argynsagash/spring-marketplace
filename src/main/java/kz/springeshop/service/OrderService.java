package kz.springeshop.service;

import kz.springeshop.domain.Order;

public interface OrderService {
    void saveOrder(Order order);

    Order getOrder(Long id);
}
