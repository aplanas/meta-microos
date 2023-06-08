SUMMARY = "Development files for ImageMagick's C++ interface"
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

PV = "7.1.1.8"

RPM_NAME = "libMagick++-devel-7.1.1.8-1.1.aarch64.rpm"
RPM_HASH = "1d4e95dc0e1ae82e10a0d012499ea7eaca6f0ecbd292055af319a5d012ada245c91492fbc1d9a226537c00318ef7894d46b31cd72d2fa7f217620d8a1cfeb05e"

RPROVIDES:${PN} += "libMagick++-devel libMagick++-devel(aarch-64) pkgconfig(Magick++) pkgconfig(Magick++-7.Q16HDRI)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libMagick++-7_Q16HDRI5 libstdc++-devel pkgconfig(ImageMagick) pkgconfig(MagickWand-7.Q16HDRI)"

inherit rpm
