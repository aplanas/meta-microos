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

PV = "7.1.1.8"

RPM_NAME = "libMagickCore-7_Q16HDRI10-7.1.1.8-1.1.aarch64.rpm"
RPM_HASH = "c228461a5407c7fe501aa30e3f45cfd3aa3bf4f3a00ef8847d15eacde7a016c1bf36ff03acae9b973f1248247ab3ef27b6965b6c56ee807a00ba0a70cfa25a9e"

RPROVIDES:${PN} += "libMagickCore-7.Q16HDRI.so.10()(64bit) libMagickCore-7_Q16HDRI10 libMagickCore-7_Q16HDRI10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig imagick-config-7 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenEXR-3_1.so.30()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfftw3.so.3()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libheif.so.1()(64bit) libjbig.so.2()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libjxl.so.0.8()(64bit) libjxl.so.0.8(JXL_0)(64bit) libjxl_threads.so.0.8()(64bit) libjxl_threads.so.0.8(JXL_0)(64bit) liblcms2.so.2()(64bit) liblqr-1.so.0()(64bit) libltdl.so.7()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libraw_r.so.23()(64bit) librsvg-2.so.2()(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libtiff.so.6(LIBTIFF_4.1)(64bit) libtiff.so.6(LIBTIFF_4.2)(64bit) libwebp.so.7()(64bit) libwebpdemux.so.2()(64bit) libwebpmux.so.3()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit)"

inherit rpm
