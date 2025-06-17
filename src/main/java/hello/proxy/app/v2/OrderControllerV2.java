package hello.proxy.app.v2;

import hello.proxy.app.v1.OrderControllerV1;
import hello.proxy.app.v1.OrderServiceV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName    : hello.proxy.app.v2
 * fileName       : OrderControllerV2.java
 * author         : tt12b
 * date           : 2025-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-16        tt12b       최초 생성
 */
@Slf4j
@RequestMapping //컨트롤러 쓰면 컴포넌트 스캔 대상이 된다. 수동 등록할 경우, HTTP URL 맵핑을 위해 리퀘스트 맵핑만 사용한다. 리퀘스트 맵핑도 스프링이 컨트롤로 인식한다.
@ResponseBody
public class OrderControllerV2{

    private final OrderServiceV2 orderService;


    public OrderControllerV2(OrderServiceV2 orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/v2/request")
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }

    @GetMapping("/v2/no-log")
    public String noLog() {
        return "ok";
    }
}
