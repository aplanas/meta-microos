SUMMARY = "Library for Reading and Writing Images"
DESCRIPTION = "OpenImageIO is a library for reading and writing images, and a bunch of related \
classes, utilities, and applications. There is a particular emphasis on formats \
and functionality used in professional, large-scale animation and visual \
effects work for film. OpenImageIO is used extensively in animation and VFX \
studios all over the world, and is also incorporated into several commercial \
products."
LICENSE = "BSD-3-Clause"

PV = "2.4.8.1"

RPM_NAME = "libOpenImageIO2_4-2.4.8.1-1.5.aarch64.rpm"
RPM_HASH = "fe4f5a7d6feca9fb6fee067202a9083c7d8f9c7cd26336c2f9e86a9dffd0edd3fb5d572a57476945f8e6688b73636089566a4833b870ead3fbf1369fb447d55d"

RPROVIDES:${PN} += "libOpenImageIO.so.2.4()(64bit) libOpenImageIO2_4 libOpenImageIO2_4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libIex-3_1.so.30()(64bit) libImath-3_1.so.29()(64bit) libOpenColorIO.so.2.1()(64bit) libOpenEXR-3_1.so.30()(64bit) libOpenEXRCore-3_1.so.30()(64bit) libOpenImageIO_Util.so.2.4()(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdcmdata.so.17()(64bit) libdcmimage.so.17()(64bit) libdcmimgle.so.17()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgif.so.7()(64bit) libheif.so.1()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) liboflog.so.17()(64bit) libofstd.so.17()(64bit) libopencv_core.so.407()(64bit) libopencv_imgproc.so.407()(64bit) libopencv_videoio.so.407()(64bit) libopenjp2.so.7()(64bit) libopenvdb.so.9.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpugixml.so.1()(64bit) libraw_r.so.23()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) libtbb.so.12()(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libtiff.so.6(LIBTIFF_4.1)(64bit) libwebp.so.7()(64bit) libwebpdemux.so.2()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
