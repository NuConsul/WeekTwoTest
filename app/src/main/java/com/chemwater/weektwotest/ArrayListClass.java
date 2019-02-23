package com.chemwater.weektwotest;

import java.util.Arrays;

public class ArrayListClass<T> {
    private int i=0;
    private Object obj[];
    private T t;
    public ArrayListClass()
    {
        obj=new Object[5];
    }
    public void add(T t)
    {
        this.t=t;
        if(i==obj.length-1)
        {
            //Increase the Capacity of Array by 50% of it's size
            obj=Arrays.copyOf(obj, obj.length+(obj.length/2));
            System.out.println(obj.length);
        }
        obj[i]=this.t;
        i++;
    }
    public Object get(int i)
    {
        if(obj[i]!=null)
        {
            return obj[i];
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("index:"+i);
        }
    }
    public String toString()
    {
        String temp="";
        for(Object ob:obj)
        {
            if(ob!=null)
            {
                temp=temp+ob+',';
            }
        }
        String temp1=temp.substring(0, temp.length()-1);
        return "["+temp1+"]";
    }
    //
    // @param args

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayListClass<Integer> listVariable1 =new ArrayListClass<Integer>();
        ArrayListClass<String> listVariable2 =new ArrayListClass<String>();
        listVariable1.add(100);
        listVariable1.add(45);
        listVariable1.add(85);
        listVariable2.add("push");
        listVariable2.add("bleek");
        System.out.println(listVariable1+"  "+ listVariable2);
    }
}

/*
3. Create a custom arraylist using generics. The size of the array would be doubled when array limit is reached.
 */


//Practice using the do loop, the while loop, and do-while loop

