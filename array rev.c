#include <stdio.h>
int main()
{
    int n, arr[50], i;
    int rev[50];
    printf("Enter number of elements:\n");
    scanf("%d", &n);
    printf("Enter elements of array:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (i = n - 1; i = 0; i--)
    {
        printf("%d", arr[i]);
    }
    printf("\n");
    return 0;
}