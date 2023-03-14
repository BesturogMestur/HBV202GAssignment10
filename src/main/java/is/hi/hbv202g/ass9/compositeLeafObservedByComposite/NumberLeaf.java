package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf extends Observable implements MathExpressions {
    private int value;

    public NumberLeaf(int value){
        this.value=value;
    }

    public void setValue(int value){
        this.value=value;
        notifyObservers();
    }


    public int getResult(){
        return value;
    }
}
