package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class Observable{

    private List<Observer> obsevers= new ArrayList<Observer>();

    public void attach(Observer obsever){
        obsevers.add(obsever);
    }

    public void detach(Observer obsever){
        obsevers.remove(obsever);
    }

    public void notifyObservers(){
        for (Observer o: obsevers) {
            o.update();
        }
    }
}
