SUMMARY = "Runtime library for the GraphicsMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package is compiled with Q16, that means it provides better \
performance on 16 and less bit images."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "libGraphicsMagickWand-Q16-2-1.3.40-2.3.aarch64.rpm"
RPM_HASH = "534b3134e6bd572dd4641bfacb2d726a7fd78d5152f35e0802f8852a189b77f77a6d323277b7a194fb14a3e449e95eccfda7a6480dd657bacf0e384eaaa90fd7"

RPROVIDES:${PN} += "libGraphicsMagickWand-Q16-2 \
libGraphicsMagickWand-Q16-2(aarch-64) \
libGraphicsMagickWand-Q16.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGraphicsMagick-Q16.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
