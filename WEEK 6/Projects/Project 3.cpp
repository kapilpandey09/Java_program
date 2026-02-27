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
	
	
	cout<<"value of a="<<a<<endl;
	cout<<"Address of a="<<p1<<endl;
	cout<<"value of b:"<<b<<endl;
	cout<<"Address of b="<<p2<<endl;
	
	
	return 0;
}
