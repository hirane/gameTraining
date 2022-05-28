#include <stdio.h>

void
add(int* hensu1, int* hensu2)
{
	(*hensu1) = (*hensu1) + 1;
	(*hensu2) = (*hensu2) + 2;
}

void
main()
{
	int hensu1 = 10;
	int hensu2 = 10;

	add(&hensu1, &hensu2);

	printf("%d", hensu1);
	printf("%d", hensu2);

}