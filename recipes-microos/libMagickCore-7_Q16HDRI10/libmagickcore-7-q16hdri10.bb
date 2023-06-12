SUMMARY = "C runtime library for ImageMagick"
DESCRIPTION = "ImageMagick is a robust collection of tools and libraries to read, \
write, and manipulate an image in many image formats, including popular \
formats like TIFF, JPEG, PNG, PDF, PhotoCD, and GIF. With ImageMagick, \
you can create images dynamically, making it suitable for Web \
applications. You can also resize, rotate, sharpen, color-reduce, or \
add special effects to an image and save your completed work in many \
different image formats. Image processing operations are available from \
the command line as well as through C, C++, and Perl-based programming \
interfaces."
LICENSE = "ImageMagick"

PV = "7.1.1.11"

RPM_NAME = "libMagickCore-7_Q16HDRI10-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "9e8c2fd9e938a29eb6b43500d363e168d3c52dbe0642ed871853e9a6eca3b0b4c27495272f03626afc6bb35a36b703e36754e5bedb04f28fb84c34d12c7d2e57"

RPROVIDES:${PN} += "libMagickCore-7.Q16HDRI.so.10()(64bit) \
libMagickCore-7_Q16HDRI10 \
libMagickCore-7_Q16HDRI10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
imagick-config-7 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfftw3.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libheif.so.1()(64bit) \
libjbig.so.2()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libjxl_threads.so.0.8()(64bit) \
libjxl_threads.so.0.8(JXL_0)(64bit) \
liblcms2.so.2()(64bit) \
liblqr-1.so.0()(64bit) \
libltdl.so.7()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libraw_r.so.23()(64bit) \
librsvg-2.so.2()(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libtiff.so.6(LIBTIFF_4.1)(64bit) \
libtiff.so.6(LIBTIFF_4.2)(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
