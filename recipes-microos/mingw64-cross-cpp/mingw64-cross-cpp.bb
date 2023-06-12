SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-cpp-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "625847e360ddb45655b50d8065d2b96ead8b6a82b3345f618aa6288b6575d66413c210b28f270eae73dbbc2cdd13fdf02594d83926e1a7202a2cefeaad70bea5"

RPROVIDES:${PN} += "mingw64-cross-cpp \
mingw64-cross-cpp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
