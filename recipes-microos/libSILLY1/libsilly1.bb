SUMMARY = "Simple Image Loading LibrarY"
DESCRIPTION = "SILLY means Simple Image Loading LibrarY. The aim of this library is to provide \
a simple library for loading image in the context of CEGUI. The library supports \
only the most common image format. The project was initially launch in order \
to provide an MIT based replacement of DevIL with less image format supported \
and focused on loading image only."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libSILLY1-0.1.0-1.8.aarch64.rpm"
RPM_HASH = "314e724ae7fb9a578604916c6fd882edcd0e6d86caa525ff5dd3caa44d059d8280cd9a35c304790eef5ea984c51ea04ae6e517a36f968f937592a7b56606168e"

RPROVIDES:${PN} += "libSILLY.so.1()(64bit) libSILLY1 libSILLY1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
