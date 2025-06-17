package hello.proxy.app.v2;

import hello.proxy.app.v1.OrderRepositoryV1;
import hello.proxy.app.v1.OrderServiceV1;

/**
 * packageName    : hello.proxy.app.v2
 * fileName       : OrderServiceV2.java
 * author         : tt12b
 * date           : 2025-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-16        tt12b       최초 생성
 */
public class OrderServiceV2{

    private final OrderRepositoryV2 orderRepository;

    public OrderServiceV2(OrderRepositoryV2 orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
