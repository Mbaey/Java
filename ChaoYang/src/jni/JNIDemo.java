package jni;  
public class JNIDemo {  
    //����һ�����ط���  
    public native void sayHello();  
    public static void main(String[] args){  
        //���ö�̬���ӿ�  
        System.loadLibrary("JNIDemo");  
        JNIDemo jniDemo = new JNIDemo();  
        jniDemo.sayHello();  
    }  
}  