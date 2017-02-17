package org.atomlink;


import java.util.List;

/**
 * Created by huyiqing on 2017/2/17.
 */
public class linkMap {
    class atom
    {
        List<link> front;
        List<link> behind;

    }

    class container
    {
        
    }

    class link
    {
        atom from;
        atom to;
        short strength;
        short strength_reverse;
    }

    private boolean hasLink(atom a, atom b)
    {

    }
}
