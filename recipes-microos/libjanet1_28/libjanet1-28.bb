SUMMARY = "Lisp-like functional and imperative programming language"
DESCRIPTION = "Janet is a functional and imperative programming language. \
It runs on Windows, Linux, macOS, BSDs, and should run on other systems with some porting. \
The entire language (core library, interpreter, compiler, assembler, PEG) is less than 1MB. \
You can also add Janet scripting to an application by embedding a single C source file and a single header."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "libjanet1_28-1.28.0-1.1.aarch64.rpm"
RPM_HASH = "33d77990e3fc94ba7d782be32b236d3109d8f74e329328d06fe835f584bc2072570a54acc07fb6e3e33f9e04cbcc143ffd60159ee009548dd4ab831edfbb6f15"

RPROVIDES:${PN} += "libjanet.so.1.28()(64bit) libjanet1_28 libjanet1_28(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
