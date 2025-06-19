package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName    : hello.proxy.pureproxy.decorator.code
 * fileName       : MessageDecorator
 * author         : MYH
 * date           : 2025-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-19        MYH       최초 생성
 */
@Slf4j
public class MessageDecoratorComponent implements Component {

    private Component component;

    public MessageDecoratorComponent(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator Component 실행");
        String result = component.operation();
        String decoResult = "*****"+result+"*****";
        log.info("MessageDecorator Component 꾸미기 적용 전 = {} , 꾸미기 적용 후 = {}",result,decoResult);
        return decoResult;
    }
}
