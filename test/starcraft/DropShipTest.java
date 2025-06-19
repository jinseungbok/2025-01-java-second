package starcraft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DropShipTest {
    DropShip dropShip = new DropShip();

    @Test
    @DisplayName("드랍쉽에 마린 3명 태우기")
    public void test1() {
        DropShip dropShip = new DropShip();

        final int createdUnitCount = 3;
        for (int i = 0; i < createdUnitCount; i++) {
            dropShip.load(new Marine());
        }
        int loadedCount = 0;
        for(GroundUnit unit : dropShip.units) {
            if(unit != null) {
                loadedCount++;
            }
            System.out.printf("%d. %s\n", loadedCount, unit);
        }
        System.out.println("loadedCount: " + loadedCount);
        // 첫 번째 인자는 기대하는 값 expected value
        // 두 번째 인자는 실제 처리된 값 actual value
        assertEquals(createdUnitCount, loadedCount);
        assertEquals(createdUnitCount, dropShip.loadedIndex);
    }

    @Test
    @DisplayName("가득 채웠다가 2명 떨구기")
    public void test2() {
        DropShip dropShip = new DropShip();
        for(int i=0; i<dropShip.units.length; i++) {
            dropShip.load(new Marine());
        }
        for(GroundUnit gu : dropShip.units) {
            assertNotNull(gu);
        }
        boolean result = dropShip.load(new Marine());
        assertEquals(false, result);

        GroundUnit gu = dropShip.unload();
        assertNotNull(gu);
        assertNull(dropShip.units[dropShip.units.length - 1]);
        assertEquals(6, dropShip.loadedIndex);

        GroundUnit gu2 = dropShip.unload();
        assertNotNull(gu2);
        assertNull(dropShip.units[dropShip.units.length - 2]);
        assertEquals(5, dropShip.loadedIndex);

        assertNotEquals(gu, gu2);
    }

    @Test
    @DisplayName("한 명도 태우지 않고 unload 시키기")
    public void test3() {
        GroundUnit gu = dropShip.unload();
        assertNull(gu);
        assertEquals(0, dropShip.loadedIndex);
    }

    @Test
    public void test0() {
//
//        int createdUnitCount = 3;
//        for(int i=0; i<createdUnitCount; i++) {
//            clone.load(new SiegeTank());
//        }
//
//        int nullCount = 0;
//        GroundUnit[] units = clone.units;
//        for(GroundUnit gu : units) {
//            if(gu == null) {
//                nullCount++;
//            }
//        }
//        int expectedNullCount = units.length - createdUnitCount;
//        assertEquals(expectedNullCount, nullCount);
//        assertEquals(createdUnitCount - 1, clone.loadedIndex);
    }

}