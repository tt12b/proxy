package hello.proxy.app.v2;

import hello.proxy.app.v1.OrderRepositoryV1;

/**
 * packageName    : hello.proxy.app.v2
 * fileName       : OrderRepositoryV2.java
 * author         : tt12b
 * date           : 2025-06-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-16        tt12b       최초 생성
 */
public class OrderRepositoryV2 {
    public void save(String itemId) {
        //저장로직
        if(itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생!");
        }
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
