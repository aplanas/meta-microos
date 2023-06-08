SUMMARY = "Multi-format Image Decoder Library"
DESCRIPTION = "FreeImage is a library for developers who would like to support \
graphics image formats like PNG, BMP, JPEG, TIFF and others as needed \
by today's multimedia applications."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.18.0"

RPM_NAME = "libfreeimage3-3.18.0-6.3.aarch64.rpm"
RPM_HASH = "816402a059f5bf2d998f830389e79d6ee43c2125d1732560bd2f6419e5a4aec5c521d41996e9a4f7f322c3e0404a4b917f544dd758febc382442c12fd7712176"

RPROVIDES:${PN} += "libfreeimage.so.3()(64bit) libfreeimage3 libfreeimage3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libIex-3_1.so.30()(64bit) libImath-3_1.so.29()(64bit) libOpenEXR-3_1.so.30()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libjxrglue.so.0()(64bit) libopenjp2.so.7()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libraw.so.23()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libtiff.so.6(LIBTIFF_4.1)(64bit) libtiff.so.6(LIBTIFF_4.4)(64bit) libwebp.so.7()(64bit) libwebpmux.so.3()(64bit) libz.so.1()(64bit)"

inherit rpm
