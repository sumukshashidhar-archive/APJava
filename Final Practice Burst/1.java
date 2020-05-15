public class Gizmo {


    public String getMaker() {
        return("ABC");
    }

    public boolean isElectronic() {
        return(true);
    }

    public boolean equals(Object other) {
        return(false);
    }

    public float price(Object object) {
        return(200.2);
    }
}

public class OnlinePurchaseManager() {

    private ArrayList<Gizmo> purchases; 


    public int countElectronicsByMaker ( String maker) {
        int ctr = 0;
        for(Gizmo giz: purchases) {
            if(giz.getMaker() == maker) {
                if(giz.isElectronic() == true) {
                    ctr = ctr + 1; 
                }
            }
        }
        return(ctr);
    }

    public boolean hasAdjacentEqualPair() {
        boolean flag = false;
        if(size(purchases) >= 2) {
            for(int i=0; i < size(purchases)-1; i++ ) {
                if(purchases[i].equals(purchases[i+1])) {
                    return true; 
                }
            }
        }
    }

    public Gizmo getCheaperGizmoByMaker(String maker) {
        
    }
}


public class 1 {
    public static void main() {
        OnlinePurchaseManager opm = new OnlinePurchaseManager();
        opm.countElectronicsByMaker("ABC")
    }
}


/* 
First I would make another method in the gizmo object:
    that returns the price, given an object

Then I would make another method in the onlinePurchaseManager Object:
    That goes through the purchases list, and searches for the max by using a temp variable

*/