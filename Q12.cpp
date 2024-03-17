#include<iostream>
using namespace std;

class company
{
private:
    float salary;
    string date;
    string name; 
public:
    void set()
    {
        cout<<"\n Enter employee details: \n name, salary and date ";
        cin>>name>>salary>>date;
    }
    void get()
    {
        cout<<"\nName: "<<name<<"\nSalary: "<<salary<<"\nDate of joining: "<<date;
    }
};

int main()
{
    int i,count=0,size=3;
    company c[size]; 
    cout<<"\n3 Employee details";
    for ( i = 0; i < size; i++)
    {
        c[i].set(); 
        count++;
    }
    for ( i = 0; i <size; i++)
    {
        c[i].get(); 
        count++;
    }
    return 0;
}

