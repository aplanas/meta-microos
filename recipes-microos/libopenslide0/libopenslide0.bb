SUMMARY = "C library for reading virtual slides"
DESCRIPTION = "The OpenSlide library allows programs to access virtual slide files \
regardless of the underlying image format."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "libopenslide0-3.4.1-2.25.aarch64.rpm"
RPM_HASH = "97e7c3d3757b058cce074276301bf5e37d1c87619ca68a8150bbbee97e9b668a4b49857fe2de5a842633c5690bdb7574f16d84795d4c3cf5a84646237a041d13"

RPROVIDES:${PN} += "libopenslide.so.0()(64bit) \
libopenslide0 \
libopenslide0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libopenjp2.so.7()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsqlite3.so.0()(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
libz.so.1()(64bit)"

inherit rpm
