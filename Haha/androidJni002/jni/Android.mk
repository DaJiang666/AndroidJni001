LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := androidJni002
LOCAL_SRC_FILES := androidJni002.cpp

include $(BUILD_SHARED_LIBRARY)
