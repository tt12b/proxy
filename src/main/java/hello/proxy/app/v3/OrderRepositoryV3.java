package hello.proxy.app.v3;

import org.springframework.stereotype.Repository;

/**
 * packageName    : hello.proxy.app.v3
 * fileName       : OrderRepositoryV3
 * author         : MYH
 * date           : 2025-06-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-06-17        MYH       최초 생성
 */
@Repository
public class OrderRepositoryV3 {
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
