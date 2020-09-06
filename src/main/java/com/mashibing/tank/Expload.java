package com.mashibing.tank;

import java.awt.*;

public class Expload {

    private int x,y;
    private boolean living = true;
    private TankFrame tf = null;

    public static int WIDTH = ResourceMgr.bulletD.getWidth();
    public static int HEIGHT = ResourceMgr.bulletD.getHeight();

    public Expload(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;
    }

    private int step = 0;
    public void paint(Graphics g) {
        g.drawImage(ResourceMgr.exploads[step++],this.x,this.y,null);
        if(step>=ResourceMgr.exploads.length){
            step=0;
        }
    }
}
