package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class SuperDuper {
    protected List<MathExpressions> comps = new ArrayList<MathExpressions>();
    private int lastObservedResult;

    public void add(MathExpressions l) {
        comps.add(l);
        update();
    }

    public void remove(MathExpressions l) {
        comps.remove(l);
        update();
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.println(""+lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }


    public abstract int getResult();


}
