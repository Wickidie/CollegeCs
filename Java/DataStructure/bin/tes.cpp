#include <iostream>

using namespace std;

int main() {
    int a1,a2,b1,b2;
    
    cin >> a1 >> a2;
    cin >> b1 >> b2;
    
   if (a1*b2 == a2*b1) {
        cout << "sama";
    }else if (a1*b2 > a2*b1) {
        cout << "lebih besar";
    }else{
        cout << "lebih kecil";
    }
    
    return 0;
}