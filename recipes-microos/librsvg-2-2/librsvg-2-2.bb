SUMMARY = "A Library for Rendering SVG Data"
DESCRIPTION = "This package contains a library to render SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "Apache-2.0 & LGPL-2.0-or-later & MIT"

PV = "2.56.0"

RPM_NAME = "librsvg-2-2-2.56.0-3.1.aarch64.rpm"
RPM_HASH = "bbf1c7afeaa3f8011b3b69b8a35fdda8b0a6bb1df13a406a784ce1c556a4c2e98253869e439c94f8681fb9e80f5efb213c2c7a386ff4700c6f8b7c2df6059692"

RPROVIDES:${PN} += "librsvg librsvg-2-2 librsvg-2-2(aarch-64) librsvg-2.so.2()(64bit) librsvg2"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.0)(64bit)"

inherit rpm
