#include <iostream>
using namespace std;

int main(){
	int a;
	int *p1,*p2;
	
	cout<<"Enter a number"<<endl;
	cout<<"Enter a:";
	cin>>a;
	
	
	p1=&a;
	p2=&a;
	
	
	(*p1)++;
	cout<<"After Increment value of a="<<*p1<<endl;
	
	
	(*p2)--;
	cout<<"After Decrement value of a="<<*p2<<endl;
	
	
	return 0;
}
