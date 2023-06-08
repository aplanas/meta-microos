SUMMARY = "Provides XSPF playlist reading and writing support"
DESCRIPTION = "libxspf brings XSPF playlist reading and writing support to your C++ \
application. Both version 0 and 1 are supported. libxspf uses Expat \
for XML parsing and CppTest for unit testing. libxspf is the official \
reference implementation for XSPF of the Xiph.Org Foundation. Features \
* Full conformance to the XSPF specification \
* Cross-platform (Unix, Windows, Mac OS X, ...) \
* Read and write XSPF files \
* XSPF-0 and XSPF-1 support \
* Unicode support \
* Full support for XSPF extensions \
* Full support for XML namespaces \
* Fast (XML parsing is done by Expat) \
* Uses unit testing \
* Liberal license: New BSD license"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "libxspf4-1.2.1-1.6.aarch64.rpm"
RPM_HASH = "dc0d9e60d1759cc268e5be018e848086564dfc03f9fdc9c15bf7d475f1ada0dc160bf9159548dadc73b0835093b13eea08604e1a494c9f42ab496a8e0ec5ce0f"

RPROVIDES:${PN} += "libxspf.so.4()(64bit) libxspf4 libxspf4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libexpat.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) liburiparser.so.1()(64bit)"

inherit rpm
