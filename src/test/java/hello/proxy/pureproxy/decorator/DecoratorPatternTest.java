package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.DecoratorPatternClient;
import hello.proxy.pureproxy.decorator.code.MessageDecoratorComponent;
import hello.proxy.pureproxy.decorator.code.RealComponent;
import hello.proxy.pureproxy.decorator.code.TimeDecoratorComponent;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * packageName    : hello.proxy.pureproxy.decorator
 * fileName       : DecoraterPatternTest
 * author         : MYH
 * date           : 2025-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-19        MYH       최초 생성
 */
@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecoratror(){
        RealComponent realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.excute();
    }

    @Test
    void decorator1(){
        RealComponent realComponent = new RealComponent();
        MessageDecoratorComponent messageDecoratorComponent = new MessageDecoratorComponent(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecoratorComponent);
        client.excute();
    }

    /**
     * 프록시는 체이닝이 가능하다. 프록시가 프록시를 호출하게 해서 기능 추가
     */
    @Test
    void decorator2(){
        RealComponent realComponent = new RealComponent();
        MessageDecoratorComponent messageDecoratorComponent = new MessageDecoratorComponent(realComponent);
        TimeDecoratorComponent timeDecoratorComponent = new TimeDecoratorComponent(messageDecoratorComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecoratorComponent);
        client.excute();
    }
}
