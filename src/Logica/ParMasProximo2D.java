/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class ParMasProximo2D {
    
    private int cont = 0;
    Point p1v,p2v;
    public ArrayList <Logica.Point> aplicarPMP2D(ArrayList <Logica.Point> vpoints){
        ArrayList <Logica.Point> res = new ArrayList<Logica.Point>(); 
        float distancia = 600.0f;
        int p1x,p1y,p2x,p2y;
        int i;
        int j = 0;
        for( i = 0;i <vpoints.size()-1;i++)
        {
            for( j = i +1; j<vpoints.size();j++)
            {
                Point p1 =  vpoints.get(i);
                Point p2 = vpoints.get(j);
                p1x = p1.getX();
                p1y = p1.getY();
                p2x = p2.getX();
                p2y = p2.getY();
                float diferencia = (float) Math.sqrt(Math.pow((p2x-p1x), 2)+Math.pow((p2y-p1y), 2));
                if(diferencia < distancia)
                {
                    distancia = diferencia;
                    p1v = p1;
                    p2v = p2;
                }
            }
        }
        cont = i * j;
        res.add(p1v);
        res.add(p2v);
        return res;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
}
