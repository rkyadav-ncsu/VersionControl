import java.util.*;

public class Backup
{   static int arr[]; static int rewardSwap=0; static int rewardStay=0;
    public static void main()
    {  
       int number= 100000; int c1=0; int c2=0; 
       for(int j=0; j<number; j++) 
       { 
        Random gen = new Random();
        arr= new int[4];
        int g=gen.nextInt(4); 
        //Choose a random door. Put the car in it.
        
        arr[g]= 1;
        //Randomly choosing a door
        int choice=0;
        
         choice = gen.nextInt(4);   
         
        //Choosing a door with a goat and opening it.
        int k=ImprobableRoom(choice);
        
        int array[]=new int[2]; 
        int c=0;
                
           for(int i=0;i<4;i++)
            {
                if(i!=choice && i!=k)
                {   
                    if(c<array.length)
                    array[c]=i;
                    c=c+1;
                }
            }
            
            
        int swapChoice=gen.nextInt(2);
        int z=array[swapChoice];
            
           if(arr[z]==1)
           {rewardSwap+=20000; c1++;}
           else
           rewardSwap+=50;
 
           if(arr[choice]==1)
           {rewardStay+=20000; c2++;}
           else
           rewardStay+=50;
        }
        
        
        
        System.out.println("Number of wins on swapping "+c1);
        System.out.println("Number of wins on not swapping "+c2);
        System.out.println("Probability of wins on swapping= "+ ((float)c1/(float)number));
        System.out.println("Probability of wins on not swapping= "+ ((float)c2/(float)number));
        
        System.out.println("Expected values are Reward on Swapping= "+rewardSwap+"$ and Reward on Staying= "+rewardStay+"$");
        }
        
    

  
static int ImprobableRoom(int choice)
{   int cheat; Random generate= new Random();
    do
    {
        cheat=generate.nextInt(4);
    }
    while(arr[cheat]==1 || cheat==choice) ;   
    return cheat;
}
}

