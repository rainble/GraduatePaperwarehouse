import cn.edu.fudan.selab.warehouse.Service.ProcessService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import cn.edu.fudan.selab.warehouse.Domain.Process;

public class processServiceTest extends BaseTest {

    @Autowired
    ProcessService processService;

    @Test
    public void queryProcessByIdTest() {
        Process process = processService.queryProcessById(2);
        System.out.println(process.toString());
    }

}
