package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName    : hello.proxy.pureproxy.decorator.code
 * fileName       : TimeDecoratorComponent
 * author         : MYH
 * date           : 2025-06-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-19        MYH       최초 생성
 */
@Slf4j
public class TimeDecoratorComponent implements Component {

    private Component component;

    public TimeDecoratorComponent(Component component) {
        this.component = component;
    }


    @Override
    public String operation() {
        log.info("TimeDecorator Component 실행");
        long startTime = System.currentTimeMillis();

        String result = component.operation();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("TimeDecorator Component 종료  resultTime = {}ms" ,resultTime);
        return result;
    }
}
