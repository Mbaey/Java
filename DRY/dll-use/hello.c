#include<stdio.h>
#include<conio.h>
#include<Windows.h>
//HINSTANCE hDll;
typedef int (*lpGet_id)(void); //���庯������
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
    while ( 1 ){  /* ���ܴ��ڶ������,Ҫȫ��ȡ��,�����һ��Ϊ�� */
        key = getch();
        printf("%d", key);
        putchar('\n');
    }

	return 0;
}
