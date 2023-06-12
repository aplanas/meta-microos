SUMMARY = "C++ interface runtime library for ImageMagick"
DESCRIPTION = "This is Magick++, the object-oriented C++ API for the ImageMagick \
image-processing library. \
 \
Magick++ supports an object model inspired by PerlMagick. Magick++ \
should be faster than PerlMagick since it is written in a compiled \
language which is not parsed at run-time. This makes it suitable for \
Web CGI programs. Images support implicit reference counting so that \
copy constructors and assignment incur almost no cost. The cost of \
actually copying an image (if necessary) is done just before \
modification and this copy is managed automatically by Magick++. \
De-referenced copies are automatically deleted. The image objects \
support value (rather than pointer) semantics so it is trivial to \
support multiple generations of an image in memory at one time."
LICENSE = "ImageMagick"

PV = "7.1.1.11"

RPM_NAME = "libMagick++-7_Q16HDRI5-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "0e6b220dcecde40b1707ea595cbccfc71c22c9e34e2747ba7ad9654c2c7710bb5259342ee172d81107664bff8fe23398bde5cc04debea8d5e9000d39e1479c00"

RPROVIDES:${PN} += "libMagick++-7.Q16HDRI.so.5()(64bit) \
libMagick++-7_Q16HDRI5 \
libMagick++-7_Q16HDRI5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ImageMagick \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMagickCore-7.Q16HDRI.so.10()(64bit) \
libMagickWand-7.Q16HDRI.so.10()(64bit) \
libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
