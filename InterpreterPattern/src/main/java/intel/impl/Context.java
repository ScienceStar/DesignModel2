package intel.impl;

import intel.AbstractExpression;

/**
 * @author lxc
 * @title: Context
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 18:37
 */
public class Context {
    private String[] citys = {"韶关", "广州"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private AbstractExpression cityPerson;

    public Context() {
        AbstractExpression city = new TerminalExpression(citys);
        AbstractExpression person = new TerminalExpression(persons);
        cityPerson = new NonterminalExpression(city, person);
    }

    public void freeRide(String info) {
        boolean ok = cityPerson.interpret(info);
        if (ok) System.out.println("您是" + info + "，您本次乘车免费！");
        else System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
    }
}
