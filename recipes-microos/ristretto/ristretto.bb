SUMMARY = "Image viewer for the Xfce Desktop Environment"
DESCRIPTION = "The Ristretto Image Viewer is an application that can be used to \
view, and scroll through images. \
 \
It can be used to run a slideshow of images, open images with other \
applications like an image editor or configure an image as the \
desktop wallpaper."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.1"

RPM_NAME = "ristretto-0.13.1-1.1.aarch64.rpm"
RPM_HASH = "d3036c1bd0e8b6f5a1cacab0e303038f93e6b123542cebad07e6d7f9ace71aab252ccb858508ecb11fcc690a546f5ec830ee9cbee07f4813a6793c4ce8c00364"

RPROVIDES:${PN} += "application() \
application(org.xfce.ristretto.desktop) \
metainfo() \
metainfo(org.xfce.ristretto.appdata.xml) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/x-cmu-raster) \
mimehandler(image/x-ico) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-sun-raster) \
mimehandler(image/x-tga) \
mimehandler(image/x-win-bitmap) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
mimehandler(image/x-xpm) \
ristretto \
ristretto(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libexif.so.12()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmagic.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit)"

inherit rpm
