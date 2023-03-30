package Personal;

import java.math.BigDecimal;

public class Manager extends Personal{
    private BigDecimal bonus;
    //masi rezervacii

    public Manager(String name , String jobDescription , BigDecimal salary , BigDecimal bonus) {
        super (name , jobDescription , salary);
        this.bonus = bonus;
    }

}
