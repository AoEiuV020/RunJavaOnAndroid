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

# app
一个hello仅此而已，  

# okhttp
使用okhttp3请求"http://baidu.com",  
主要是证明这个可以自动处理依赖，  
okhttp3依赖的okio自动包含了，  

# groovyShell(已删除)
想在安卓上运行GroovyShell，  
失败，  

# json
调用安卓自带的json库，  
jdk上并不存在，所以电脑上运行失败，安卓上运行正常，  
主要是证明现在编译时是在android.jar找原生类，  
