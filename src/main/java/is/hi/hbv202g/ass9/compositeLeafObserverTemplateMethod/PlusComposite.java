package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends SuperDuper implements MathExpressions , Observer {


    @Override
    public int getResult() {
        int suma =0;
        for (MathExpressions leaf : comps) {
            suma += leaf.getResult();
        }
            return suma;
        }
    }
