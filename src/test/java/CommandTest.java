import cn.edu.fudan.selab.warehouse.Service.Command;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CommandTest extends BaseTest {

    @Autowired
    Command command;

    @Test
    public void commandExecTest() {
        String cmd = "docker pull 120.79.72.242:5000/crowdsourcing";
        command.exeCmd(cmd);
    }


}
