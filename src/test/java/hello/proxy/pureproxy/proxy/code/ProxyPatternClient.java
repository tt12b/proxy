package hello.proxy.pureproxy.proxy.code;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * packageName    : hello.proxy.pureproxy.proxy.code
 * fileName       : ProxyPatternClient
 * author         : MYH
 * date           : 2025-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-18        MYH       최초 생성
 */
public class ProxyPatternClient {

    private Subject subject;

    public ProxyPatternClient(Subject subject) {
        this.subject = subject;
    }

    public void excute(){
        subject.operation();
    }
}
