SUMMARY = "Thumbnail Management for Xfce"
DESCRIPTION = "Tumbler is a D-Bus service for applications to request thumbnails for various \
URI schemes and MIME types. It is an implementation of the thumbnail management \
D-Bus specification described on http://live.gnome.org/ThumbnailerSpec and \
extensible through a plugin interface or via specialized thumbnailer services \
implemented in accordance to the thumbnail management D-Bus specification."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "tumbler-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "c71198b1b09a147cd34f18725973712af2ed6e4a36dee8a128b87d19db534578873486caf80a50b29b3c1c21a94f09a584c4798d9ea2efea61ea68911b978c37"

RPROVIDES:${PN} += "config(tumbler) tumbler tumbler(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcurl.so.4()(64bit) libfreetype.so.6()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgepub-0.7.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsf-1.so.114()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libopenrawgnome.so.9()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpoppler-glib.so.8()(64bit) libtumbler-1-0 libtumbler-1.so.0()(64bit) libxfce4util.so.7()(64bit)"

inherit rpm
