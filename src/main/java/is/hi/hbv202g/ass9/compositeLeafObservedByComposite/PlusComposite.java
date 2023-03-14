package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpressions {

    private List<MathExpressions> comps = new ArrayList<MathExpressions>();
    private int lastObservedResult;

    public void add(MathExpressions l) {
        comps.add(l);
    }

    public void remove(MathExpressions l) {
        comps.remove(l);
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.println(""+lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    @Override
    public int getResult() {
        int suma =0;
        for (MathExpressions leaf : comps) {
            suma += leaf.getResult();
        }
            return suma;
        }
    }
