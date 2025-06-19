package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * packageName    : hello.proxy.pureproxy.decorator.code
 * fileName       : DecoratorPatternClient
 * author         : MYH
 * date           : 2025-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-19        MYH       최초 생성
 */
@Slf4j
public class DecoratorPatternClient {

    private Component component;

    public DecoratorPatternClient(Component component) {
        this.component = component;
    }

    public void excute(){
        String result = component.operation();
        log.info("result ={}",result);
    }
}
