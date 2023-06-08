SUMMARY = "Library for encoding and decoding JPEG XL raster graphic images"
DESCRIPTION = "JPEG XL is a raster-graphics file format that supports both lossy and \
lossless compression."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "libjxl0_8-0.8.1-3.1.aarch64.rpm"
RPM_HASH = "5e8ad3687ae732d2c3e949e261c0c04288530e13601688419eb0e6a0e24e15aecaa7128c802e5cf096c3ddaa73ef93554c6c9f0a7afd412f31cec213e712bfd9"

RPROVIDES:${PN} += "libjxl.so.0.8()(64bit) libjxl.so.0.8(JXL_0)(64bit) libjxl0_8 libjxl0_8(aarch-64) libjxl_threads.so.0.8()(64bit) libjxl_threads.so.0.8(JXL_0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libbrotlienc.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libhwy.so.1()(64bit) libhwy.so.1(HWY_0)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
