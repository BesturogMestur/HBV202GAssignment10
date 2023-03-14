package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpressions, Observer {

    private List<MathExpressions> comps = new ArrayList<MathExpressions>();
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

    @Override
        public int getResult() {
            int suma = 1;
            for (MathExpressions leaf : comps) {
                suma *= leaf.getResult();
            }
            return suma;
        }
    }
