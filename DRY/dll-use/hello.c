#include<stdio.h>
#include<conio.h>
#include<Windows.h>
//HINSTANCE hDll;
typedef int (*lpGet_id)(void); //定义函数类型
lpGet_id say;
int main() {
//	HINSTANCE hdll;
//	hdll = LoadLibrary("libdll-test.dll");
//	if (hdll == NULL) {
//		FreeLibrary(hdll);
//	}
//	say = (lpGet_id) GetProcAddress(hdll, "say");
//	say();
    puts("HEllo");
    char key='s';
    printf("%d", key);
    while ( 1 ){  /* 可能存在多个按键,要全部取完,以最后一个为主 */
        key = getch();
        printf("%d", key);
        putchar('\n');
    }

	return 0;
}
