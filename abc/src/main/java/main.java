import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class main {
    static Logger logger=LoggerFactory.getLogger(main.class);
    public static void main(String[] args) {
        logger.debug("sadasd");
        List<Integer> li=new ArrayList<Integer>();
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        try {
            for (int i = 0; ; i++) {
                System.out.println(li.get(i));
            }
        }catch (Exception e){
            System.exit(0);
            System.out.println("loi");
        }
    }

}
