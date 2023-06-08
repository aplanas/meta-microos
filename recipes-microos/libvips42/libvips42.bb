SUMMARY = "C/C++ library for processing large images"
DESCRIPTION = "VIPS is an image processing system. It is good with large images \
(images larger than the amount of RAM you have available), with many CPUs, \
for working with colour, for scientific analysis and for general \
research and development."
LICENSE = "LGPL-2.1-only"

PV = "8.13.3"

RPM_NAME = "libvips42-8.13.3-1.5.aarch64.rpm"
RPM_HASH = "1cdb0b11bdf2c9a0b70e2fba807bb59856fb37ab7649e9110c96505f7a0f51f4526d15104ff81f4e037da4885bfecea8155b2ac3e34e08429875cb53d3dbb421"

RPROVIDES:${PN} += "libvips-cpp.so.42()(64bit) libvips.so.42()(64bit) libvips42 libvips42(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenEXR-3_1.so.30()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcfitsio.so.10()(64bit) libexif.so.12()(64bit) libexpat.so.1()(64bit) libfftw3.so.3()(64bit) libfontconfig.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsf-1.so.114()(64bit) libimagequant.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmatio.so.11()(64bit) libopenjp2.so.7()(64bit) liborc-0.4.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangoft2-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) librsvg-2.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libwebp.so.7()(64bit) libwebpdemux.so.2()(64bit) libwebpmux.so.3()(64bit) libz.so.1()(64bit) vips-modules-8.13"

inherit rpm
