package hello.proxy.pureproxy.proxy;

import hello.proxy.pureproxy.proxy.code.CacheProxySubject;
import hello.proxy.pureproxy.proxy.code.ProxyPatternClient;
import hello.proxy.pureproxy.proxy.code.RealSubject;
import org.junit.jupiter.api.Test;

/**
 * packageName    : hello.proxy.pureproxy.proxy
 * fileName       : ProxyPatternTest
 * author         : MYH
 * date           : 2025-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-18        MYH       최초 생성
 */
public class ProxyPatternTest {

    @Test
    void noProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);

        client.excute();
        client.excute();
        client.excute();
    }

    //한 번 조회하면 변하지 않는 객체라고 했을 때? 한 번 조회하면 어딘가 보관해두고 , 조회한 데이터를 사용하는게 좋다
    // 이런 기능을 캐시고 한다
    @Test
    void cacheProxyTest(){
        RealSubject realSubject = new RealSubject(); //실제 응답 날릴 객체
        CacheProxySubject cacheProxySubject = new CacheProxySubject(realSubject); //프록시 객체, 실제 객체와 의존성을 가져야 하기 때문에 주입
        ProxyPatternClient proxyPatternClient = new ProxyPatternClient(cacheProxySubject); //클라이언트

        //-> realsSubject와 cacheProxy를 생성하고 둘을 연결
        //결과적으로 cacheProxy가 realSubject를 참조하는 런타임 의존관계가 완성된다.
        //마지막으로 client에 cacheProxy를 주입한다.
        // 이 과정으로 client -> chacheProxy -> realSubject 런타임 객체 의존 관계가 완성된다.

        //위 과정에서 클라이언트 코드와 RealSubject코드를 전혀 변경하지 않고 프록시를 도입해서 접근을 제어했다.
        //실제 클라이언트 입장에서는 프록시 객체가 주입되었는지, 실제 객체가 주입되었는지 모른다.
        proxyPatternClient.excute();;
        proxyPatternClient.excute();;
        proxyPatternClient.excute();;
    }
}
