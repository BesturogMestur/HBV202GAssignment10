package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite extends SuperDuper {


    @Override
        public int getResult() {
            int suma = 1;
            for (MathExpressions leaf : comps) {
                suma *= leaf.getResult();
            }
            return suma;
        }
    }
