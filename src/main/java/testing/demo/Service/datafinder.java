package testing.demo.Service;

import testing.demo.Entity.Employes;

import java.util.ArrayList;
import java.util.List;

public class datafinder {

    public List<Employes> myEmps = new ArrayList<>();
    
    //test


    public List<Employes> getNewData(String name) {
        if (name == "test") {
            myEmps.add(new Employes(123, "praveen", "23"));
            myEmps.add(new Employes(124, "seetha", "23"));
            myEmps.add(new Employes(125, "Ravi", "23"));
            return myEmps;
        } else {
            return new ArrayList<>();
        }

    }






    }

