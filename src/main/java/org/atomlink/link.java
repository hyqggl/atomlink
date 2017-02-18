package org.atomlink;


public class link
{

    private atom node1;
    private atom node2;
    private double strength_forward;
    private double strength_backword;

    public link(atom a1, atom a2)
    {
        node1 = a1;
        node2 = a2;
        //0 to 100
        strength_forward = Util.iniLinkStrength_forward;
        strength_backword = Util.iniLinkStrength_backward;
    }

    public boolean strengthChange(int linkDir, int changeDir)
    {
        if (linkDir == 0 || changeDir == 0)
        {
            return false;
        }

        if (linkDir > 0)
        {
            if(changeDir > 0)
            {
                strength_forward = strength_forward < 10? 10 : strength_forward;
                strength_forward = strength_forward > 50 ? 100 : strength_forward * 2;
            } else
            {
                //changeDir < 0
                strength_forward *= 3/4;
            }
        } else
        {
            //linkDir < 0
            if(changeDir > 0)
            {
                strength_backword = strength_backword < 10? 10 : strength_backword;
                strength_backword = strength_backword > 50 ? 100 : strength_backword * 2;
            } else
            {
                //changeDir < 0
                strength_backword *= 3/4;
            }
        }
    }
}
