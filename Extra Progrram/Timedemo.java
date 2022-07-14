class Time
{
	int hour;
	int minute;
	int second;
	
	public Time(int hour,int minute,int second)
	{
	this.hour=hour;
	this.minute=minute;
	this.second=second;
	}
	
	void addtime(Time t)
	{
	this.second=this.second+t.second;
	while(this.second>60)
	{
		if(this.second>=60)
		{
			this.minute++;
			this.second=this.second-60;
		}
	}
	this.minute=this.minute+t.minute;
	while(this.minute>60)
	{
		if(this.minute>=60)
		{
			this.hour++;
			this.minute=this.minute-60;
		}
	}
	this.hour=this.hour+t.hour;
	}
}

class Timedemo
{
	public static void main(String[] args)
	{
		Time t1=new Time(11,120,120);
		Time t2=new Time(12,5,5);
		t2.addtime(t1);
		System.out.println(t2.hour+":"+t2.minute+":"+t2.second);
	}
}