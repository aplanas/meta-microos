SUMMARY = "Library implementing a webcam booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "libcheese8-44.0.1-1.1.aarch64.rpm"
RPM_HASH = "ee80bb44237e96fb6855518132d50072b36356dbda97cdae7e90ccc448efcf66fec3c7595ae6389a346e2b7a27a9dc2faf6ec6fc9929064f5783abe1ba33cd4e"

RPROVIDES:${PN} += "libcheese.so.8()(64bit) libcheese8 libcheese8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-bad gstreamer-plugins-good ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcheese-common libclutter-1.0.so.0()(64bit) libclutter-gst-3.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
