SUMMARY = "Perl interface for the GraphicsMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package contains perl interface to GraphicsMagick library."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "perl-GraphicsMagick-1.3.40-2.3.aarch64.rpm"
RPM_HASH = "a2f4494ee2c3d43f4ec47d93b5841d84f7523d46d78df157027b9bfd5063e3c368654d4212ece82171b01c172efa345b7a6e9bed67c4099cf84937980aefa9cd"

RPROVIDES:${PN} += "perl(Graphics::Magick) perl-GraphicsMagick perl-GraphicsMagick(aarch-64)"
RDEPENDS:${PN} += "GraphicsMagick ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGraphicsMagick-Q16.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) perl"

inherit rpm
