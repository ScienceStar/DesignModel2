package intel.impl;

import intel.AbstractExpression;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lxc
 * @title: TerminalExpression
 * @projectName DesignModel2
 * @description: TODO 终结符表达式类
 * @date 2020/3/23 18:35
 */
public class TerminalExpression implements AbstractExpression {
    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) set.add(data[i]);
    }

    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
