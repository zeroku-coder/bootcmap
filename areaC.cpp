#include<iostream>
using namespace std;
#include<conio.h>
	double circle(int r)
{
double area=3.14*r*r;
cout<<"Area of circle is "<<area;
return area;
}
int main()
{
	int r;
	cout<<"enter the radiusof circle\n";
	cin>>r;
	circle(r);
	
}
