import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class PhilatelisTest extends PhilatelistBaseTest {
    @Override
    protected Philatelist getPhilatelist() {
        return new PhilatelistImplementation();
    }
}
