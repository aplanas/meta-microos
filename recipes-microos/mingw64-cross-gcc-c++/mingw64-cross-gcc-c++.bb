SUMMARY = "MinGW Windows cross-compiler for C++"
DESCRIPTION = "MinGW Windows cross-compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-cross-gcc-c++-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "4df26cd0751246305ad22f2af01d8e6383f42276e6d0c007a6eede6eedd6d63dbfdeb8ff78efb227095fa0614b64f8b80ef01eef76a07db98ee788b7a83949a4"

RPROVIDES:${PN} += "mingw64-cross-gcc-c++ mingw64-cross-gcc-c++(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) mingw64-cross-gcc"

inherit rpm
