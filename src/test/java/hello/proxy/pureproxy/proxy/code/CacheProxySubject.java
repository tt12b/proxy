package hello.proxy.pureproxy.proxy.code;

import lombok.extern.slf4j.Slf4j;

/**
 * packageName    : hello.proxy.pureproxy.proxy.code
 * fileName       : CacheProxy
 * author         : MYH
 * date           : 2025-06-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-18        MYH       최초 생성
 */
//프록시용
@Slf4j
public class CacheProxySubject implements Subject {

    private Subject target; //실제 객체
    private String cacheValue; //캐시 저장용

    //실재 객체 참고용 의존관계
    public CacheProxySubject(Subject target) {
        this.target = target;
    }

    @Override
    public String operation() {
        log.info("프록시 호출");
        if(cacheValue==null) {
            cacheValue = target.operation();
        }
        return null;
    }
}
