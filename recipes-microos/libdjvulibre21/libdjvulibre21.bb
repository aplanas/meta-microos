SUMMARY = "DjVu rendering library"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "libdjvulibre21-3.5.28-4.6.aarch64.rpm"
RPM_HASH = "5b7eab300a2a26f399149ce681a1d2472920fb92bbcda1a7ce02997e86b8a804fdafbe71243d5290f8baac0cad8122854dc130ef03a91c9217610dcc48621bd2"

RPROVIDES:${PN} += "libdjvulibre.so.21()(64bit) libdjvulibre21 libdjvulibre21(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
