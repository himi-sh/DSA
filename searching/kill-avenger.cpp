#include <bits/stdc++.h>
using namespace std;
#define MAX 500005
typedef long longll;
int ara[MAX], art[MAX];
int arc[MAX], argg[MAX];

int main()
{
    //freopen("ou.txt", "r", stdin);
    int n;
    cin >> n;
    string s;
    cin >> s;
    int count_a = 0, count_t = 0, count_c = 0, count_g = 0, xox;
    for (int i = 0; i < n; i++)
    {
        char c = s[i];
        if (c == 'A')
        {
            count_a++;
        }
        else if (c == 'T')
            count_t++;
        else if (c == 'C')
            count_c++;

        else
            count_g++;

        ara[i] = count_a;
        art[i] = count_t;
        arc[i] = count_c;
        argg[i] = count_g;
    }
    if (count_a == count_t && count_a == count_c && count_a == count_g && count_t == count_c && count_t == count_g && count_c == count_g)
    {
        cout << 0;
        return 0;
    }
    xox = n / 4;

    count_a = xox - count_a;
    if (count_a >= 0)
        count_a = 0;
    else
        count_a = -count_a;

    count_t = xox - count_t;
    if (count_t >= 0)
        count_t = 0;
    else
        count_t = -count_t;

    count_c = xox - count_c;
    if (count_c >= 0)
        count_c = 0;
    else
        count_c = -count_c;

    count_g = xox - count_g;
    if (count_g >= 0)
        count_g = 0;
    else
        count_g = -count_g;

    int ans = n;

    for (int i = 0; i < n; i++)
    {
        int index1, index2, index3, index4;
        if (i == 0)
        {
            index1 = lower_bound(ara + i, ara + n, count_a) - ara;
            cout << 
            if (index1 == n)
                continue;
            index2 = lower_bound(art + i, art + n, count_t) - art;
            if (index2 == n)
                continue;
            index3 = lower_bound(arc + i, arc + n, count_c) - arc;
            if (index3 == n)
                continue;
            index4 = lower_bound(argg + i, argg + n, count_g) - argg;
            if (index4 == n)
                continue;
        }
        else
        {
            index1 = lower_bound(ara + i, ara + n, ara[i - 1] + count_a) - ara;
            if (index1 == n)
                continue;
            index2 = lower_bound(art + i, art + n, art[i - 1] + count_t) - art;
            if (index2 == n)
                continue;
            index3 = lower_bound(arc + i, arc + n, arc[i - 1] + count_c) - arc;
            if (index3 == n)
                continue;

            index4 = lower_bound(argg + i, argg + n, argg[i - 1] + count_g) - argg;
            if (index4 == n)
                continue;
        }

        ans = min(ans, max(index1 - i + 1, max(index2 - i + 1, max(index3 - i + 1, index4 - i + 1))));
    }

    printf("%d\n", ans);
    return 0;
}
