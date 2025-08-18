#include<iostream>
#include<unordered_map>
#include<string>

using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    unordered_map<char, int> freq;

    for (char ch : str) {
        if (isalpha(ch)) {
            ch = tolower(ch); 
            freq[ch]++;
        }
    }

    cout << "Alphabet occurrences:\n";
    for (auto &i: freq) {
        cout << i.first << " : " << i.second << endl;
    }
}