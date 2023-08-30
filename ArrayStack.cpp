#include <iostream>
using namespace std;

#define CAPACITY 10
  
class ArrayStack {
    int t;
  
public:
    int arr[CAPACITY]; 
  
    ArrayStack() { t = -1; }
    void push(int element);
    int pop();
    int top();
    bool isEmpty();
    int size();
    void print();
};


    void ArrayStack::push(int element)
    {
        if (t ==(CAPACITY - 1))
        {
            return;
        }
        else
        {
            t++;
            arr[t] = element;
        }
    }

  
int ArrayStack::pop()
{
        if (isEmpty())
        {
            return -1;
        }
        else
        {
            int temp = arr[t];
            arr[t] = -1;
            t--;
            return temp;
        }
    }
int ArrayStack::top()
{
        if (isEmpty())
        {
            return -1;
        }
        else
        {
            return arr[t];
        }
}
  
bool ArrayStack::isEmpty()
{
    return t == -1;
}

int ArrayStack::size(){
    return t + 1;
}

void ArrayStack::print(){
    for (int i = 0; i <= t; i++)
    {
        cout << arr[i] << "\t";
    }
    cout <<endl;
    
}

int main()
{
    ArrayStack stack;

    stack.push(2);
    stack.push(5);
    stack.push(10);

    stack.pop();
    
    stack.print();

    return 0;
}