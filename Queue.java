class Queue
{
int a[]=new int[5];
int r=-1;
int f=-1;
   void enqueue(int data)
   {
   if(r==a.length-1)
   {
   System.out.println("Queue is full");
   }
   else if(r==-1 && f==-1)
   {
   r=0;
   f=0;
   a[r]=data;
   }
   else{
   r++;
   a[r]=data;
   }
   }
   void deque()
   {
   if(r==-1 && f==-1)
   {
   r=-1;
   f=-1;
   System.out.println("queue is wmpty");
   }
   else if(r==f)
   {
   System.out.println("popped element"+a[r]);
   }
   else{
	   System.out.println("popped element:"+a[f]);
   f++;
   }
   
   }
   void display()
   {
   for(int i=f;i<=r;i++)
   {
   System.out.print(a[i]+" ");
   }
   }
    public static void main(String args[])
	{
	Queue a=new Queue();
	a.enqueue(3);
	a.enqueue(5);
	a.enqueue(10);
	a.deque();
	a.display();
	}
}