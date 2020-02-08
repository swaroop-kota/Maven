package com.maven.maven_project;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	int NOO;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Gifts to be Created: ");
        NOO=sc.nextInt();
        GiftBox pack[]=new GiftBox[NOO];
        for(int i=0;i<NOO;i++) {
        	int i1=0,i2=0,i3=0;
        	String s="",c="",cs="";
        	System.out.print("Enter About Sweet in the Box(Name&Weight) "+(i+1));
        	s=sc.next();
        	i1=sc.nextInt();
        	System.out.print("Enter About Chocolates in the  Box(Name&Weight) "+(i+1));
        	c=sc.next();
        	i2=sc.nextInt();
        	System.out.print("Enter About Candies in the Box(Name&Weight) "+(i+1));
        	cs=sc.next();
        	i3=sc.nextInt();
        	pack[i]=new GiftBox(s,i1,c,i2,cs,i3);
        }
        System.out.println("Choose options");
        System.out.println("1.Total weight of each Gift(sweet+chocolate+candies)");
        System.out.println("2.Find gifts corresponding to a specific range");
        int choice=sc.nextInt();
        switch(choice)
        {
               case 1:for(int i=0;i<NOO;i++)
                     {
             	         System.out.print("Total weight in "+(i+1)+" gift:");
             	         System.out.println(pack[i].total);
                     }
                     break;
               case 2:System.out.println("choose options for specific range");
                      System.out.println("1.In total");
                      System.out.println("2.In sweets");
                      System.out.println("3.In chocolates");
                      System.out.println("4.In Candies");
                      System.out.println("Enter choice");
                      int c=sc.nextInt();
                      System.out.println("Enter range");
                      int d=sc.nextInt();
                      int e=sc.nextInt();
                      switch(c)
                      {
                             case 1:int x=0;
                             		for(int i=0;i<NOO;i++)
                             		{
                             			if(pack[i].total>=d && pack[i].total<=e)
                             			{
                             				x=1;
                             				System.out.println("Gift"+(i+1)+pack[i].total);
                             			}
                             		}
                             		if(x==0)
                             		{
                             			System.out.println("There is no Gifts in specified range");
                             		}
                             		break;
                             case 2:int xx=0;
                                    for(int i=0;i<NOO;i++)
                                    {
                        	                if(pack[i].getSweetWeight()>=d && pack[i].getSweetWeight()<=e)
                        	                {
                        	                	    xx=1;
                        		                    System.out.println("In Gift"+(i+1)+pack[i].getSweetName()+":"+pack[i].getSweetWeight());
                        	                }
                                     }
                                    if(xx==0)
                                    {
                               		        System.out.println("There is no sweets in specified range");
                               	    }
                                    break;
                             case 3:int xxx=0;
                                    for(int i=0;i<NOO;i++)
                                    {
                 	                     if(pack[i].getChocolateWeight()>=d && pack[i].getChocolateWeight()<=e)
                 	                     {
                 	                    	     xxx=1;
                 		                         System.out.println("In Gift"+(i+1)+pack[i].getChocolateName()+":"+pack[i].getChocolateWeight());
                 	                     }
                                    }
                                    if(xxx==0)
                                    {
                               		 System.out.println("There is no Gifts in specified range");
                                    }
                                    break;
                             case 4:int xxxx=0;
                                    for(int i=0;i<NOO;i++)
                                    {
                 	                     if(pack[i].getCandiesWeight()>=d && pack[i].getCandiesWeight()<=e)
                 	                     {
                 	                    	     xxxx=1;
                 		                         System.out.println("In Gift"+(i+1)+pack[i].getCandiesName()+":"+pack[i].getCandiesWeight());
                 	                     }
                                    }
                                    if(xxxx==0)
                                    {
                               		        System.out.println("There is no Gifts in specified range");
                               	    }
                                    break;
                      }
                      break;
        }
        
        sc.close();

    }
}
