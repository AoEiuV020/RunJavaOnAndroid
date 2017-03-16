# 重点都在/app/build.gradle里
主要就是写了几个task,  
首先要确保已经通过adb连接安卓，  
```sh
./gradlew dalvikvm
```

## dx
使用dx命令将所有jar打包成dex,  

## push
使用adb push将dex推到安卓里的/data/local/tmp目录下,  

## dalvikvm
使用adb shell调用安卓命令dalvikvm运行程序，  
