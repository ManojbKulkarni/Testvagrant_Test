package test;

public class Testvagrant {
	
    public static void main(String[] args)
    {
        int total=0;
        int[] price={1100,900,200,100};
        int[] gst={18,12,28,0};
        int[] quantity={1,4,3,2};
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {
                    total=(price[i]*(gst[j]/100)*quantity[k]);
                   
                }
                
            }
            
        }
        System.out.println("total amount to be paid to the shopkeeper is"+total);
    }
}