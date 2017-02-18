package org.atomlink;


public class linkMap {


    class atom_container
    {

    }

    class link_combo_containner
    {
        
    }

    public boolean setLink(atom a1, atom a2)
    {
        link l1 = new link(a1, a2);
        a1.next.add(l1);
        a2.before.add(l1);
        return true;
    }

    private boolean hasDirectLink(atom a, atom b)
    {

    }
}
