// @BEGIN_OF_SOURCE_CODE
 
#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <string>
#include <cctype>
#include <stack>
#include <queue>
#include <list>
#include <vector>
#include <map>
#include <sstream>
#include <cmath>
#include <bitset>
#include <utility>
#include <set>
#define INT_MAX 2147483647
#define INT_MIN -2147483648
#define pi acos(-1.0)
#define N 1000000
#define LL long long
using namespace std;
 
int main ()
{
    int testCase;
    scanf ("%d", &testCase);
 
    while ( testCase-- ) {
        char fir [20], sec [20], res [50];
        scanf ("%s %s", fir, sec);
 
        reverse (fir, fir + strlen (fir));
        reverse (sec, sec + strlen (sec));
 
        sprintf (res, "%d", atoi (fir) + atoi (sec));
 
        reverse (res, res + strlen (res));
 
        printf ("%d\n", atoi (res));
    }
 
    return 0;
}
 
// @END_OF_SOURCE_CODE
