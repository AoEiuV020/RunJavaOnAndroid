#!/usr/bin/env sh
set -e
res_path=$(dirname $0)/src/main/resources
tmp_folder='/tmp'
download(){
    jna_commit='77caa1cbf86eb1b41f2b201a78c847b6e0f58fdb'
    jar_name=android-$1.jar
    curl -o $tmp_folder/$jar_name "https://raw.githubusercontent.com/java-native-access/jna/$jna_commit/lib/native/$jar_name"
}
add_resources(){
    download $1
    jar_name=android-$1.jar
    jar_file=$tmp_folder/$jar_name
    arch=android-$1
    extract_path=$res_path/com/sun/jna/$arch
    mkdir -p $extract_path
    pwd_old=$PWD
    cd $extract_path
    jar -xvf $jar_file libjnidispatch.so
    cd $pwd_old
    rm $tmp_folder/$jar_name
}

add_resources 'aarch64'
add_resources 'arm'
add_resources 'armv7'
add_resources 'mips'
add_resources 'mips64'
add_resources 'x86-64'
add_resources 'x86'
