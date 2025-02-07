#include <iostream>
#include <algorithm>
#include <sstream>
#include <string>

using namespace std ;

int getHex(string iter) ;
string hexStr(int val) ;

int main(void) {
    string exp = "" ;

    do {
        int num1 = getHex("first") ;
        int num2 = 0 , ans = 0;
        string str1 = hexStr(num1) , str2 = ""  , ansStr = "" ;
        
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
            num2 = getHex("second") ;
            str2 = hexStr(num2) ;
            ans = num1 & num2 ;
            cout << "Bitwise AND of (" << str1 << " & " << str2 << "): 0x" << hex << ans << endl ;
        }
        else if(exp == "OR"){
            num2 = getHex("second") ;
            str2 = hexStr(num2) ;
            ans = num1 | num2 ;
            cout << "Bitwise OR of (" << str1 << " | " << str2 << "): 0x" << hex << ans << endl ;
        }
        else if(exp == "LOGICAL NOT") {
            num1 = !(num1) ;
            cout << "Logical NOT of " << str1 << ": " << ans << endl ;
        }
        else if(exp == "LOGICAL AND") {
            num2 = getHex("second") ;
            str2 = hexStr(num2) ;
            ans = (num1 && num2) ;
            cout << "Logical AND of (" << str1 << " && " << str2 << "): " << ans << endl ;
        }
        else if(exp == "LOGICAL OR") {
            num2 = getHex("second") ;
            str2 = hexStr(num2) ;
            ans = (num1 || num2) ;
            cout << "Logical OR of (" << str1 << " || " << str2 << "): " << ans << endl ;
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

int getHex(string iter) {
    string tmpS ;
    int tmpI ;
    cout << "Enter the " << iter << " hex number (ex. 0x44): " ;
    cin >> tmpS ;
    stringstream ss(tmpS) ;
    ss >> hex >> tmpI ;

    return tmpI ;
}

string hexStr(int val) {
    stringstream ss ;
    ss << hex << val ;
    string tmp = ss.str() ;
    return "0x" + tmp ;
}
