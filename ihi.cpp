#include <iostream>
using namespace std;
class temperature
{
    float tc,tf;
    public:
    void getdata()
    {
        cout<<"Enter the Temperature in Fahrenheit"<<endl;
        cin>>tf;
    }
    void display()
    {
        tc=(tf-32)*5/9;
        cout<<"The required Temperature in Degree Celcuis is"<<tc;
    }
};

int main()
{
    temperature t1;
    t1.getdata();
    t1.display();

    
    return 0;
}