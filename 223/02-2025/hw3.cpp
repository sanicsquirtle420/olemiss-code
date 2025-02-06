#include <iostream>
#include <algorithm>
#include <sstream>
#include <string>

using namespace std ;

int secondHex() ;

int main(void) {
    string exp = "" ;

    do {
        int num1 = 0 , num2 = 0 , ans = 0;
        string str1 = "" ;
        cout << "Enter first hex number (ex. 0x44): " ;

        // converting string -> hex -> dec (int)
        cin >> str1 ;
        stringstream ss(str1) ;
        ss >> hex >> num1 ;
        
        // clears buffer
        cin.ignore(100, '\n') ;

        cout << "Enter operation:" << endl ;
        cout << "(NOT , AND , OR , LOGICAL NOT , LOGICAL AND , LOGICAL OR) or EXIT: " ;
        getline(cin , exp) ;

        // capitalizes the user input
        transform(exp.begin() , exp.end() , exp.begin() , ::toupper) ;

        if(exp == "NOT") {
            num1 = ~num1 ;
            cout << "Bitwise NOT of " << str1 << ": 0x" <<  hex << num1 << endl ;
        }
        else if(exp == "AND") {
            num2 = secondHex() ;
            ans = num1 & num2 ;
            cout << "Bitwise AND of (" << str1 << " & " << "0x" << hex << num2 << "): 0x" << hex << ans << endl ;
        }
        else if(exp == "OR"){
            num2 = secondHex() ;
            ans = num1 | num2 ;
            cout << "Bitwise OR of (" << str1 << " | " << "0x" << hex << num2 << "): 0x" << hex << ans << endl ;
        }
        else if(exp == "LOGICAL NOT") {
            num1 = !(num1) ;
            cout << "Logical NOT of " << str1 << ": " << ans << endl ;
        }
        else if(exp == "LOGICAL AND") {
            num2 = secondHex() ;
            ans = (num1 && num2) ;
            cout << "Logical AND of (" << str1 << " && 0x" << hex << num2 << "): " << ans << endl ;
        }
        else if(exp == "LOGICAL OR") {
            num2 = secondHex() ;
            ans == (num1 || num2) ;
            cout << "Logical OR of (" << str1 << " || 0x" << hex << num2 << "): " << ans << endl ;
        }
        else if(exp == "EXIT") {
            cout << "Goodbye!" << endl ;
            break ;
        }
        else {
            cout << "Invalid Input!!" << endl ;
            return 1 ;
        }
    } while(exp != "EXIT") ;

    return 0 ;
}

int secondHex() {
    string tmpS ;
    int tmpI ;
    cout << "Enter second hex number: " ;
    cin >> tmpS ;
    stringstream ss(tmpS) ;
    ss >> hex >> tmpI ;

    return tmpI ;
}
