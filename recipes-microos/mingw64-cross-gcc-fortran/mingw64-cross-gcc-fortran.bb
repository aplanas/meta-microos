SUMMARY = "MinGW Windows cross-compiler for Fortran"
DESCRIPTION = "MinGW Windows cross-compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-fortran-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "e2f726669508395b70a106d17346dcb12524ffd05f69f6264b40e86026ef26af8165f297de7599de7ebd9adfcaf46c8b95214f20ce1f47b1b957cb95b1cfa652"

RPROVIDES:${PN} += "mingw64-cross-gcc-fortran \
mingw64-cross-gcc-fortran(aarch-64)"
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
