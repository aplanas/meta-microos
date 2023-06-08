SUMMARY = "Java Wrapper for the EditLine Library"
DESCRIPTION = "libreadline-java provides Java bindings for libedit though a JNI \
wrapper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libreadline-java-0.8.3-1.4.aarch64.rpm"
RPM_HASH = "55fa975e31fa37d07fefbe1c276d114c2f216c441d9d5faaea76002c2c957ecee03612fbb64e3948d45a7b76a12801640c5db3839db1333b6340c160cd0c27e6"

RPROVIDES:${PN} += "gnu.readline java_readline libJavaEditline.so()(64bit) libreadline-java libreadline-java(aarch-64)"
RDEPENDS:${PN} += "java libc.so.6(GLIBC_2.17)(64bit) libedit libedit.so.0()(64bit)"

inherit rpm
