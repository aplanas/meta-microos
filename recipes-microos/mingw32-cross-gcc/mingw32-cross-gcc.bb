SUMMARY = "MinGW Windows cross-compiler (GCC) for C"
DESCRIPTION = "MinGW Windows cross-compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-cross-gcc-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "d749492bc59c063dbbf451e888babcf9581694c3c4140c41f5635f245942154c0c20d9fdcfc3b1a91714419330559435df04f83983d48aae8c48200f8369efab"

RPROVIDES:${PN} += "liblto_plugin.so()(64bit) \
mingw32-cross-gcc \
mingw32-cross-gcc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
mingw32-cross-binutils \
mingw32-cross-cpp \
mingw32-filesystem \
mingw32-headers \
mingw32-runtime"

inherit rpm
