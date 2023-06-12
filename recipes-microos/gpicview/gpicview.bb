SUMMARY = "LXDE Photo Viewer"
DESCRIPTION = "An extremely fast, lightweight, yet feature-rich photo viewer. \
This software is part of the LXDE Desktop Environment."
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "gpicview-0.2.5-2.16.aarch64.rpm"
RPM_HASH = "7688ba2e9755190ff8a8244847ac03160bc8c14c441aedb9746974bcd0d92353caa0a0bede69fb9068ed4535c814833951667538675b59b27cad732dafdbe703"

RPROVIDES:${PN} += "application() \
application(gpicview.desktop) \
gpicview \
gpicview(aarch-64) \
mimehandler(application/pcx) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/svg-xml) \
mimehandler(image/tiff) \
mimehandler(image/x-bmp) \
mimehandler(image/x-pcx) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-greymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-targa) \
mimehandler(image/x-tga)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
