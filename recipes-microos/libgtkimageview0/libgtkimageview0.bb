SUMMARY = "Library providing an advanced widget for GdkPixbuf"
DESCRIPTION = "GtkImageView is a widget that provides a zoomable and panable view of a \
GdkPixbuf. It is intended to be usable in most types of image viewing \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6.4"

RPM_NAME = "libgtkimageview0-1.6.4-22.21.aarch64.rpm"
RPM_HASH = "3284db04a6d3e6542992c108a9476cfa8c025ecf00ddcb828bc0282c75603b64c34cb8d5488984f0efa30ec4d8947bef25aebdbfef1b318bf5b97da2c5a469d4"

RPROVIDES:${PN} += "libgtkimageview.so.0()(64bit) libgtkimageview0 libgtkimageview0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
