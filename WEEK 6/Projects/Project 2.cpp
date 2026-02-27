#include <iostream>
using namespace std;

int main(){
	int a,b,temp;
	int *p1,*p2;
	
	cout<<"Enter two numbers"<<endl;
	cout<<"Enter a:";
	cin>>a;
	cout<<"Enter b:";
	cin>>b;
	
	p1=&a;
	p2=&b;
	
	temp=*p1;
	*p1=*p2;
	*p2=temp;
	
	cout<<"After Swapping"<<endl;
	cout<<"a:"<<a<<endl;
	cout<<"b:"<<b<<endl;
	
	
	return 0;
}
