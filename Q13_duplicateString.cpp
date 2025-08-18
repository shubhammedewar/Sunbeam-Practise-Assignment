#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    
    int n;
    cout<<"Enter length of string:";
    cin>>n;
    string st[n];

    for(int i=0;i<n;i++){
        string s;
        cout<<"Enter string: ";
        cin>>s;
        st[i] = s;
    }
    

    for (int i = 0; i < n; i++)
    {
        bool dup = false;
        for (int  j= i+1; j < n; j++)
        {
            if(st[i] == st[j]){
                if(!dup)    cout<<st[i] + " ";
                dup = true;
                st[j] = rand();
            }
        }
           
    }
    

}