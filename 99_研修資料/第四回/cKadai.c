#include <stdio.h>

void
add(int *hensu)
{
	(*hensu) = (*hensu) + 1;
}

void
main()
{
	int usi = 1;
	int kotae = ;

	add(&usi);
  
	if(usi == kotae)
	{
	    printf("正解！");
	}
	else
	{
	    printf("だめ。。");
	}

}