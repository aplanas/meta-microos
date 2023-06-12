SUMMARY = "Painting program for creating icons and pixel-based artwork"
DESCRIPTION = "mtPaint is a painting program designed for creating icons and \
pixel-based artwork. It can edit indexed palette or 24 bit RGB images \
and offers basic painting and palette manipulation tools. Its main \
file format is PNG, although it can also handle JPEG, GIF, TIFF, BMP, \
XPM, and XBM files."
LICENSE = "GPL-3.0-or-later"

PV = "3.50"

RPM_NAME = "mtpaint-3.50-1.10.aarch64.rpm"
RPM_HASH = "4d506be00915dacc0695a1434ed73e116541d60871b58c5dc96abc93f639c08782c33380b9f71713a5513360100cd956bd39b3a00884c6649f2ffb5fc1b6afae"

RPROVIDES:${PN} += "application() \
application(mtpaint.desktop) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/svg) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/x-bmp) \
mimehandler(image/x-ms-bmp) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-tga) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xbm) \
mimehandler(image/x-xpixmap) \
mimehandler(image/x-xpm) \
mimehandler(image/xbm) \
mimehandler(image/xpm) \
mtpaint \
mtpaint(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ImageMagick \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgif.so.7()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenjp2.so.7()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libwebp.so.7()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
