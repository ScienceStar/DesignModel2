package intel.impl;

import intel.AbstractExpression;

/**
 * @author lxc
 * @title: NonterminalExpression
 * @projectName DesignModel2
 * @description: TODO 非终结符表达式类
 * @date 2020/3/23 18:36
 */
public class NonterminalExpression implements AbstractExpression {
    private AbstractExpression city=null;
    private AbstractExpression person=null;
    public NonterminalExpression(AbstractExpression city,AbstractExpression person)
    {
        this.city=city;
        this.person=person;
    }
    public boolean interpret(String info)
    {
        String s[]=info.split("的");
        return city.interpret(s[0])&&person.interpret(s[1]);
    }
}
