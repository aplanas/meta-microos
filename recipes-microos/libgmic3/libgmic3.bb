SUMMARY = "Shared library that belongs to gmic"
DESCRIPTION = "This shared library allows using gmic functionality from other \
programs."
LICENSE = "CECILL-2.1"

PV = "3.2.3"

RPM_NAME = "libgmic3-3.2.3-2.1.aarch64.rpm"
RPM_HASH = "4ab8680e11a8f04537f2cd2359bd91a833946205e87ae2628c58f9d5224d0650d89a367786a2ae255f1a4455076ea63f94158c52c387e0a25d2a3abac7e39d79"

RPROVIDES:${PN} += "libgmic.so.3()(64bit) libgmic3 libgmic3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImath-3_1.so.29()(64bit) libOpenEXR-3_1.so.30()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libfftw3.so.3()(64bit) libfftw3_threads.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
