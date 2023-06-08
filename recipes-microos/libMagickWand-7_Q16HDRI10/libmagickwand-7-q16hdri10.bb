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

RPM_NAME = "libMagickWand-7_Q16HDRI10-7.1.1.8-1.1.aarch64.rpm"
RPM_HASH = "46e5fb4d0fb2bc2db3b68ec4020b3b0c006160dfe1395dd6a9e211122c5a1f16fdd36843b570c951981c488c11719e19268ffff99b28d1be78080e10fdf5af5b"

RPROVIDES:${PN} += "libMagickWand-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) libMagickWand-7_Q16HDRI10 libMagickWand-7_Q16HDRI10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagickCore-7.Q16HDRI.so.10()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
