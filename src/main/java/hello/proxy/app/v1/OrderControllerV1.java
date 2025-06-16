package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName    : hello.proxy.app.v1
 * fileName       : OrderController
 * author         : MYH
 * date           : 2025-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-16        MYH       최초 생성
 */
//컨트롤러도 인터페이스로 만드는 경우가 있다?
@RequestMapping  //스프링은 @Controller 또는 @RequestMapping 이 있어야 스프링 컨트롤러라 인식 -> 컨트롤러 없이 리퀘스트트 맵핑만 있어도 되는구나..
                // 스프링 MVC는 @Controller 또는 @RequestMapping 어노테이션이 있어야 스프링 컨트롤러로 인식한다. 그리고 스프링 컨트롤러로 인식해야 HTTP URL 이 매핑되고 동작한다.
                // @RequestMapping는 인터페이스에 사용해도 된다.
@ResponseBody   // HTTP 메시지 컨버터를 사용해서 응답한다. 이 어노테이션은 인터페이스에 사용해도 된다.
public interface OrderControllerV1 {

    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);   //인터페이스는 @RequestParam 애노테이션을 사용하는게 좋다. 미 사용 시, 실행 시점에 자바 버전에 따라.. 인식이 안될 수 있다. 클래스는 상관 없다?

    @GetMapping("/v1/no-log")
    String noLog();
}
