package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpressions {

    private List<MathExpressions> comps=new ArrayList<MathExpressions>();


    public void add(MathExpressions l){
        comps.add(l);
    }

    public void remove(MathExpressions l){
        comps.remove(l);
    }

    public int getResult(){
        int a=1;
        for (MathExpressions leaf:comps) {
            a*=leaf.getResult();
        }

        return a;
    }
}
