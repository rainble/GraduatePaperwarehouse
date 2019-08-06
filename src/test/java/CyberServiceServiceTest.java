import cn.edu.fudan.selab.warehouse.Service.CyberServiceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CyberServiceServiceTest extends BaseTest {

    @Autowired
    CyberServiceService cyberServiceService;

    @Test
    public void downloadTest() {
        cyberServiceService.downloadCyberServiceById("test");
    }

}
