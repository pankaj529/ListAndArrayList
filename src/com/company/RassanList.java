package com.company;

import java.util.ArrayList;

public class RassanList {



    private ArrayList<String> RassanList= new ArrayList<String>();

    public void addRassanItem(String item)
    {
        RassanList.add(item);

    }

    public ArrayList<String> getRassanList() {
        return RassanList;
    }

    public void printRassanList()
    {
        System.out.println("you have " + RassanList.size() + " items in your Rassan list ");
        for (int i=0;i<RassanList.size(); i++)
        {
            System.out.println(( i+1 ) + " . " + RassanList.get(i));
        }
    }
     public void modifyRassanitem(String currentItem,String NewItem)
     {
         int position = findItem(currentItem);
         if(position>=0 ){
             modifyRasssanitem(position, NewItem);
         }

     }


    private void modifyRasssanitem(int position, String NewItem)
    {
        RassanList.set(position,NewItem);
        System.out.println("Rassan item " + (position+1) + " has been modified");
    }
    public void removeRassanitem(String item)
    {
        int posiition = findItem(item);
        if(posiition >= 0)
        {
            removeRassanitem(posiition);
        }
    }

     private void removeRassanitem(int position)
    {

        RassanList.remove(position);
    }
    private int findItem(String searchItem)

    {
        //boolean exists=RassanList.contains(searchItem);
        return RassanList.indexOf(searchItem);




    }

    public boolean onfile(String searchItem)
    {
        int position = findItem(searchItem);
        if (position>=0)
        {
            return true;

        }
        return false;

    }


}
