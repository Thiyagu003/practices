class Stack
{
	int a[]=new int[5];
	int top=-1;
	void push(int data)
	{
		if(top==a.length-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			a[top]=data;
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else{
			System.out.println("popped element:"+a[top]);
			top--;
		}
	}
	void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		Stack a=new Stack();
		a.push(4);
		a.push(7);
		a.pop();
		a.display();
	}
}