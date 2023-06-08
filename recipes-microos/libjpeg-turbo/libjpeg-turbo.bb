SUMMARY = "A SIMD-accelerated library for manipulating JPEG image files"
DESCRIPTION = "The libjpeg-turbo package contains a library of functions for manipulating \
JPEG images. It supports architecture-specific SIMD instructions, \
such as SSE/SSE2/AVX2, AltiVec, NEON, MIPS DSPR2, and Loongson MMI. \
 \
It also includes the following command line utilities: \
  djpeg - decompress a JPEG file to an image file \
  jpegtran - lossless transformation of JPEG files \
  rdjpgcom - display text comments from a JPEG file \
  wrjpgcom - insert text comments into a JPEG file \
  tjbench - a JPEG decompression/compression benchmark"
LICENSE = "BSD-3-Clause"

PV = "2.1.5.1"

RPM_NAME = "libjpeg-turbo-2.1.5.1-75.1.aarch64.rpm"
RPM_HASH = "7a37424f7508d5425bea082e69294a2943c73ea45a4ecaed6ba7f9cda506dbd3d02c2aedfe6229f0f7d9427c856b26f81e627c8e42f1bf36f93a9f3f4781b49b"

RPROVIDES:${PN} += "jpeg jpegtran libjpeg-turbo libjpeg-turbo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libturbojpeg.so.0()(64bit) libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) libturbojpeg.so.0(TURBOJPEG_1.2)(64bit) libturbojpeg.so.0(TURBOJPEG_1.4)(64bit) libturbojpeg.so.0(TURBOJPEG_2.0)(64bit)"

inherit rpm
