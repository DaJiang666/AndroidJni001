#include <jni.h>

#include "com_example_androidjni002_JniTest.h"

JNIEXPORT jint JNICALL Java_com_example_androidjni002_JniTest_getCount
  (JNIEnv *env, jclass clazz, jint x, jint y){
	int m = x + y;
	return m;
}
