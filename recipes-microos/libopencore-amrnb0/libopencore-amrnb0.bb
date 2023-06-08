SUMMARY = "Shared library part of opencore-amr"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Narrowband speech codec."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amrnb0-0.1.6-1.3.aarch64.rpm"
RPM_HASH = "369b44f611d96e403b294698a9c6e73cbb60ae56d8643525dffdf592e377b96df40c35b9cc93736f76da7243742d6d726572390f7055fdeb920bed378d3b6141"

RPROVIDES:${PN} += "libopencore-amrnb.so.0()(64bit) libopencore-amrnb0 libopencore-amrnb0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
