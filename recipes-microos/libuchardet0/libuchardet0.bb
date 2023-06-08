SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "libuchardet0-0.0.8-1.3.aarch64.rpm"
RPM_HASH = "168edfca1a157db35510f513c2af638922def738ac8c8be22f37109a612f4cc55266ce428c62f2b68db03164c774a08b9e14a89858df2bd6448b35f56a5aadbf"

RPROVIDES:${PN} += "libuchardet.so.0()(64bit) libuchardet0 libuchardet0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
